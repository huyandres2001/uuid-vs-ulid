```sql
create table DEMO_ULID
(
  ULID VARCHAR2(26)
)
/

create index ULID_INDEX
  on DEMO_ULID (ULID)
/
create table DEMO_UUID
(
    UUID VARCHAR2(36)
)
    /

create index UUID_INDEX
    on DEMO_UUID (UUID)
    /
```