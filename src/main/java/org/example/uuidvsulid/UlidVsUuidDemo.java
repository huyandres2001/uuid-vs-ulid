package org.example.uuidvsulid;


import com.github.f4b6a3.ulid.UlidCreator;

import java.sql.*;
import java.util.UUID;


public class UlidVsUuidDemo {
    private static final int TOTAL_RECORDS = 2_000_000; // Increased from 5M to 10M as requested

    private static final int BATCH_SIZE = 100_000;

    private static final String DB_URL = "jdbc:oracle:thin:@192.168.134.150:1521:WECOMMIT";

    private static final String USER = "SYS AS SYSDBA";

    private static final String PASS = "Wecommit100x";

    public static void main(String[] args) throws Exception {
        System.out.println("Starting benchmark for UUID vs ULID");
        System.out.println("Total records to insert: " + TOTAL_RECORDS);
        System.out.println("Batch size: " + BATCH_SIZE);

        // Parse command line arguments if any

        String testType = args.length > 0 ? args[0].toUpperCase() : "BOTH";

        if ("UUID".equals(testType) || "BOTH".equals(testType)) {
            System.out.println("\n=============================================");
            System.out.println("RUNNING UUID TEST");
            System.out.println("=============================================");
            runTest("UUID", TOTAL_RECORDS, BATCH_SIZE);
        }
        if ("ULID".equals(testType) || "BOTH".equals(testType)) {
            System.out.println("\n=============================================");
            System.out.println("RUNNING ULID TEST");
            System.out.println("=============================================");
            runTest("ULID", TOTAL_RECORDS, BATCH_SIZE);
        }


    }

    private static void runTest(String testType, int totalRecords, int batchSize) throws Exception {
        Connection conn = null;
        try {
            // Establish connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false);


            // Prepare optimized insert statement with bind variables
            String sql = "INSERT INTO DEMO_" + testType + " VALUES (?)";
            long startTimeMillis = System.currentTimeMillis();
            long lastProgressTime = startTimeMillis;

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                for (int i = 0; i < totalRecords; i++) {
                    // Generate ID based on test type
                    String id;
                    if (testType.equals("UUID")) {
                        id = UUID.randomUUID().toString();
                    } else {
                        id = UlidCreator.getUlid().toString();
                    }

                    pstmt.setString(1, id);
                    pstmt.addBatch();

                    // Execute batch when batch size is reached
                    if ((i + 1) % batchSize == 0) {
                        pstmt.executeBatch();
                        conn.commit();

                        // Print progress with insertion rate
                        long currentTime = System.currentTimeMillis();
                        long elapsedSinceLast = currentTime - lastProgressTime;
                        double ratePerSecond = batchSize / (elapsedSinceLast / 1000.0);

                        System.out.printf(
                                "Inserted %,d of %,d records (%.2f%%) - %.2f records/sec%n",
                                (i + 1), totalRecords, (i + 1) * 100.0 / totalRecords, ratePerSecond
                        );

                        lastProgressTime = currentTime;
                    }
                }

                // Insert any remaining records
                pstmt.executeBatch();
                conn.commit();
            }

            long endTimeMillis = System.currentTimeMillis();
            double totalSeconds = (endTimeMillis - startTimeMillis) / 1000.0;
            double avgRate = totalRecords / totalSeconds;

            System.out.printf(
                    "\nInsert completed in %.2f seconds (avg: %.2f records/sec)%n",
                    totalSeconds, avgRate
            );
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();

        } finally {
            // Close connection
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}

