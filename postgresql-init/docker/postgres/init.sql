-- create role table
CREATE TABLE IF NOT EXISTS ROLE (
    id INT PRIMARY KEY,
    name VARCHAR(10)
);

-- insert initial default roles
INSERT INTO ROLE (id,name) VALUES (0,'USER'),(1,'ADMIN');
