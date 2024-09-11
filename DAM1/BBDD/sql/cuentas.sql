#PROCEDURES
 -- 1 cta_todas_filtrado por cuenta, nif, fecha de creación y titular  --
 
 drop procedure cta_todas_filtrado;
 delimiter $$
 create procedure cta_todas_filtrado ( in _filtro varchar(50))
 begin 
	select * from cuentas where c_nif like concat('%', _filtro, '%') OR c_fecha_creacion like concat('%', _filtro, '%') OR c_titular like concat('%', _filtro, '%');
end $$
delimiter ;

insert into cuentas values (null, 'AH3GJNDJ', 'ALBERTO', now(), '0');

call cta_todas_filtrado ('2');

-- 2 cta_por_cta --
drop procedure cta_por_cta;
delimiter $$
create procedure cta_por_cta ( in _id int)
begin 
	select * from cuentas where c_num_cta = _id;
end $$
delimiter ;

call cta_por_cta (1);

-- 3 cta_insertar --
drop procedure cta_insertar;
delimiter $$
create procedure cta_insertar ( in _nif varchar(50), in _titular varchar(50),  in  _fecha varchar(50), in _saldo decimal(10,2))
begin
	insert into cuentas values (null, _nif, _titular, _fecha, _saldo);
    SELECT last_insert_id() as RESPUESTA;
end $$
delimiter ;

call cta_insertar ('ERGSDDE4', 'GABRI',now(), 13.5);

-- 4 cta_modificar --
drop procedure cta_modificar;
delimiter $$
create procedure cta_modificar (in _id int, in _nif varchar(50), in _titular varchar(50))
begin
	UPDATE cuentas SET
    c_nif = _nif,
    c_titular = _titular
    WHERE c_num_cta = _id;
	SELECT row_count() AS Respuesta;
end $$
delimiter ;
    
call cta_modificar (1, '3456677', 'ALBERT');

-- 5 cta_borrar -- 
drop procedure cta_borrar;
delimiter $$
create procedure cta_borrar ( in _id int)
begin
	delete from cuentas where c_num_cta = _id;
    SELECT row_count() AS Respuesta;
end $$
delimiter ;
    
call cta_borrar (2);

 -- 5 cta_saldos_menor que una cantidad --
 drop procedure cta_saldos_menor;
 delimiter $$ 
 create procedure cta_saldos_menor (in _menor decimal(10,2))
 begin 
	select * from cuentas WHERE c_saldo < _menor;
end $$
delimiter ;

call cta_saldos_menor (0);

-- 6 cta_saldos_mayor que una cantidad --
drop procedure cta_saldos_mayor;
 delimiter $$ 
 create procedure cta_saldos_mayor (in _mayor decimal(10,2))
 begin 
	select * from cuentas WHERE c_saldo > _mayor;
end $$
delimiter ;

call cta_saldos_mayor (0);








