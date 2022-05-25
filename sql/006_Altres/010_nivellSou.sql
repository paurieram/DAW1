DELIMITER //
USE empresa//
DROP PROCEDURE IF EXISTS sp_09_nivellSou//
CREATE PROCEDURE sp_09_nivellSou(
IN p_coditreballador integer,
OUT p_sou varchar(12))
BEGIN
    DECLARE salari float DEFAULT 0;
        SELECT SOU_TREB
            INTO salari
        FROM TREBALLADORS
        WHERE CODI_TREB = p_coditreballador;
    IF salari IS NULL THEN
        SET p_sou = "No existeix!";
    ELSEIF salari < 1000 THEN
        SET p_sou = "Baix";
    ELSEIF salari < 2000 THEN
        SET p_sou = "Mitjà";
    ELSE
        SET p_sou = "Alt";
    END IF;
END//
DELIMITER ;