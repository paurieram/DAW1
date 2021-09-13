# Correcció exercicis

|Enunciat|Fitxer|Comentari|Nota|
|--------|------|---------|----|
|**Enunciat 9**| [Act09.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_009.sql) | | |
|**Enunciat 11**| [Act11.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_011.sql) | | |
|**Enunciat 12**| [Act12.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_012.sql) | | |
|**Enunciat 13**| [Act13.sql]() | | |

# **Enunciat 9**:

**1. Enllaç al fitxer**

[Act09.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_009.sql)

**2. Contingut del fitxer**

```sql
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
```

**3. Sortida de la creació del procediment**

```sql
USE videoclub;
Database changed
DROP FUNCTION IF EXISTS act9;
DELIMITER //
mysql> CREATE PROCEDURE act9()
    -> begin
    ->    declare cActor bigint default 0;
    ->    declare final int default false;
    ->
    ->    declare elcursor cursor for
    ->       select id_actor
    ->       from ACTORS;
    ->    declare continue handler for not found set final = 1;
    ->    open elcursor;
    ->    elbucle:loop
    ->       fetch elcursor into cActor;
    ->       if final = 1 then
    ->          leave elbucle;
    ->       end if;
    ->       SELECT nom_actor, year(curdate()) - anynaix_actor"anys", anynaix_actor, sexe_actor,
    ->       if(sexe_actor="home",
    ->       if(year(curdate()) - anynaix_actor<15,"nen",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 15 AND 25,"home adolescent i jove",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 26 AND 40, "home adult",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 41 AND 60, "home madur",
    ->       if(year(curdate()) - anynaix_actor>61, "home gran",""))))),
    ->       if(year(curdate()) - anynaix_actor<15,"nena",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 15 AND 25,"dona adolescent i jove",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 26 AND 40, "dona adult",
    ->       if(year(curdate()) - anynaix_actor BETWEEN 41 AND 60, "dona madura",
    ->       if(year(curdate()) - anynaix_actor>61, "dona gran","")))))) as "Paper que pot interpretar"
    ->       FROM ACTORS
    ->       WHERE ACTORS.id_actor = cActor;
    ->    end loop elbucle;
    ->    close elcursor;
    -> END//
Query OK, 0 rows affected (0.01 sec)

mysql> delimiter ;
mysql> -- call act9();
```

**4. Sortida de l'execució del procediment**

```sql

```

---

# **Enunciat 11**:

**1. Enllaç al fitxer**

[Act11.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_011.sql)

**2. Contingut del fitxer**

```sql
USE videoclub;
DROP FUNCTION IF EXISTS act11;
DELIMITER //
CREATE FUNCTION act11(coPeli SMALLINT UNSIGNED) 
       RETURNS SMALLINT UNSIGNED
       DETERMINISTIC
BEGIN
   DECLARE qPrestecs SMALLINT UNSIGNED;
   SELECT COUNT(*)
   INTO qPrestecs
   FROM PRESTECS
   WHERE id_peli = coPeli;
   RETURN qPrestecs;
END//
DELIMITER ;
  SELECT  titol_peli Titol, act11(1) "Quantitat exemplars"
   FROM    PELLICULES
   WHERE   id_peli = 1;
```

**3. Sortida de la creació del procediment**

```sql
mysql> USE videoclub;
Database changed
mysql> DROP FUNCTION IF EXISTS act11;
Query OK, 0 rows affected (0.01 sec)

mysql> DELIMITER //
mysql> CREATE FUNCTION act11(coPeli SMALLINT UNSIGNED)
    ->        RETURNS SMALLINT UNSIGNED
    ->        DETERMINISTIC
    -> BEGIN
    ->    DECLARE qPrestecs SMALLINT UNSIGNED;
    ->    SELECT COUNT()
    ->    INTO qPrestecs
    ->    FROM PRESTECS
    ->    WHERE id_peli = coPeli;
    ->    RETURN qPrestecs;
    -> END//
Query OK, 0 rows affected (0.02 sec)

mysql> DELIMITER ;
```

