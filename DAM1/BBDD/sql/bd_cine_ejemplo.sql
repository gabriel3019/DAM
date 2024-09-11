 #Crear BD
create schema if not exists bd_cine;
#USAR BBDD
 

drop table if exists actores_peliculas ;
drop table if exists actores;
drop table if exists peliculas;
drop table if exists directores;
drop table if exists nacionalidades; 

#CREAR TABLAS EN BBDD
create table if not exists nacionalidades(
	nac_id int unsigned auto_increment not null,
    nac_nombre varchar(50),
    primary key (nac_id)
);

create table if not exists directores(
	dir_id int unsigned auto_increment not null,
    dir_nombre varchar(50),
    dir_nac_id int unsigned not null,
    primary key (dir_id),
    foreign key (dir_nac_id) references nacionalidades (nac_id)
);

create table if not exists actores(
	act_id int unsigned auto_increment not null,
    act_nombre varchar(50),
    act_nac_id int unsigned not null,
    primary key (act_id),
    foreign key (act_nac_id) references nacionalidades (nac_id)
);


create table if not exists peliculas(
	pel_id int unsigned auto_increment not null,
    pel_titulo varchar(50),
    pel_nac_id int unsigned not null,
    pel_anio int(4),
    pel_resumen text,
    pel_dir_id int unsigned not null,
    primary key (pel_id),
    foreign key (pel_nac_id) references nacionalidades (nac_id),
    foreign key (pel_dir_id) references directores (dir_id)
);

create table if not exists actores_peliculas(
	ap_pel_id int unsigned not null,
    ap_act_id int unsigned not null,
    ap_personaje varchar(50),
    primary key (ap_pel_id, ap_act_id),
    foreign key (ap_pel_id) references peliculas (pel_id),
    foreign key (ap_act_id) references actores (act_id)
);

#Comprobar integridad referencial
#insert into directores values (null, 'pepe', 1);

#nacionalidades
insert into nacionalidades values 
(null, 'Española'),
(null, 'Inglesa'),
(null, 'Francesa'),
(null, 'Japonesa'),
(null, 'China');

select * from nacionalidades;


drop procedure actores_I;
#Procedures actores insertar
DELIMITER $$
create procedure actores_I( IN _nombre varchar(50), IN _nac int)
INSERT INTO actores values (null,_nombre,_nac)$$
DELIMITER ;

INSERT INTO actores VALUES 
	(null, 'Silvestre Stalone', 1),
    (null, 'B2', 2),
    (null, 'B3', 3),
    (null, 'B4', 4),
    (null, 'B5', 5);
    
INSERT INTO nacionalidades VALUES
	(null,'USA');

INSERT INTO peliculas VALUES (null,'Rocky' ,6,1980, '',1),(null,'Rocky II' ,6,1982, '',1),(null,'Rocky III' ,6,1990, '',1);
INSERT INTO directores VALUES (null, 'DIRECTOR',1);

select * from peliculas;

select * from nacionalidades;
select * from directores;
call actores_I ('A',1);

select * from actores;

#CREAR PROCEDURE UPDATE
DELIMITER $$
create procedure actores_U( IN _id int, IN _nombre varchar(50), IN _nac int)
UPDATE actores SET act_nombre =  _nombre, act_nac_id = _nac where act_id = _id$$
DELIMITER ;

call actores_U(1, 'Z', 2);

#CREAR PROCEDURE DELETE
DELIMITER $$
create procedure actores_D( IN _id int)
DELETE FROM actores where act_id = _id$$
DELIMITER ;
call actores_D(1);
select * from actores;
call actores_D(2);

#CREAR PROCEDURE FILTRAR
DELIMITER $$
create procedure actores_F( IN _filtro varchar(50))
SELECT * FROM actores where act_nombre LIKE _filtro$$
DELIMITER ;

#%% saca todos
#%1% saca B1
call actores_F('%B%');
select * from actores;

#SELECT PARA TODAS LAS TABLAS
INSERT INTO actores_peliculas VALUES (5,5,'Boxeador'),(6,5,'Boxeador'),(7,5,'Boxeador');

SELECT a.act_nombre,n1.nac_nombre, p.pel_titulo,n3.nac_nombre, d.dir_nombre, n2.nac_nombre
FROM nacionalidades as n1, nacionalidades as n2, nacionalidades as n3, peliculas as p, actores as a, directores as d, actores_peliculas as ap
WHERE 
	n1.nac_id = a.act_nac_id AND
    n2.nac_id = d.dir_nac_id AND
    n3.nac_id = p.pel_nac_id AND
    a.act_id = ap.ap_act_id AND
    p.pel_id = ap.ap_pel_id AND
    p.pel_dir_id = d.dir_id;
    
    




