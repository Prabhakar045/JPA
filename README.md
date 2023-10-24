# Java_pro_JEE
Java-Pro-JEE

DataBase 

use bookmyshow;
CREATE TABLE movie_tickets1 (
    id INT PRIMARY KEY,
    movie_name VARCHAR(55), 
    movie_language ENUM('English', 'Hindi', 'Kannada', 'Marathi'),
    location VARCHAR(100), 
    price DECIMAL(10, 2), 
    no_of_tickets INT,
    theater_name VARCHAR(255), 
    timings varchar(30) 
);


select * from movie_tickets1;
