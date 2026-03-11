CREATE TYPE IF NOT EXISTS STATUS(
    'DEAD',
    'ADOPTED',
    'AVARIABLE',
    'IN_ADOPTION_PROCESS',
    'MOVED'
);

CREATE TABLE IF NOT EXISTS Animals (
    id  SERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    specie VARCHAR(255),
    race VARCHAR(255),
    birthday DATE,
    entry_day DATE NOT NULL,
    status STATUS,
    description TEXT
);

CREATE TABLE IF NOT EXISTS Visitors (
    id SERIAL PRIMARY KEY,
    email VARCHAR (255) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS Adoption (
    id SERIAL PRIMARY KEY,
    adopter SERIAL REFERENCES (Visitors.id) NOT NULL,
    pet SERIAL REFERENCES (Animals.id) NOT NULL,
    starts DATE NOT NULL,
    ends DATE NOT NULL,
    done_at DATE
);

CREATE TABLE IF NOT EXISTS Adopter (
    id SERIAL PRIMARY KEY REFERENCES (Visitors.id),
    name VARCHAR (255) NOT NULL,
    sur_name VARCHAR (255) NOT NULL,
    dni LONG NOT NULL,
);

CREATE TABLE IF NOT EXISTS Rescuer (
    id SERIAL PRIMARY KEY,
    name VARCHAR (255) NOT NULL,
    sur_name VARCHAR (255) NOT NULL,
);