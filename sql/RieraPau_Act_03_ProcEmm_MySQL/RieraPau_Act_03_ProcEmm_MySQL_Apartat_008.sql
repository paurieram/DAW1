use videoclub;
drop procedure if exists Procedure;
delimiter //
create procedure Procedure()
begin
   declare recapta bigint default 0;
   declare pressupost bigint default 0;
   declare titol varchar(30);
   declare rendibilitat varchar(15);
   declare final int default false;

   declare cursor cursor for
      select titol_peli, recaudacio_peli, pressupost_peli from PELLICULES;

   declare continue handler for not found set final = 1;
   open cursor;
   bucle:loop
      fetch cursor into titol, recapta, pressupost;

      if final = 1 then
         leave bucle;
      end if;

      if (pressupost>recapta) then
         set rendibilitat = "Deficitari";
      elseif (pressupost*2 > recapta) then
         set rendibilitat = "Suficient";
      else
         set rendibilitat = "Bona";
      end if;
      select titol, rendibilitat;
      end loop bucle;
close cursor;
end//
delimiter ;
call Procedure();
