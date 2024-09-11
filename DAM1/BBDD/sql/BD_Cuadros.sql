#Aqui creo la base de datos cuadros
create database BD_CUADROS;
#Aqui uso la bd_cuadros
USE BD_CUADROS;
#Creo la tabla pintores
Create table Pintores(
	pint_id int not null auto_increment,
    pint_nombre varchar(50) not null,
    primary key (pint_id)
);
#Creo la tabla cuadros
Create table Cuadros(
	cua_id int not null auto_increment,
    cua_titulo varchar(50) not null,
    cua_pintor varchar(50) not null,
    cua_precio decimal(10,2) not null,
    cua_sala int not null,
    pint_id int not null,
    primary key (cua_id),
    foreign key (pint_id) references Pintores(pint_id)
    );
    
drop table Cuadros;
    
    
#Creo la tabla de las salas
Create table Salas(
	sal_id int not null auto_increment,
    sal_nombre varchar(50) not null,
    sal_direccion varchar(50) not null,
    sal_localidad varchar (50) not null,
    sal_cp int not null,
    sal_provincia varchar (50) not null,
    primary key (sal_id)
    );
#Aqui enseño las tablas creadas
SHOW TABLES;

#Aqui añado 4 registros a cada tabla Pintores
insert into Pintores Values(null, 'Javier');
insert into Pintores Values(null, 'Pedro');
insert into Pintores Values(null, 'Dani');
insert into Pintores Values(null, 'Celia');
#Aqui añado 4 registros a la tabla cuadros
insert into Cuadros values(null, 'Persona', 'Javier', '20.6',1 ,1);
insert into Cuadros values(null, 'Gato', 'Pedro', '27.64', 2 ,2);
insert into Cuadros values(null, 'Pelota', 'Dani', '21.4',3  ,3);
insert into Cuadros values(null, 'Programacion', 'Celia', '24.6', 4 ,4);
#Aqui añado 4 registros a la tabla Salas
insert into Salas Values(null, 'Contemporaneo', 'C/Goya', 'Madrid', '28028','Madrid');
insert into Salas Values(null, 'Animal', 'C/Mata', 'Madrid', '2850','Madrid');
insert into Salas Values(null, 'Deporte', 'C/Garcia', 'Madrid', '28016','Madrid');
insert into Salas Values(null, 'Informatica', 'C/Pedro', 'Madrid', '28093','Madrid');

#4.SQL para comprobar el Foreign key


#5.SQL para sacar informacion de las tablas
SELECT * FROM Pintores;
SELECT * FROM Cuadros;
SELECT * FROM Salas;
#6.SQL para seleccionar el nombre del pintor, los datos del cuadro y los datos de la sala
SELECT pint_nombre, cua_titulo, cua_pintor, cua_precio, cua_sala, sal_nombre, sal_direccion, sal_localidad, sal_cp, sal_provincia
FROM Pintores, Cuadros, Salas
ORDER BY pint_nombre

