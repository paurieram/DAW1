USE videoclub;
DELIMITER //
DROP PROCEDURE IF EXISTS sp08_llistaActorsSexe//
CREATE PROCEDURE sp08_llistaActorsSexe(
IN p_sexe varchar(4))
BEGIN 
    SELECT nom_actor
    FROM ACTORS WHERE sexe_actor = p_sexe;
END //
DELIMITER ;