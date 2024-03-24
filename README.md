# OrderService

This is a sample spring boot java application that exponses endpoints based on use cases that retrieve order data and customer data for a user  that is stored in cassandra database

### cassandra setup 

Install cassandra database and start follow the below steps to integrate



```


Cassandra  -f

ajaydinakar@Ajays-MacBook-Pro ~ % cqlsh
/usr/local/Cellar/cassandra/4.0.1/libexec/bin/cqlsh.py:460: DeprecationWarning: Legacy execution parameters will be removed in 4.0. Consider using execution profiles.
/usr/local/Cellar/cassandra/4.0.1/libexec/bin/cqlsh.py:490: DeprecationWarning: Setting the consistency level at the session level will be removed in 4.0. Consider using execution profiles and setting the desired consitency level to the EXEC_PROFILE_DEFAULT profile.
Connected to Test Cluster at 127.0.0.1:9042
[cqlsh 6.0.0 | Cassandra 4.0.1 | CQL spec 3.4.5 | Native protocol v5]
Use HELP for help.
cqlsh> create keyspace order_service WITH replication={'class':'SimpleStrategy','replication_factor':'1'} AND durable_writes=true;

cqlsh> describe keyspace order_service

CREATE KEYSPACE order_service WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}  AND durable_writes = true;
cqlsh> use keyspace order_service
   ... ;
Improper use command.
cqlsh> use order_service
   ... ;
cqlsh:order_service> create table customer(id text,name text,phone_no text,PRIMARY KEY(id));
cqlsh:order_service> select * from customer;

 id | name | phone_no
----+------+----------

(0 rows)
cqlsh:order_service> INSERT INTO customer(id,name,phone_no) VALUES('c234567','Tom Hollande','9856789200') IF NOT EXISTS;

 [applied]
-----------
      True

cqlsh:order_service> select * from customer;

 id      | name         | phone_no
---------+--------------+------------
 c234567 | Tom Hollande | 9856789200

(1 rows)
cqlsh:order_service> 


```
