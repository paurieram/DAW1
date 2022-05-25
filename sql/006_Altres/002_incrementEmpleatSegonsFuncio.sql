USE empresa;
DELIMITER //
DROP PROCEDURE IF EXISTS 06_incrementEmpleatSegonsFuncio//
CREATE PROCEDURE 06_incrementEmpleatSegonsFuncio(
        OUT sumaincrement float)
BEGIN
    DECLARE salari float DEFAULT 0;
    DECLARE funcio varchar(20);
    DECLARE final int DEFAULT 0; -- Igual 0 = False
/*
mysql> SELECT TRUE, true, FALSE, false;
-> 1, 1, 0, 0
*/
    DECLARE elcursor CURSOR FOR
        SELECT SOU_TREB, OFICI_TREB
        FROM TREBALLADORS;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET final = 1; -- True
    OPEN elcursor;
    SET sumaincrement = 0;
    elbucle:LOOP
        FETCH elcursor INTO salari, funcio;
        IF final = 1 THEN
            LEAVE elbucle;
        END IF;
        CASE funcio
        WHEN "President" THEN
            SET sumaincrement = sumaincrement + (salari * 0.1);
        WHEN "Analista" THEN
            SET sumaincrement = sumaincrement + (salari * 0.15);
        WHEN "Director" THEN
            SET sumaincrement = sumaincrement + (salari * 0.05);
        WHEN "Venedor" THEN
            SET sumaincrement = sumaincrement + (salari * 0.03);
        ELSE
            SET sumaincrement = sumaincrement + (salari * 0.04);
        END CASE;
    END LOOP elbucle;
CLOSE elcursor;
END//
DELIMITER ;