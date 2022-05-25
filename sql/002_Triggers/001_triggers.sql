USE videoclub;
-- Inserts
DELIMITER //
DROP TRIGGER IF EXISTS act14_insert//
CREATE TRIGGER act14_insert BEFORE INSERT ON PELLICULES
FOR EACH ROW 
BEGIN
SET new.titol_peli = UPPER(new.titol_peli);
END //
DELIMITER ;

INSERT INTO PELLICULES VALUES
(20, "test1", "Espanya", "Paramount", 2021, 1, 0, 100);

SELECT titol_peli FROM PELLICULES;


-- Updates
DELIMITER //
DROP TRIGGER IF EXISTS act14_update;
CREATE TRIGGER act14_update BEFORE UPDATE ON PELLICULES
FOR EACH ROW 
SET new.titol_peli = UPPER(new.titol_peli);
END //
DELIMITER ;

UPDATE PELLICULES
    SET any_peli = 2021
    WHERE titol_peli = "Joker";

SELECT * FROM PELLICULES;