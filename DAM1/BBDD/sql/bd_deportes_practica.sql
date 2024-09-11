#Asegurar entidad relacion
#Lo haremos con la tabla deportes es N:N

#Crear la base de datos
CREATE SCHEMA BD_DEPORTES;
#Usar la base de datos
USE BD_DEPORTES;
#CREAR DEPORTES
CREATE TABLE IF NOT EXISTS deportes(
dep_id int  unsigned not null auto_increment,
dte_nombre varchar(50) unique,
#clave primaria
primary key(dep_id)
);
#INSERTAR DEPORTES
INSERT INTO deportes VALUES (null,'Futból'), (null,'Tenis'), (null,'Natacion');
INSERT INTO deportes VALUES  (null,'Tenis');

#SELECT 
SELECT * FROM deportes;

#CREAR DEPORTISTAS
CREATE TABLE IF NOT EXISTS deportistas(
det_id int  unsigned not null auto_increment,
det_nombre varchar(50),
#clave primaria
primary key(det_id)
);
#INSERTAR DEPORTES
INSERT INTO deportistas VALUES (null,'Pepe'), (null,'Juan'), (null,'Antonio');

#SELECT 
SELECT * FROM deportistas;

#crear deportista_deporte
create table deportes_deportistas(
dd_dep_id int  unsigned not null,
dd_det_id int  unsigned not null,
#Clave primaria
primary key (dd_dep_id, dd_det_id),
#Clave foranea
foreign key(dd_dep_id) references deportes (dep_id),
foreign key(dd_det_id) references deportistas (det_id)
);
#INSERTAR
INSERT INTO deportes_deportistas values (1,1), (1,2), (2,1), (2,3), (3,1), (3,3);

#SELECT

#PRUEBA DE INTEGRIDAD REFERENCIAL
#insert into deportes_deportista values(1,333);

#Para cada deporte, que deportistas lo practican
SELECT dte_nombre, det_nombre
FROM deportes, deportes_deportistas, deportistas
WHERE dep_id = dd_dep_id AND
	det_id = dd_det_id
ORDER BY det_nombre;

#Para cada deportista, que deportes realiza
SELECT det_nombre, dte_nombre
FROM deportes, deportes_deportistas, deportistas
ORDER BY det_nombre;

#jugar
#Cuantos deportes hace cada deportista 
SELECT COUNT(dd_dep_id) as DEPORTES, dte_nombre
FROM deportes, deportes_deportistas, deportistas 
WHERE dep_id = dd_dep_id AND
	det_id = dd_det_id
GROUP BY dte_nombre;

#añadir campo edad
alter table deportistas
	add column (edad int unsigned not null);
#alter table deportistas
	#drop column edad;
UPDATE DEPORTISTAS SET edad = 22 where det_nombre ='Pepe';
UPDATE DEPORTISTAS SET edad = 25 where det_nombre ='Juan';
UPDATE DEPORTISTAS SET edad = 30 where det_nombre ='Antonio';

#Meter valoracion
alter table deportes_deportistas
	add column (dd_valoracion int unsigned not null);
SELECT * FROM deportes_deportistas;