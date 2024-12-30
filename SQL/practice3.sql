CREATE DATABASE test3;

USE test3;

CREATE TABLE student(
id INT PRIMARY KEY,
name VARCHAR(30),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(20) 
);

INSERT INTO student(id, name, marks, grade, city)
VALUES
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "cheta", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 92, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi");

SELECT * FROM student;

truncate TABLE student;


SELECT AVG(marks)
FROM student; 

SELECT name, marks
FROM student
WHERE marks > 87.6667;


--  WHERE SUB QUEREIES

SELECT name, marks
FROM student
WHERE marks > (SELECT AVG(marks) FROM student);

SELECT id, name, marks
FROM student
WHERE id % 2 = 0;


SELECT MAX(marks)
FROM student
WHERE city = "Delhi";

SELECT * 
FROM student
WHERE city = "Delhi";

-- FROM SUB QUERY

SELECT MAX(marks)
FROM(SELECT * FROM student WHERE city = "Delhi") AS temp; 


-- VIEW 

CREATE VIEW data1 AS
SELECT id, name, marks
FROM student;  

SELECT * FROM data1;

DROP VIEW data1;