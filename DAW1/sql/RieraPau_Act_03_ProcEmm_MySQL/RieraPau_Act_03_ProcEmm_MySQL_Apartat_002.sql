  USE videoclub;
  DELIMITER //
  CREATE PROCEDURE  Procedure()
    BEGIN
    DECLARE codi_peli smallint unsigned;
       SELECT id_peli
       INTO @codi_peli
       FROM PELLICULES
       WHERE recaudacio_peli = (
         SELECT MAX(recaudacio_peli)
         FROM PELLICULES);
    END //
  DELIMITER ;
CALL Procedure;
