USE Videoclub;
DROP TABLE IF EXISTS VIEWS;
CREATE TABLE VIEWS (
    id_peli smallint(5) UNSIGNED,
    id_soci varchar(10),
    tempVist time NOT NULL,
    PRIMARY KEY (id_peli, id_soci),
    FOREIGN KEY (id_peli) REFERENCES PELLICULES (id_peli),
    FOREIGN KEY (id_soci) REFERENCES SOCIS (id_soci)
);

INSERT INTO VIEWS VALUES (1,3333,"23:23:23"),(2,2222,"23:23:23"),(3,1111,"23:23:23");