USE videoclub;
alter table PELLICULES add qtatVisualCompletes smallint unsigned;
alter table PELLICULES add qtatVisualParcials smallint unsigned;
DELIMITER //
DROP TRIGGER IF EXISTS act17//
CREATE TRIGGER act17
    AFTER INSERT ON VISUALITZACIONS
FOR EACH ROW
BEGIN
Declare paNumVC smallint unsigned;
Declare paNumVP smallint unsigned;

SELECT count(*)
INTO paNumVC
    FROM VISUALITZACIONS
WHERE id_peli = new.id_peli AND temps IS NULL;

SELECT count(*)
INTO paNumVP
    FROM VISUALITZACIONS
WHERE id_peli = new.id_peli AND temps IS NOT NULL;

UPDATE PELLICULES
    SET qtatVisualCompletes = paNumVC, qtatVisualParcials = paNumVP
    WHERE id_peli = new.id_peli;
END //
DELIMITER ;

INSERT INTO VISUALITZACIONS VALUES
(2222, 18, '00:54:20');

SELECT * FROM VISUALITZACIONS;
SELECT * FROM PELLICULES;