CREATE table Products(
                         id serial primary key ,
                         name varchar(50) not null,
                         price DECIMAL(10, 2),
                         quantity integer,
                         description text,
                         category_id integer,
                         FOREIGN KEY (category_id) REFERENCES Categories(id)
);

CREATE table Categories(
                           id serial primary key ,
                           name varchar(69)
);

CREATE table Customers(
                          id serial primary key ,
                          lastname varchar(50) not null,
                          firstname varchar(50) not null,
                          address varchar(80),
                          phone integer
);
ALTER table Customers
    add email varchar(70);

CREATE table Orders(
                       id serial primary key ,
                       order_date date,
                       customer_id integer,
                       FOREIGN KEY (customer_id) REFERENCES Customers(id)
);

CREATE table OrderDetails(
                             id serial primary key ,
                             order_id integer,
                             product_id integer,
                             quantity integer,
                             FOREIGN KEY (order_id) REFERENCES Orders(id),
                             FOREIGN KEY (product_id) REFERENCES Products(id)
);

INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product A', 10.99, 10, 'Modern'),
       ('Product B', 25.99, 20, 'New'),
       ('Product C', 5.99, 25, 'Ancient');

insert into Categories (Name)
values ('Electronics'),
       ('Home & Garden'),
       ('Books');

INSERT INTO Customers (FirstName, LastName, Address, email, phone)
VALUES ('Bob', 'Carlos', 'Germany', 'info@acme.com', 123 - 456 - 7890),
       ('John', 'Wilson', 'England', 'info@xyz.com', 987 - 654 - 3210),
       ('Mike', 'Corleone', 'Italy', 'info@abc.com', 555 - 555 - 5555);

insert into Orders (customer_id, order_date)
values (1, '2023-06-01'),
       (2, '2023-06-05'),
       (3, '2023-06-10');

insert into OrderDetails (order_id, product_id, Quantity)
values (1, 3, 8),
       (2, 1, 5),
       (3, 1, 10);

-- Get a list of all products.
SELECT *
FROM Products;

-- • Get a list of all categories of products.
SELECT p.* ,Categories.name
FROM Categories
JOIN Products P on Categories.id = P.category_id;

-- • Get a list of all customers.
SELECT *
FROM Customers;

-- • Get a list of all orders.
SELECT *
FROM Orders;

-- • Get a list of all order details.
SELECT *
FROM OrderDetails;

-- • Get information about a specific product by its ID.
SELECT p.*
FROM Products p
WHERE p.id=1;

-- • Get a list of products in a specific category.
SELECT p.*
FROM Products p
JOIN Categories C on C.id = p.category_id
WHERE C.id=1;

-- • Get information about a customer by their ID.
SELECT c.*
FROM Customers c
WHERE c.id=1;

-- • Get a list of orders for a specific customer.
SELECT o.*
FROM Orders o
JOIN Customers C on C.id = o.customer_id
WHERE C.id=1;

-- • Get a list of order details for a specific order.
SELECT od.*
FROM OrderDetails od
JOIN Orders O on O.id = od.order_id
WHERE O.id=2;

-- • Update the price of a product by its ID.
UPDATE Products
SET price=10.99
where id=2;

--       • Add a new product.
INSERT INTO Products (Name, Price, Quantity, Description)
VALUES ('Product D', 200, 10, 'Modern');

--       • Delete a product by its ID.
DELETE FROM Products
WHERE id=2;