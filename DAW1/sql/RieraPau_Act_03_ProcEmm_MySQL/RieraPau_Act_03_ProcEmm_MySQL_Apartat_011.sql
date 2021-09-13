USE videoclub;
DROP FUNCTION IF EXISTS act11;
DELIMITER //
CREATE FUNCTION act11(coPeli SMALLINT UNSIGNED) 
       RETURNS SMALLINT UNSIGNED
       DETERMINISTIC
BEGIN
   DECLARE qPrestecs SMALLINT UNSIGNED;
   SELECT COUNT(*)
   INTO qPrestecs
   FROM PRESTECS
   WHERE id_peli = coPeli;
   RETURN qPrestecs;
END//
DELIMITER ;
  SELECT  titol_peli Titol, act11(1) "Quantitat exemplars"
   FROM    PELLICULES
   WHERE   id_peli = 1;