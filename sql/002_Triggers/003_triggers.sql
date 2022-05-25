USE videoclub;
alter table SOCIS add nVisualitzacions smallint unsigned;
DELIMITER //
DROP TRIGGER IF EXISTS act16//
CREATE TRIGGER act16
    AFTER INSERT ON VISUALITZACIONS
FOR EACH ROW
BEGIN
Declare paNumV smallint unsigned;

SELECT count(*)
INTO paNumV
    FROM VISUALITZACIONS
WHERE id_soci = new.id_soci;

UPDATE SOCIS
    SET nVisualitzacions = paNumV
    WHERE id_soci = new.id_soci;
END //
DELIMITER ;

INSERT INTO VISUALITZACIONS (id_soci, id_peli) VALUES
(2222, 18);

SELECT * FROM VISUALITZACIONS;
SELECT * FROM SOCIS;