CREATE DATABASE test2;

USE test2;

CREATE TABLE students(
id INT PRIMARY KEY,
name VARCHAR(20)
);

INSERT INTO students(id, name)
VALUES
(101, "Adam"),
(102, "Bob"),
(103, "Casey");

CREATE TABLE cources(
id INT PRIMARY KEY,
course VARCHAR(30)
);

INSERT INTO cources(id, course) 
VALUES
(102, "English"),
(105, "Maths"),
(103, "Science"),
(107, "Computer Science");

SELECT students.id, name, course
FROM students
INNER JOIN cources
ON students.id = cources.id;

SELECT *
FROM students
LEFT JOIN cources
ON students.id = cources.id;

-- FULL JOIN

SELECT *
FROM students
LEFT JOIN cources
ON students.id = cources.id
UNION
SELECT *
FROM students
RIGHT JOIN cources
ON students.id = cources.id; 

-- LEFT EXCLUSIVE ONLY
SELECT *
FROM students as a
LEFT JOIN cources as b
ON a.id = b.id
WHERE b.id IS NULL;

--  RIGHT EXCLUSIVE ONLY 

SELECT *
FROM students as a
RIGHT JOIN cources as b
ON a.id = b.id
WHERE a.id IS NULL;

-- FULL EXCLUSIVE JOIN ONLY

SELECT * 
FROM students as s
LEFT JOIN cources as c
ON s.id = c.id
WHERE c.id IS NULL
UNION
SELECT *
FROM students as s
RIGHT JOIN cources as c
ON s.id = c.id
WHERE s.id IS NULL;

-- SELF JOIN

CREATE TABLE emp(
id INT PRIMARY KEY,
name VARCHAR(20),
manager_id INT
); 

INSERT INTO emp(id, name, manager_id)
VALUES
(101, "adam", 103),
(102, "bob", 104),
(103, "casey", NULL),
(104, "donald", 103);

SELECT * FROM emp;


SELECT *
FROM emp as a
JOIN emp as b
ON a.id  = b.manager_id;

SELECT a.name as manager_name, b.name
FROM emp as a
JOIN emp as b
ON a.id  = b.manager_id;

-- UNION

SELECT name FROM emp
UNION
SELECT name FROM emp 