# 1st time
```
Starting benchmark for UUID vs ULID
Total records to insert: 2000000
Batch size: 100000

=============================================
RUNNING UUID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 47014.57 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 44326.24 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 47551.12 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 44762.76 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 47755.49 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 45248.87 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 42158.52 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 46317.74 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 47824.01 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 48007.68 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 43859.65 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 23164.23 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 19116.80 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 19091.26 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 19149.75 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 20420.67 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 15627.44 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 22104.33 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 22436.62 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 21862.70 records/sec

Insert completed in 68.88 seconds (avg: 29038.11 records/sec)
Database connection closed.

=============================================
RUNNING ULID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 69108.50 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 60168.47 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 60606.06 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 55524.71 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 57142.86 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 63211.13 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 59559.26 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 48076.92 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 25967.28 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 26737.97 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 27107.62 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 26666.67 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 27693.16 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 27593.82 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 26997.84 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 25720.16 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 25451.77 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 27240.53 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 25575.45 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 24906.60 records/sec

Insert completed in 59.04 seconds (avg: 33878.21 records/sec)
Database connection closed.

```
# 2nd time
```
Starting benchmark for UUID vs ULID
Total records to insert: 2000000
Batch size: 100000

=============================================
RUNNING ULID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 63131.31 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 61387.35 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 64850.84 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 64143.68 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 60240.96 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 61500.62 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 20292.21 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 25700.33 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 25207.97 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 26288.12 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 27352.30 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 27609.06 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 27322.40 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 26350.46 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 27487.63 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 26253.61 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 26239.83 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 27188.69 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 27685.49 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 26350.46 records/sec

Insert completed in 63.27 seconds (avg: 31610.06 records/sec)
Database connection closed.

=============================================
RUNNING UUID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 47036.69 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 43572.98 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 47370.91 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 45085.66 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 47573.74 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 21528.53 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 19924.29 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 19018.64 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 21720.24 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 22168.03 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 22768.67 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 20395.68 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 20512.82 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 20145.04 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 19928.26 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 22002.20 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 23288.31 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 22815.42 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 21834.06 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 23736.06 records/sec

Insert completed in 81.06 seconds (avg: 24674.30 records/sec)
Database connection closed.
```
# 3rd time
```
Starting benchmark for UUID vs ULID
Total records to insert: 2000000
Batch size: 100000

=============================================
RUNNING ULID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 62893.08 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 62578.22 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 58616.65 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 60240.96 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 60827.25 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 61236.99 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 61804.70 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 51626.23 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 29708.85 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 29629.63 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 30039.05 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 29325.51 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 28719.13 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 28968.71 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 27548.21 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 28968.71 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 29797.38 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 28409.09 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 30075.19 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 29886.43 records/sec

Insert completed in 54.44 seconds (avg: 36740.39 records/sec)
Database connection closed.

=============================================
RUNNING UUID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 23490.72 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 21547.08 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 23590.47 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 23169.60 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 23832.22 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 23255.81 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 21249.47 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 22522.52 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 23607.18 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 22655.19 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 22507.31 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 21514.63 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 22563.18 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 21477.66 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 22701.48 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 23854.96 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 22893.77 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 23657.44 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 22639.80 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 22993.79 records/sec

Insert completed in 87.88 seconds (avg: 22757.53 records/sec)
Database connection closed.
```
# 4th time
```
Starting benchmark for UUID vs ULID
Total records to insert: 2000000
Batch size: 100000

=============================================
RUNNING UUID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 21706.10 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 22416.50 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 21500.75 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 22163.12 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 21537.80 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 20738.28 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 20977.55 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 21199.92 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 20479.21 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 21934.63 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 19308.75 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 15239.26 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 20618.56 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 21473.05 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 21958.72 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 16183.85 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 20064.21 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 20329.34 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 20631.32 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 21649.71 records/sec

Insert completed in 97.98 seconds (avg: 20412.95 records/sec)
Database connection closed.

=============================================
RUNNING ULID TEST
=============================================
Connecting to database...
Inserted 100,000 of 2,000,000 records (5.00%) - 32722.51 records/sec
Inserted 200,000 of 2,000,000 records (10.00%) - 30129.56 records/sec
Inserted 300,000 of 2,000,000 records (15.00%) - 20981.96 records/sec
Inserted 400,000 of 2,000,000 records (20.00%) - 19531.25 records/sec
Inserted 500,000 of 2,000,000 records (25.00%) - 29868.58 records/sec
Inserted 600,000 of 2,000,000 records (30.00%) - 28320.59 records/sec
Inserted 700,000 of 2,000,000 records (35.00%) - 28280.54 records/sec
Inserted 800,000 of 2,000,000 records (40.00%) - 28587.76 records/sec
Inserted 900,000 of 2,000,000 records (45.00%) - 29603.32 records/sec
Inserted 1,000,000 of 2,000,000 records (50.00%) - 29994.00 records/sec
Inserted 1,100,000 of 2,000,000 records (55.00%) - 29036.00 records/sec
Inserted 1,200,000 of 2,000,000 records (60.00%) - 30003.00 records/sec
Inserted 1,300,000 of 2,000,000 records (65.00%) - 28620.49 records/sec
Inserted 1,400,000 of 2,000,000 records (70.00%) - 29922.20 records/sec
Inserted 1,500,000 of 2,000,000 records (75.00%) - 30515.72 records/sec
Inserted 1,600,000 of 2,000,000 records (80.00%) - 29316.92 records/sec
Inserted 1,700,000 of 2,000,000 records (85.00%) - 30469.23 records/sec
Inserted 1,800,000 of 2,000,000 records (90.00%) - 30238.89 records/sec
Inserted 1,900,000 of 2,000,000 records (95.00%) - 28893.38 records/sec
Inserted 2,000,000 of 2,000,000 records (100.00%) - 29664.79 records/sec

Insert completed in 70.61 seconds (avg: 28324.60 records/sec)
Database connection closed.
```