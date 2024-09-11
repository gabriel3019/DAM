CREATE DATABASE bd_hobie;
use bd_hobie;
create table personas(
per_id int not null auto_increment,
per_nombre varchar(50) not null,
per_apellido varchar(50) not null,
primary key(per_id)
);

create table aficiones(
af_id int not null auto_increment,
af_nombre varchar(50) not null,
primary key(af_id)
);

create table personas_aficiones(
per_id int not null,
af_id int not null,
primary key (per_id , af_id),
foreign key(per_id) references personas (per_id),
foreign key(af_id) references aficiones (af_id)
);

drop table personas_aficiones;

per_apellidoinsert into personas values(null, 'Pepe', 'Rodriguez');
