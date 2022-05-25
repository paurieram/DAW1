DELIMITER //
CREATE PROCEDURE sp_treb_sous()
    BEGIN
        SELECT nom, cognom, sou 
        FROM TREBALLADORS;
    END //
DELIMITER ;