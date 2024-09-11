-- 1)TODOS FILTRADO --
drop procedure libros_todo_filtrado;
delimiter $$
create procedure libros_todo_filtrado (in _filtro varchar(50))
begin
	select * from libros where lib_titulo like concat('%', _filtro, '%') or 
    lib_autor like concat('%', _filtro, '%') or 
    lib_editorial like concat('%', _filtro, '%') or 
    lib_precio like concat('%', _filtro, '%') or 
    lib_stock like concat('%', _filtro, '%');
end $$
delimiter ;

call libros_todo_filtrado('a');

-- 2)LIBROS ENTRE PRECIO --
drop procedure libros_entre_precio;
delimiter $$
create procedure libros_entre_precio (in _desde int, in _hasta int)
begin
	select * from libros where lib_precio >= _desde and lib_precio <= _hasta;
end $$
delimiter ;

call libros_entre_precio(12, 15);

-- 3)LIBROS INSERTAR --
delimiter $$
create procedure insertar_libros (IN _titulo VARCHAR(50), IN _autor VARCHAR(50), IN _editorial VARCHAR(50), IN _precio FLOAT)   
BEGIN
	INSERT INTO libros VALUES (null, _titulo, _autor, _editorial, _precio, 0);
    SELECT last_insert_id() as respuesta;
END $$
delimiter ;

call insertar_libros('gggg', 'dddd', 'fffff', 12);

-- 4)LIBROS MODIFICAR --
delimiter $$
create procedure modificar_libros (IN _id INT, IN _titulo VARCHAR(50), IN _autor VARCHAR(50), IN _editorial VARCHAR(50), IN _precio FLOAT)   
BEGIN
	UPDATE libros SET
		lib_titulo = _titulo, 
        lib_autor = _autor, 
        lib_editorial = _editorial, 
        lib_precio = _precio
    WHERE lib_id = _id;
    SELECT row_count() as respuesta;
END$$
delimiter ;

call modificar_libros(5, 'dddddd', 'hhhhhhh', 'wwwwwwww', 30);

-- 5)LIBROS ELIMINAR --
delimiter $$
create procedure eliminar_libros (IN _id INT)   
BEGIN
	DELETE FROM libros where lib_id = _id;
    SELECT row_count() as respuesta;
END$$
delimiter ;

call eliminar_libros(5);

-- 6)VENTAS INSERTAR --
delimiter $$
create procedure insertar_ventas(IN _id_libro INT, IN _precio FLOAT, IN _cantidad INT)   
BEGIN
	INSERT INTO ventas VALUES (null, _id_libro, _precio, _cantidad);
    SELECT last_insert_id() as respuesta;
END$$
delimiter ;

call insertar_ventas(1,10,2);

-- 7)MODIFICAR VENTAS --
delimiter $$
create procedure modificar_ventas (IN _id_ventas INT, IN _id_libro INT, IN _precio FLOAT, IN _cantidad INT)   
BEGIN
	UPDATE ventas SET
		ven_lib_id = _id_libro, 
       	ven_precio = _precio, 
		ven_cantidad = _cantidad
    	WHERE ven_id = _id_ventas;
   	 SELECT row_count() as respuesta;
END$$

DELIMITER ;

call modificar_ventas(1,2,30,3)

-- 8) TRIGGER_VENTAS_AI 
DELIMITER $$
CREATE TRIGGER TRIGGER_VENTAS_AI 
AFTER INSERT ON ventas 
FOR EACH ROW 
UPDATE libros SET
	lib_stock = lib_stock - NEW.ven_cantidad
WHERE lib_id = NEW.ven_lib_id
$$
DELIMITER ;

-- 9) TRIGGER_VENTAS_BU
delimiter $$
CREATE TRIGGER TRIGGER_VENTAS_BU 
BEFORE UPDATE ON ventas 
FOR EACH ROW UPDATE libros SET
	lib_stock = lib_stock + OLD.ven_cantidad - NEW.ven_cantidad
WHERE lib_id = NEW.ven_lib_id
$$
DELIMITER ;

-- 10) TRIGGER_VENTAS_BD
DELIMITER $$
CREATE TRIGGER TRIGGER_VENTAS_BD 
BEFORE DELETE ON ventas 
FOR EACH ROW 
UPDATE libros SET
	lib_stock = lib_stock + OLD.ven_cantidad
WHERE lib_id = OLD.ven_lib_id
$$
DELIMITER ;