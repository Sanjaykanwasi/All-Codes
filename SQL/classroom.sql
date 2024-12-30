-- DATABASE  

CREATE DATABASE college;

USE college;

-- TABLE Student 
CREATE TABLE student(
id INT PRIMARY KEY,
name VARCHAR(50),
age INT NOT NULL
);

-- DATABASE 2 Kanwasi  
CREATE DATABASE kanwasi;

USE kanwasi;

-- TABLE 
CREATE TABLE employee(
 id INT PRIMARY KEY,
 name VARCHAR(50),
 salary INT
);

INSERT INTO employee(id, name, salary) VALUES
(1, "Adam", 25000),
(2, "bob", 30000),
(3, "casey", 40000);

SELECT * FROM employee;

-- TABLE 
CREATE TABLE emp(
age INT,
city VARCHAR(50),
name VARCHAR(30),
CONSTRAINT age_check CHECK(age>=18 AND city = "Roorkee")
);

INSERT INTO emp(age, city, name) VALUES
(21, "Roorkee", "Sanjay"),
(25, "Roorkee", "Rohit");


-- TABLE 
CREATE TABLE student(
rollno INT PRIMARY KEY,
name VARCHAR(50),
marks INT NOT NULL,
grade VARCHAR(1),
city VARCHAR(30)
);

INSERT INTO student
(rollno, name, marks, grade, city) 
VALUES
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "cheta", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 12, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi");

SELECT * 
FROM student;
SELECT name, marks FROM student;

SELECT * 
FROM student
WHERE marks>80;

SELECT * 
FROM student
WHERE city = "Delhi" AND marks> 80;

SELECT *
FROM student
WHERE marks+10 > 100;

SELECT *
FROM student
Where marks BETWEEN 80 AND 90;

SELECT * 
FROM student
WHERE city IN ("Delhi", "Mumbai");

SELECT *
FROM student
WHERE CITY NOT IN("Delhi", "Mumbai");

SELECT *
FROM student
LIMIT 2;

SELECT *
FROM student
ORDER BY marks ASC;

SELECT *
FROM student
ORDER BY name DESC;

SELECT * 
FROM student
ORDER BY marks DESC
LIMIT 3;

SELECT MAX(marks)
FROM student;

SELECT AVG(marks)
FROM student;

SELECT SUM(marks)
FROM student;

SELECT COUNT(name)
FROM student;

SELECT city, COUNT(name)
FROM student
GROUP BY city;

SELECT name, rollno, COUNT(name)
FROM student
GROUP BY name, rollno;

SELECT city, AVG(marks)
FROM student
GROUP BY city
ORDER BY city ASC;

SELECT city, AVG(marks)
FROM student
GROUP BY city
ORDER BY AVG(marks) DESC;

SELECT city, COUNT(rollno)
FROM student
GROUP BY city
HAVING MAX(marks)>90;

SELECT city, COUNT(rollno)
FROM student
WHERE grade = "A"
GROUP BY city
HAVING MAX(marks) > 95
ORDER BY city ASC;

SET SQL_SAFE_UPDATES = 0;

UPDATE student
SET grade = "O"
WHERE grade = "A";

UPDATE student
SET marks = 98, grade = "A"
WHERE rollno = 105;

UPDATE student
SET marks = marks +2;

UPDATE student
SET marks = 20
WHERE rollno = 105;

DELETE FROM student
WHERE marks < 33;


SELECT * FROM student;

/* PRATICE */ 
CREATE TABLE emp2(
customer_id INT PRIMARY KEY,
customer VARCHAR(30),
mode VARCHAR(30),
city VARCHAR(30)
);

INSERT INTO emp2 
(customer_id, customer, mode, city)
VALUES
(101, "Olivia Barrett", "Netbanking", "Portland"),
(102, "Ethan Sinclair", "Credit Card", "Miami"),
(103, "Maya Hernandez", "Credit Card", "Seattle"),
(104, "Liam Donovan", "Netbanking", "Denver"),
(105, "Sophia Nguyen", "Credit Card", "New Orleans"),
(106, "Caleb Foster", "Debit Card", "Minneapolis"),
(107, "Ava Patel", "Debit Card", "Phoneix"),
(108, "Lucas Carter", "Netbanking", "Boston"),
(109, "Isabella Martinez", "Netbanking", "Nashville"),
(110, "Jackson Brooks", "Credit Card", "Boston");

SELECT * FROM emp2;

SELECT mode, COUNT(customer)
FROM emp2
GROUP BY mode;


-- NEW TABLE 

CREATE TABLE dep(
id INT PRIMARY KEY,
name VARCHAR(20)
);

INSERT INTO dep(id, name)
VALUES
(101, "Physics"),
(102, "Chemistry"),
(103, "Maths"),
(104, "Computer Science"),
(105, "English");

UPDATE dep
SET id = 107
WHERE id = 104;

UPDATE dep
SET id = 109
WHERE name = "Maths";
	
SELECT * FROM dep;

CREATE TABLE teachers(
id INT PRIMARY KEY,
name VARCHAR(20),
dep_id INT,
FOREIGN KEY (dep_id) REFERENCES dep(id)
ON DELETE CASCADE
ON UPDATE CASCADE
);

INSERT INTO teachers(id, name, dep_id)
VALUES
(01, "Shamli", 101),
(02, "Aaru", 102),
(03, "Anuradha", 103),
(04, "Ratish", 104),
(05, "Ritu", 105);

SELECT * FROM teachers;




