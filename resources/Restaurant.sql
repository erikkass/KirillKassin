CREATE SCHEMA restaurant_storage;

SET SEARCH_PATH = restaurant_storage;

CREATE TABLE restaurant
(
    id   SERIAL PRIMARY KEY,
    name CHARACTER VARYING(64) UNIQUE NOT NULL
);

CREATE TABLE review
(
    id            SERIAL PRIMARY KEY,
    text          CHARACTER VARYING(300),
    restaurant_id INTEGER REFERENCES restaurant
);

CREATE TABLE menu
(
    id            SERIAL PRIMARY KEY,
    name          CHARACTER VARYING(64),
    restaurant_id INTEGER REFERENCES restaurant
);