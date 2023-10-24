# Java_pro_JEE

create database girias;
use girias;

CREATE TABLE girias_product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    brand_name VARCHAR(255),
    color VARCHAR(255),
    material VARCHAR(255),
    manufacturer VARCHAR(255),
    price DOUBLE,
    warranty VARCHAR(255)
);


select * from girias_product;

