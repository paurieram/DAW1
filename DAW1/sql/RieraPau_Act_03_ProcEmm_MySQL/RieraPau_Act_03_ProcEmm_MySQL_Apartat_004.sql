USE videoclub;
DELIMITER //
CREATE PROCEDURE  Procedure(
IN codi_peli smallint unsigned)
  BEGIN
  DECLARE codi_actor smallint unsigned;
     SELECT id_actor
     INTO @codi_actor
     FROM ACTORS_PELLICULES
     WHERE id_peli = codi_peli
     AND principal = 1;
  END //
DELIMITER ;
CALL Procedure(1);
