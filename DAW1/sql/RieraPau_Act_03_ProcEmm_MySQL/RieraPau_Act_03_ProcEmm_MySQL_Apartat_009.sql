use videoclub;
DELIMITER //
DROP PROCEDURE IF EXISTS act9//
CREATE PROCEDURE act9()
begin
   declare cActor bigint default 0;
   declare final int default false;

   declare elcursor cursor for
      select id_actor
      from ACTORS;
   declare continue handler for not found set final = 1;
   open elcursor;
   elbucle:loop
      fetch elcursor into cActor;
      if final = 1 then
         leave elbucle;
      end if;
      SELECT nom_actor, year(curdate()) - anynaix_actor"anys", anynaix_actor, sexe_actor,
      if(sexe_actor="home",
      if(year(curdate()) - anynaix_actor<15,"nen",
      if(year(curdate()) - anynaix_actor BETWEEN 15 AND 25,"home adolescent i jove",
      if(year(curdate()) - anynaix_actor BETWEEN 26 AND 40, "home adult",
      if(year(curdate()) - anynaix_actor BETWEEN 41 AND 60, "home madur",
      if(year(curdate()) - anynaix_actor>61, "home gran",""))))),
      if(year(curdate()) - anynaix_actor<15,"nena",
      if(year(curdate()) - anynaix_actor BETWEEN 15 AND 25,"dona adolescent i jove",
      if(year(curdate()) - anynaix_actor BETWEEN 26 AND 40, "dona adult",
      if(year(curdate()) - anynaix_actor BETWEEN 41 AND 60, "dona madura",
      if(year(curdate()) - anynaix_actor>61, "dona gran","")))))) as "Paper que pot interpretar"
      FROM ACTORS
      WHERE ACTORS.id_actor = cActor;
   end loop elbucle;
   close elcursor;
END//
delimiter ;