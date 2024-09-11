create database bd_prueba;
use bd_prueba;

create table alumnos(
  id int not null auto_increment primary key,
  nombre varchar(30),
  promedio decimal(4,2)
);

insert into alumnos values 
(null,'Perez Luis',8.5),
(null,'Garcia Ana',7.0),
(null,'Ludueña Juan',9.6),
(null,'Moreno Gabriela',4.8),
(null,'Morales Hugo',3.2),
(null,'Gomez Susana',6.4),
(null,'Negativo',-2),
(null,'Mas de 10',11);

select * from alumnos;

SELECT
	promedio,
	case round(promedio)
		when 4 then 'Suspenso'
        when 5 then 'Aprobado'
        else 'error'
        end as Nota
        from alumnos;



/*
Si el alumno tiene un promedio menor a 5, muestre un mensaje "suspenso"; 
si el promedio es mayor o igual a 5 y menor a 7, muestre "aprobado"; 
si el promedio es mayor o igual a 7 y menor que 9, muestre "notable"; 
si el promedio es mayor o igual a 9, muestre "sobresaliente";
muestre “error” en cualquier otro caso
usando la sintaxis de "case":
*/

SELECT floor(promedio),
CASE floor(promedio)
	when 0 then 'Suspenso'
    when 1 then 'Suspenso'
    when 2 then 'Suspenso'
    when 3 then 'Suspenso'
    when 4 then 'Suspenso'
    when 5 then 'Aprobado'
    when 6 then 'Aprobado'
    when 7 then 'Aprobado'
    when 8 then 'Aprobado'
    when 9 then 'Aprobado'
    when 10 then 'Aprobado'
    else 'error'
    end as Nota
    from alumnos;


SELECT 
	nombre,
    promedio,
CASE
	when promedio >= 0 and promedio <5 then 'Suspenso'
    when promedio >=5 and promedio <7 then 'Aprobado'
    when promedio >=7 and promedio <9 then 'Notable'
    when promedio >=9 and promedio <=10 then 'Sobresaliente'
    else 'error'
    end as Nota
    
    from alumnos;
    
    
    
    
 create table visitas (
  numero int unsigned auto_increment,
  nombre varchar(30) not null,
  mail varchar(50),
  fecha date,
  primary key(numero)
);

 insert into visitas (nombre,mail,fecha) values
  ('Ana Maria Lopez','AnaMaria@hotmail.com','2006-02-10'),
  ('Gustavo Gonzalez','GustavoGGonzalez@hotmail.com','2006-05-10'),
  ('Juan José','JuanJosePerez@hotmail.com','2006-06-11'),
  ('Fabiola Martinez','MartinezFabiola@hotmail.com','2006-10-12'),
  ('Luisa Martinez','Martinezluisa@hotmail.com','2006-09-12'),
  ('Pepe','PepePerez@hotmail.com','2006-09-12'),
  ('Eva Ruiz','evaruiz@hotmail.com','2006-09-15'),
  ('Paco','paco@hotmail.com','2006-09-15');
  
/* 
Muestre el nombre, la fecha de ingreso y los nombres de los días de la semana empleando 
un "case": 
*/
 select 
	nombre, 
	fecha,
case dayname(fecha)
		when 'Monday' then 'Lunes'
		when 'Tuesday' then 'Martes'
		when 'Wednesday' then 'Miércoles'
		when 'Thursday' then 'Jueves'
		when 'Friday' then 'Viernes'
		when 'Saturday' then 'Sábado'
		else 'Domingo'
	end as 'dia'
from visitas;

/*
Muestre el nombre y fecha de ingreso a la página y con un "case" muestre si el nombre del mes
corresponde al 1º, 2º o 3º cuatrimestre del año.
*/
SELECT nombre, fecha,  
CASE 
	when month(fecha) <4 then 'Cuatrimestre 1'
    when month(fecha) >=4 and month(fecha)<8 then 'Cuatrimestre 2'
    when month(fecha) >=8 then 'Cuatrimestre 3'
    end as 'Cuatrimestre'
    from visitas;

