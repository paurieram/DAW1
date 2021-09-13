USE videoclub;
DELIMITER //
CREATE PROCEDURE  Procedure()
  BEGIN
  DECLARE titol_pelicula varchar(40);
  DECLARE p_recaudacio bigint(20);
     SELECT titol_peli
     INTO @titol_pelicula
     FROM PELLICULES
     WHERE recaudacio_peli = (
       SELECT MAX(recaudacio_peli)
       FROM PELLICULES);
    SELECT recaudacio_peli
    INTO @p_recaudacio
    FROM PELLICULES
    WHERE recaudacio_peli = (
     SELECT MAX(recaudacio_peli)
     FROM PELLICULES);
  END //
DELIMITER ;
CALL Procedure;