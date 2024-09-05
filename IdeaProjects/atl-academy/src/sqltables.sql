insert into sales(product, quantity, price)
VALUES ('komputer',60,225.4),
       ('phone',22,100),
       ('tablet',78,200);

SELECT sum(quantity) as total_quantity,
       avg(price) as total_price,product
FROM sales
GROUP BY product;

SELECT sum(price),avg(quantity),min(price),max(quantity),count(product),product
FROM sales
group by id;

CREATE table Expenses(
                         id serial primary key ,
                         category varchar(50),
                         amount decimal
);

insert into Expenses(category,amount )
VALUES ('apple',225.4),
       ('hp',100),
       ('asus',300),
       ('lenovo',200);

SELECT sum(amount) as total_amount,
       avg(amount) as total_amount,category
FROM Expenses
GROUP BY category;

CREATE table Products(
                         id serial primary key ,
                         name varchar(50),
                         price decimal
);
insert into Products(name,price )
VALUES ('apple',225.4),
       ('hp',100),
       ('asus',300),
       ('lenovo',200);


SELECT max(price),min(price),name
FROM Products
GROUP BY name;

CREATE table Students(
                         id serial primary key ,
                         name varchar(50),
                         surname varchar(80),
                         grade_average decimal,
                         age integer
);

insert into Students(name,surname,grade_average,age )
VALUES ('Xeyransa','Pashayeva',70,27),
       ('Gunel','Huseynova',80,24),
       ('Ceyhune','Nebizade',90,24),
       ('Samil','Hesenli',50,27);


CREATE table Grades(
                       id serial primary key ,
                       qrades decimal);

insert into Grades(qrades)
VALUES (70),
       (80),
       (50),
       (90);

SELECT name
from students
where grade_average>(Select avg(qrades) FROM Grades);

CREATE table MaleStudents(
                             id serial primary key ,
                             name varchar(50),
                             surname varchar(80),
                             grade_average decimal,
                             age integer
);
insert into MaleStudents(name,surname,grade_average,age )
VALUES ('Xeyransa','Pashayeva',70,27),
       ('Gunel','Huseynova',80,24),
       ('Ceyhune','Nebizade',90,24),
       ('Samil','Hesenli',50,27);

CREATE table FemaleStudents(
                               id serial primary key ,
                               name varchar(50),
                               surname varchar(80),
                               grade_average decimal,
                               age integer
);
insert into FemaleStudents(name,surname,grade_average,age )
VALUES ('Araz','Pashayev',70,27),
       ('Hesen','Huseynov',80,24),
       ('Nesib','Nebizade',90,24),
       ('Samil','Hesenli',50,27);

SELECT name FROM MaleStudents
UNION
SELECT name FROM FemaleStudents
ORDER BY name;

SELECT * FROM MaleStudents
intersect
SELECT * FROM FemaleStudents
ORDER BY grade_average;

SELECT * FROM MaleStudents
except
SELECT * FROM FemaleStudents
ORDER BY name;