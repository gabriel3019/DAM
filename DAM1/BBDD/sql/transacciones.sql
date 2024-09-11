
-- PROCEDURE PARA INSERTAR REGISTROS --
drop procedure Insertar_registros;
delimiter $$
create procedure Insertar_registros (in cantidad int)
begin
	declare contador int default 1;
    while contador <= cantidad do
		insert into datos values(null, concat("registro numero", contador));
        set contador = contador + 1;
	end while;
    select contador as insertado;
end $$
delimiter ;

call Insertar_registros(10000);

-- Transacciones --
#En vez de escribirlo directamemnte lo guarda por ahi, commit es decirle que esta bien y rollback es decirle que esta fatal.
truncate datos;

start transaction;
call Insertar_registros(10);


