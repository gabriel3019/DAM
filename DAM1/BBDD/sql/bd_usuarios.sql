-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2024 a las 09:58:41
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_usuarios`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `Actualizar_Avatares` (IN `Nombre_Nuevo` VARCHAR(50), IN `id` INT, IN `foto_nueva` VARCHAR(50))  UPDATE avatares SET avat_nombre = Nombre_Nuevo, avat_foto = foto_nueva WHERE avat_id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Borrar_Avatares` (IN `id` INT)  DELETE FROM avatares WHERE avat_id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Filtrar_Avatares` (IN `Nombre` VARCHAR(50))  SELECT * FROM avatares WHERE avat_nombre LIKE Nombre$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertar_Avatar` (IN `avat_nombre` VARCHAR(50), IN `avat_foto` VARCHAR(50))  INSERT INTO avatares (avat_nombre, avat_foto) VALUES (avat_nombre, avat_foto)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Seleccionar_Avatares` ()  SELECT * FROM avatares$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `Seleccionar_Avatar_ID` (IN `id` INT)  SELECT * FROM avatares WHERE avat_id = id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avatares`
--

CREATE TABLE `avatares` (
  `avat_id` int(11) NOT NULL,
  `avat_nombre` varchar(50) NOT NULL,
  `avat_foto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `avatares`
--

INSERT INTO `avatares` (`avat_id`, `avat_nombre`, `avat_foto`) VALUES
(1, 'Con gafas', 'AVATARZ - Brown hair person.png'),
(2, 'Con gafas y Pañuelo', 'AVATARZ - Lady with squared eyeglasses.png'),
(3, 'Jeque', 'AVATARZ - Sheik.png'),
(4, 'Pelo Negro', 'AVATARZ - Long hair male.png'),
(5, 'Abuelo', 'AVATARZ - Older person.png'),
(6, 'Steve Jobs', 'AVATARZ - Steve Jobs.png'),
(7, 'Tomás', 'AVATARZ - Tomas.png');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avatares`
--
ALTER TABLE `avatares`
  ADD PRIMARY KEY (`avat_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `avatares`
--
ALTER TABLE `avatares`
  MODIFY `avat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
