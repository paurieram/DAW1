USE videoclub;
-- Insert
DELIMITER //
DROP TRIGGER IF EXISTS act15_insert//
CREATE TRIGGER act15_insert AFTER INSERT ON VISUALITZACIONS
FOR EACH ROW 
BEGIN
DECLARE paId_peli SMALLINT(5) unsigned;
    SET paId_peli = new.id_peli;

UPDATE PELLICULES
    SET recaudacio_peli = recaudacio_peli + 2
    WHERE id_peli = paId_peli;
END //
DELIMITER ;

INSERT INTO VISUALITZACIONS (id_soci, id_peli) VALUES
(2222, 1);

SELECT * FROM PELLICULES;
SELECT * FROM VISUALITZACIONS;