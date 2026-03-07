CREATE TABLE IF NOT EXISTS animals (
    id  SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    specie VARCHAR(255),
    race VARCHAR(255),
    birthday DATE,
    entry_day DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS visitors (
    id SERIAL PRIMARY KEY,
    email VARCHAR (255) UNIQUE NOT NULL,
    password VARCHAR (255) NOT NULL
);