USE LLIBRERIA;
DROP TABLE IF EXISTS TREBALLADORS;
CREATE TABLE TREBALLADORS (
    dni CHAR (8),
    nom VARCHAR (20),
    cognom VARCHAR (20),
    sou DECIMAL (6,2),
    nombre_fills INT,
    seccio VARCHAR (20),
    PRIMARY KEY (dni)
  );

INSERT INTO TREBALLADORS (dni, nom, cognom,sou, nombre_fills, seccio) VALUES
('12345678', 'Joan', 'Perez', 300, 2, 'Comptabilitat'),
('12345677', 'Josep', 'Perez', 260, 0, 'Comptabilitat'),
('12345676', 'Pol', 'Perez', 157, 4, 'Comptabilitat'),
('12345675', 'Marti', 'Perez', 670, 1, 'Comptabilitat'),
('12345674', 'Roger', 'Perez', 500, 2, 'Comptabilitat'),
('12345673', 'Marc', 'Perez', 400, 0, 'Comptabilitat');

DELIMITER //
DROP PROCEDURE IF EXISTS sp_treb_sous//
CREATE PROCEDURE sp_treb_sous()
    BEGIN
        SELECT nom, cognom, sou 
        FROM TREBALLADORS;
    END //
DELIMITER ;