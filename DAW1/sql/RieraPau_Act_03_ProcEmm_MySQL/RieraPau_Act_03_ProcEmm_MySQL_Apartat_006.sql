USE videoclub;
DELIMITER //
CREATE PROCEDURE  Procedure(
IN codi_peli smallint unsigned)
  BEGIN
  SELECT titol_peli,
  if(recaudacio_peli<pressupost_peli, "Deficitari",
  if(recaudacio_peli<(pressupost_peli/2), "Suficient",
  if(recaudacio_peli>(pressupost_peli*2), "Bona", ""))) as Rendabilitat
  FROM PELLICULES
  WHERE  id_peli = codi_peli;
  END //
DELIMITER ;
CALL Procedure(8);