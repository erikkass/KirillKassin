CREATE SCHEMA writers_storage;

SET SEARCH_PATH = writers_storage;

CREATE TABLE author
(
    id          SERIAL PRIMARY KEY,
    full_name   CHARACTER VARYING(64) NOT NULL,
    birthdate   DATE                  NOT NULL,
    nationality CHARACTER VARYING(64) NOT NULL
);

CREATE TABLE book
(
    id        SERIAL PRIMARY KEY,
    name      CHARACTER VARYING(64) NOT NULL,
    page      INTEGER               NOT NULL,
    genre     CHARACTER VARYING(64) NOT NULL,
    author_id INTEGER REFERENCES author (id)
);

CREATE TABLE book_author
(
    id        SERIAL PRIMARY KEY,
    book_id   INTEGER REFERENCES book (id),
    author_id INTEGER REFERENCES author (id)
);

INSERT INTO author (full_name, birthdate, nationality)
VALUES ('Фридрих Ницше', '1844.10.15', 'Немец'),
       ('Михаил Афанасьевич Булгаков', '1891.05.15', 'Русский'),
       ('Джордж Оруэлл', '1903.06.25', 'Британец'),
       ('Рэй Брэдбери', '1920.08.22', 'Американец'),
       ('Фёдор Михайлович Достоевский', '1821.10.30', 'Русский');

INSERT INTO book (name, page, genre, author_id)
VALUES ('Так говорил Заратустра', 352, 'Филосовский роман',(SELECT id FROM author WHERE author.full_name = 'Фридрих Ницше')),
       ('Мастер и Маргарита', 640, 'Роман',(SELECT id FROM author WHERE author.full_name = 'Михаил Афанасьевич Булгаков')),
       ('1984', 320, 'Антиутопия', (SELECT id FROM author WHERE author.full_name = 'Джордж Оруэлл')),
       ('451 градус по Фаренгейту', 288, 'Антиутопия', (SELECT id FROM author WHERE author.full_name = 'Рэй Брэдбери')),
       ('Преступление и наказание', 331, 'Роман',(SELECT id FROM author WHERE author.full_name = 'Фёдор Михайлович Достоевский')),
       ('Антихрист', 224, 'Роман', (SELECT id FROM author WHERE author.full_name = 'Фридрих Ницше')),
       ('Белая гвардия', 360, 'Роман', (SELECT id FROM author WHERE author.full_name = 'Михаил Афанасьевич Булгаков')),
       ('Скотный двор', 305, 'Роман', (SELECT id FROM author WHERE author.full_name = 'Джордж Оруэлл')),
       ('Вино из одуванчиков', 290, 'Роман', (SELECT id FROM author WHERE author.full_name = 'Рэй Брэдбери')),
       ('Братья Карамазовы', 330, 'Роман',(SELECT id FROM author WHERE author.full_name = 'Фёдор Михайлович Достоевский'));

-- 1
SELECT e.full_name AS book_author, c.name AS book_name
FROM author e
         JOIN book c ON e.id = c.author_id
ORDER BY e.full_name;

-- 2
SELECT c.name AS book_name
FROM author e
         JOIN book c ON e.id = c.author_id
WHERE e.nationality = 'Русский';

-- 3
SELECT c.name AS book_name
FROM author e
         JOIN book c ON e.id = c.author_id
WHERE 1900 < (SELECT EXTRACT(YEAR FROM e.birthdate)
              FROM author
                       LIMIT 1);

-- 4
DELETE
FROM book
WHERE name = '451 градус по Фаренгейту';

SELECT *
FROM book;

-- 5
SELECT e.full_name, e.nationality, avg(c.page) AS avg_page
FROM author e
         JOIN book c ON e.id = c.author_id
GROUP BY e.full_name, e.nationality, e.birthdate
ORDER BY e.birthdate;

-- 6
SELECT e.full_name, e.nationality, avg(c.page) AS avg_page
FROM author e
         JOIN book c ON e.id = c.author_id
GROUP BY e.full_name, e.nationality, e.birthdate
HAVING avg(c.page) > 300
ORDER BY e.birthdate;

-- 7*
SELECT e.full_name, (SELECT avg(c.page) as avg_all_page FROM book c), avg(c.page) as avg_page
FROM author e
         JOIN book c ON e.id = c.author_id
GROUP BY e.full_name
HAVING avg(c.page) > (SELECT avg(c.page) as avg_all_page FROM book c);