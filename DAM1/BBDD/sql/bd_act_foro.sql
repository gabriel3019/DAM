create database bd_foros;
use bd_foros;

#Login 
SELECT * FROM usuarios WHERE usu_alias = 'xxx' AND usu_password = md5('xxx'); #Sustituir las x por un valor de verdad
#Registro 
INSERT INTO usuarios VALUES(null, 'xxx','xxx','xxx', 'xxx',0);
#Seleccionar temas
SELECT t.*, COUNT(m.men_id) as contador
FROM temas as t LEFT JOIN mensajes as m
ON(t.tema_id = m.men_tema_id)
GROUP BY t.tema_id
ORDER BY t.tema_tema;
#Insertar Temas
INSERT INTO temas VALUES (null, 'xxx');
#Borrar Temas
DELETE FROM temas WHERE tema_id =  'xxx';
#Seleccionar Mensajes por tema
SELECT * FROM mensajes WHERE men_tema_id = 'xxx';
#Insertar mensajes
INSERT INTO mensajes VALUES (null, 'xxx', 'xxx', 'xxx', now());
#Borrar mensajes
DELETE FROM mensajes WHERE men_id = 'xxx'