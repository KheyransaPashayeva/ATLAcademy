create table Book(
                     id serial primary key ,
                     title varchar(50) not null unique ,
                     author varchar(30) not null ,
                     publisher varchar(70) not null ,
                     publicationYear date not null ,
                     numberOfCopiesInTheLibrary integer

);


SELECT *
FROM Reader;

create table Reader(
                       id serial primary key ,
                       firstname varchar(50) not null,
                       lastname varchar(30) not null ,
                       address varchar(70) not null ,
                       email varchar(30) not null unique
);

create table Genre(
                      id serial primary key ,
                      genrename varchar(50) not null
);

create table Author(
                       id serial primary key ,
                       firstname varchar(50) not null,
                       lastname varchar(30) not null ,
                       birthYear date not null ,
                       deathYear date
);

create table Loan(
                     id serial primary key ,
                     bookId integer,
                     readerId integer,
                     loanDate date not null ,
                     returnDate date,
                     FOREIGN KEY (bookId) REFERENCES Book(id),
                     FOREIGN KEY (readerId) REFERENCES Reader(id)

);

create table Authorship(
                           id serial primary key ,
                           bookId integer,
                           authorId integer,
                           FOREIGN KEY (bookId) REFERENCES Book(id),
                           FOREIGN KEY (authorId) REFERENCES Author(id)
);

create table GenreAssignment(
                                id serial primary key ,
                                bookId integer,
                                genreId integer,
                                FOREIGN KEY (bookId) REFERENCES Book(id),
                                FOREIGN KEY (genreId) REFERENCES Genre(id)
);

insert into Book(title, author, publisher, publicationYear, numberOfCopiesInTheLibrary)
values ('A Tale of Two Cities', ' Charles Dickens', 'Chapman & Hall', '1775-05-30', 500),
       ('The Hound of the Baskervilles', 'Arthur Conan Doyle', 'George Newnes Ltd', '1902-04-25', 250),
       ('War and Peace', 'Leo Tolstoy', ' Russian Messenger', '1867-01-01', 200),
       ('Oliver Twist', ' Charles Dickens', 'Richard Bentley', '1839-04-28', 300),
       ('Animal Farm', 'George Orwell', 'Secker and Warburg', '1945-08-18', 500);

INSERT INTO Reader (firstname, lastname, address, email)
VALUES ('Johxn', 'Doef', '5551vvv234', 'johen@gmail.com'),
       ('Jxane', 'Smifth', '55556v78', 'janbbe@gmail.com'),
       ('Alisxa', 'Wonvder', '5551343vbn', 'abblisa@gmail.com'),
       ('Xeyransa','Pashayeva','xezer rayon','xeyransa.pashayeva@gmail.com');

insert into Genre(genrename)
values ('war'),
       ('detective'),
       ('historical friction'),
       ('fiction'),
       ('satire');

insert into Author (firstname, lastname, birthYear, deathYear)
VALUES ('Charles', 'Dickens', '2023-06-01', '1945-08-18'),
       ('Arthur', 'Conan', '1867-01-01', '2023-06-01'),
       ('Leo', 'Tolstoy', '1945-08-18', '1945-08-18'),
       ('George', 'Orwell', '1867-01-01', '1945-08-18');

insert into Loan(bookId, readerId, loanDate, returnDate)
VALUES (2, 1, '2023-05-07', '2023-06-01'),
       (1, 3, '2023-07-01', null),
       (5, 2, '2023-07-10', null);

insert into Authorship(bookId, authorId)
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 1),
       (5, 4);

insert into GenreAssignment (bookId, genreId)
VALUES (1, 3),
       (2, 2),
       (3, 1),
       (4, 4);
-- Wright SQL for the followings:
--  Query for adding a new book.
insert into Book(title, author, publisher, publicationYear, numberOfCopiesInTheLibrary)
values ('Bridgerton', ' Charles Dickens', 'Chapman & Hall', '1779-05-30', 300);

--  Query for registering a new reader.
INSERT INTO Reader (firstname, lastname, address, email)
VALUES ('Inci', 'Pashayeva', 'Baku,3456', 'inci@gmail.com');

--  Query for issuing a book to a reader.
insert into Loan(bookId, readerId, loanDate, returnDate)
VALUES (1, 1, '2024-05-07', null);

--  Query for returning a book from a reader.
UPDATE Loan
SET returnDate = '2024-06-10'
WHERE bookId = 1 AND readerId = 1 AND returnDate IS NULL;

--  Query for searching books based on various criteria.
SELECT *
FROM Book
WHERE title LIKE '%of%'
  AND author LIKE '%a%'
  AND publicationYear = '1902-04-25';

--  Query for searching currently available books.
SELECT *
FROM Book
LEFT JOIN Loan
ON Book.id = Loan.bookId AND Loan.returnDate IS NULL
WHERE Loan.bookId IS NULL;

--  Query for searching popular books among readers.
SELECT b.*, COUNT(l.id) AS loan_count
FROM Book b
JOIN Loan l ON b.id = l.bookId
GROUP BY b.id
ORDER BY loan_count DESC;

--  Query for searching books read by a specific reader.
SELECT b.*
FROM Book b
JOIN Loan l ON b.id = l.bookId
WHERE l.readerId = 1;

--  Query for searching books written by a specific author.
SELECT b.*
FROM Book b
         JOIN Authorship A on b.id = A.bookId
         JOIN Author Au on Au.id = A.authorId
WHERE au.firstname='Charles' and au.lastname='Dickens';

--  Query for updating book information.
UPDATE Book
SET title = 'Leyli ile Mecnun',
    author = 'Nizami Gencevi',
    publisher = 'Baku nesr',
    publicationYear = '1188-12-01',
    numberOfCopiesInTheLibrary = 10
WHERE id = 1;

--  Query for deleting a book from the library.
DELETE FROM Book
WHERE id = 6;
--  Query for searching books by genre.
SELECT b.*
FROM Book b
         JOIN GenreAssignment GA on b.id = GA.bookId
         JOIN Genre G on G.id = GA.genreId
WHERE genrename='detective';

--  Query for calculating the total number of books borrowed by a reader.
-- iki cur ola biler umumen verilen ve hal hazirda verilib geri qytarilmayanlar
SELECT count(l.id) As total_borrewed
FROM Loan l
WHERE returnDate is null ;

SELECT count(l.id) As total_borrewed
FROM Loan l;
--  Query for finding the most borrowed book in the library.
SELECT b.*, COUNT(l.id) AS borrow_count
FROM Book b
         LEFT JOIN Loan l ON b.id = l.bookId
GROUP BY b.id
ORDER BY borrow_count DESC
    LIMIT 1;

--  Query for updating reader information
UPDATE Reader
SET address = '123 Updated Address Blvd',
    email = 'inci.pasha.email@gmail.com'
WHERE email = 'inci@gmail.com';