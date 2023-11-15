CREATE TABLE myentity
(
    id          INTEGER PRIMARY KEY,
    "value"       FLOAT,
    description VARCHAR(255)
);


CREATE TABLE author
(
    id INTEGER PRIMARY KEY
);

CREATE TABLE book
(
    id          INTEGER PRIMARY KEY,
    title VARCHAR(255),
    book_author_id INTEGER not null,
    FOREIGN KEY (book_author_id) REFERENCES author(id)
);