**4. Sortida de l'execució del procediment**

```sql
mysql>   SELECT  titol_peli Titol, act11(1) "Quantitat exemplars"
    ->    FROM    PELLICULES
    ->    WHERE   id_peli = 1;
+-------------+---------------------+
| Titol       | Quantitat exemplars |
+-------------+---------------------+
| La busqueda |                   3 |
+-------------+---------------------+
1 row in set (0.00 sec)
```

---

# **Enunciat 12**:

**1. Enllaç al fitxer**

[Act12.sql](https://github.com/paurigine/exercicis_mp02_uf03/blob/main/git/m2_uf3/RieraPau_Act_03_ProcEmm_MySQL/RieraPau_Act_03_ProcEmm_MySQL_Apartat_012.sql)

**2. Contingut del fitxer**

```sql
USE videoclub;
DROP FUNCTION IF EXISTS act12;
DELIMITER //
CREATE FUNCTION act12(CodiPeli SMALLINT UNSIGNED) 
       RETURNS Smallint
       DETERMINISTIC
BEGIN
   DECLARE idActor Smallint UNSIGNED;
DECLARE final int default false;
DECLARE cursor cursor for
       SELECT   id_actor
   FROM     ACTORS_PELLICULES
   WHERE    id_peli = CodiPeli
   AND principal = 1;
 DECLARE continue handler for not found SET final = 1;
   open cursor;
   bucle:loop
      fetch cursor into idActor;
      if final = 1 then
         leave bucle;
      end if;
	RETURN idActor;
   END loop bucle;
   close cursor;
END//
DELIMITER ;
SELECT ACTORS.nom_actor, PELLICULES.titol_peli
FROM ACTORS , PELLICULES
WHERE id_actor = act12(2) AND id_peli = 2;
```

**3. Sortida de la creació del procediment**

```sql
mysql> USE videoclub;
Database changed
mysql> DROP FUNCTION IF EXISTS act12;
WHERE id_actor = act12(2) AND id_peli = 2;Query OK, 0 rows affected, 1 warning (0.00 sec)

mysql> DELIMITER //
mysql> CREATE FUNCTION act12(CodiPeli SMALLINT UNSIGNED)
    ->        RETURNS Smallint
    ->        DETERMINISTIC
    -> BEGIN
    ->    DECLARE idActor Smallint UNSIGNED;
    -> DECLARE final int default false;
    ->
    -> DECLARE elcursor cursor for
    ->        SELECT   id_actor
    ->    FROM     ACTORS_PELLICULES
    ->    WHERE    id_peli = CodiPeli
    ->    AND principal = 1;
    ->
    ->  DECLARE continue handler for not found SET final = 1;
    ->    open elcursor;
    ->    elbucle:loop
    ->       fetch elcursor into idActor;
    ->
    ->       if final = 1 then
    ->          leave elbucle;
    ->       end if;
    ->
    -> RETURN idActor;
    ->    END loop elbucle;
    ->    close elcursor;
    ->
    -> END//
Query OK, 0 rows affected (0.01 sec)
mysql> DELIMITER ;
```

**4. Sortida de l'execució del procediment**

```sql
mysql> SELECT ACTORS.nom_actor, PELLICULES.titol_peli
    -> FROM ACTORS , PELLICULES
    -> WHERE id_actor = act12(2) AND id_peli = 2;
+-----------+-------------+
| nom_actor | titol_peli  |
+-----------+-------------+
| Tom Hanks | La terminal |
+-----------+-------------+
1 row in set (0.01 sec)
```

---

# **Enunciat 13**:

**1. Enllaç al fitxer**

[Act13.sql]()

**2. Contingut del fitxer**

```sql

```

**3. Sortida de la creació del procediment**

```sql

```

**4. Sortida de l'execució del procediment**

```sql

```

---
