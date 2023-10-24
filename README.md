# Java_pro_JEE
Java-Pro-JEE

create database irctc;
use irctc;

create table irctc_booking(
ticket_id int ,
traveller_name varchar(30),
email varchar(30),
ticket_price decimal(10,2),
from1 varchar(30),
destination varchar(30)
);

select * from irctc_booking;
