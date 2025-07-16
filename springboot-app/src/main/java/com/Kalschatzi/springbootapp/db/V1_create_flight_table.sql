CREATE TABLE IF NOT EXISTS flight (

    id BIGSERIAL PRIMARY KEY,
    icao24 varchar(255),
    callsign varchar(255),
    origin_country varchar(255)

);