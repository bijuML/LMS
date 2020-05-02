DROP TABLE IF EXISTS library;
DROP TABLE IF EXISTS book;

CREATE TABLE library (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  library_name VARCHAR(250) NOT NULL,
  library_librarian_name VARCHAR(250) NOT NULL,
  library_phone VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO library (library_name, library_librarian_name, library_phone) VALUES
  ('Library A', 'Ramesh', '123-123-1234'),
  ('Library B', 'Rajesh', '987-654-3210'),
  ('Library C', 'Rakesh', '234-123-1234');
  
  CREATE TABLE book (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  library_id INT NOT NULL,
  book_title VARCHAR(250) NOT NULL,
  book_isbn VARCHAR(250) NOT NULL,
  book_author VARCHAR(250) DEFAULT NULL,
  foreign key (library_id) references library(id)
);

INSERT INTO book (library_id, book_title, book_isbn, book_author) VALUES
  (1, 'Thinking In Java', 'I123', 'Austin'),
  (1, 'OOPS', 'I123', 'Jody'),
  (2, 'Thinking In C++', 'I234', 'James'),
  (3, 'Thinking In Python', 'I345', 'Cooper'),
  (3, 'Thinking In Javascript', 'I345', 'Wendy');