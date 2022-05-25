USE videoclub;
DELIMITER //
DROP PROCEDURE IF EXISTS sp02_exercici_llistaActors//
CREATE PROCEDURE sp02_exercici_llistaActors()
SELECT nom_actor, anynaix_actor 
    FROM ACTORS WHERE sexe_actor = "home";
END //
DELIMITER ;