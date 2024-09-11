CREATE DATABASE bd_actividad_procedures;
USE bd_actividad_procedures;

DROP TABLE if exists alumnos;
CREATE TABLE alumnos(
	al_id INT PRIMARY KEY AUTO_INCREMENT,
	al_nom VARCHAR(20) NOT NULL,
	al_ape VARCHAR(20) NOT NULL,
	al_fnac DATE,
	al_edad INT );
INSERT INTO alumnos VALUES (NULL,'Guillermo','Homet','1992-12-20',NULL);
INSERT INTO alumnos VALUES (NULL,'Marta','Ros','1993-01-21',NULL);
INSERT INTO alumnos VALUES (NULL,'Miguel','Rodríguez','1990-10-11',NULL);

DROP TABLE if exists profesores;
CREATE TABLE profesores(
	prof_id INT PRIMARY KEY AUTO_INCREMENT,
	prof_nom VARCHAR(20) NOT NULL,
	prof_ape VARCHAR(20) NOT NULL,
	prof_fnac DATE,
	prof_edad INT, 
    prof_horas_lectivas int);
INSERT INTO profesores VALUES (NULL,'Nuria','Ribas','1985-10-06',NULL, 36);
INSERT INTO profesores VALUES (NULL,'Carlos','Gómez','1978-06-14',NULL, 34);

/*Cree una procedure que busque alumnos filtrados por apellido llamado filtro_apellido*/

drop procedure filtro_apellido;
delimiter $$
create procedure filtro_apellido(in _filtro varchar(50), in _tabla varchar(20))
begin 
	if _tabla = 'alumnos' then 
		select * from alumnos where al_ape like concat('%', _filtro, '%');
    else
		select * from profesores where prof_ape like concat('%', _filtro, '%');
	end if;
end $$
delimiter  ;
call filtro_apellido('r', '');

/*Cree una procedure que filtre los profesores por nombre  y apellidos. Ten en cuenta que si algun filtro es null buscara por el otro, si ambos son null, da error, Ejemplo de ejecucuion
call filtro_nombre_apellido(null,'ruiz');*/

drop procedure filtro_nombre_apellido;
 delimiter $$
 create procedure filtro_nombre_apellido (in _nom varchar(50), in _ape varchar(50))
 begin
	if _nom is null and _ape is null then
    SELECT "ERROR";
    elseif _nom is null then
		SELECT * FROM profesores WHERE prof_ape LIKE  concat('%', _ape, '%');
    elseif (_ape is null) then
        SELECT * FROM profesores WHERE prof_nom LIKE  concat('%', _nom, '%');
	else
		SELECT * FROM profesores WHERE prof_nom LIKE concat('%', _nom, '%') AND prof_ape LIKE concat('%', _ape, '%');
	end if;
end $$
delimiter ;



call filtro_nombre_apellido(null, null);

		
    