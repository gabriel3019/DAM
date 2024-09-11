
create schema if not exists bd_foros;
use bd_foros;


drop table usuarios;
create table usuarios(
usu_id int not null auto_increment,
usu_nombre varchar(50) not null,
usu_alias varchar(50) not null,
usu_foto varchar(50),
usu_password varchar(50) not null,
usu_admin tinyint(1) not null,
primary key(usu_id)
);


drop table foros;
create table foros(
for_id int not null auto_increment,
for_tema varchar(50) not null,
for_descripcion mediumtext,
for_fecha timestamp,
primary key(for_id)
);

drop table mensajes;
create table mensajes(
men_id int not null auto_increment,
men_info varchar(50) not null,
men_fecha timestamp not null,
men_usu_id int not null,
men_for_id int not null,
primary key(men_id),
foreign key(men_usu_id) references usuarios(usu_id),
foreign key(men_for_id) references foros(for_id)
);

insert into usuarios values
(null, 'Administrador', 'admin', 'anonimo.png', md5('administrador'), 1),
(null, 'Pepe', 'pepe', 'u01.gif', md5('pepe'), 0),
(null, 'Juan', 'juan', 'u02.gif', md5('juan'), 0),
(null, 'Lola', 'lola', 'u03.gif', md5('lola'), 0),
(null, 'Maria', 'maria', 'u04.gif', md5('maria'), 0);

insert into foros values
(null, 'Deportes', 'colectivos', current_date()),
(null, 'Cocina', 'platos',current_date()),
(null, 'Viajes', 'ciudad',current_date()),
(null, 'Coches', 'marcas',current_date()),
(null, 'Tiendas', 'nombres',current_date());

insert into mensajes values
(null, 'Los deportes colectivos son muy divertidos', current_date(),2,1),
(null, 'Platos saludables',  current_date(),3,2),
(null, 'Viajes por Europa',  current_date(),4,3),
(null, 'Lujuria sobre 4 ruedas',  current_date(),5,4),
(null, 'Las mejores tiendas',  current_date(),1,5);

alter table foros drop column for_fecha;
alter table foros add for_fecha timestamp after for_descripcion;

DELIMITER $$
CREATE PROCEDURE Mensaje_I(IN _Usuario varchar(50), IN _tema varchar(50), IN _Mensaje mediumtext, IN _fecha timestamp)
INSERT INTO mensajes VALUES (null, _Usuario, _tema, _mensaje, _fecha)$$
DELIMITER ;

CALL Mensaje_I()
