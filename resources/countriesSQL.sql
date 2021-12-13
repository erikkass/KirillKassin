CREATE SCHEMA countries_storage;

CREATE TABLE countries_storage.countries
(
    name       CHARACTER VARYING(64),
    population INTEGER,
    area       INTEGER,
    language   CHARACTER VARYING(64)
);

INSERT INTO countries_storage.countries (name, population, area, language)
VALUES ('Belarus', 9349645, 207600, 'Belarusian'),
       ('Russia', 145975300, 17098246, 'Russian'),
       ('Germany', 83190556, 357578, 'German'),
       ('France', 67413000, 551500, 'French'),
       ('USA', 332278200, 9826675, 'English'),
       ('Canada', 38246108, 9984670, 'English'),
       ('China', 1442965000, 9596961, 'Chinese'),
       ('Italy', 60320220, 301230, 'Italian'),
       ('Poland', 37881014, 312696, 'Polish'),
       ('Portugal', 10347892, 92225, 'Portuguese');

SET SEARCH_PATH = countries_storage;

SELECT *
FROM countries
WHERE population > 50000000;

SELECT *
FROM countries
ORDER BY area;

UPDATE countries
SET language = 'Russian'
WHERE name = 'Belarus';

SELECT *
FROM countries;

DELETE
FROM countries
WHERE population = (SELECT max(population) FROM countries);

SELECT *
FROM countries;

SELECT sum(population) AS sum_countries_population
FROM countries
WHERE area < (SELECT area
              FROM countries
              ORDER BY area
    LIMIT 1 OFFSET 5);