-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-09-2023 a las 14:13:39
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
-- Base de datos: `bd_empresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `dep_id` int(11) NOT NULL,
  `dep_nombre` varchar(50) NOT NULL,
  `dep_observaciones` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`dep_id`, `dep_nombre`, `dep_observaciones`) VALUES
(1, 'COMERCIAL', 'No hacen nada'),
(2, 'ADMINISTRACIÓN', 'Burocracia'),
(3, 'INFORMATICA', 'Los mejores');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `em_id` int(11) NOT NULL,
  `em_nombre` varchar(50) NOT NULL,
  `em_apellidos` varchar(50) NOT NULL,
  `em_dep_id` int(11) NOT NULL,
  `em_sueldo` decimal(10,2) NOT NULL,
  `em_telefono` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`em_id`, `em_nombre`, `em_apellidos`, `em_dep_id`, `em_sueldo`, `em_telefono`) VALUES
(1, 'Pepe', 'Gomez', 1, '30000.00', '(34) 678.86.75.98'),
(2, 'Eva', 'Ruiz', 1, '28000.00', '(34) 654.12.34.56'),
(3, 'Ana', 'Lopez', 2, '32000.00', '645094521'),
(4, 'Juan', 'Rodriguez', 3, '43000.00', '600677432'),
(5, 'Evaristo', 'HU', 2, '18000.00', ''),
(7, 'dd', '', 3, '27000.00', ''),
(8, 'Perico', 'De Los Palotes', 1, '20000.00', '649004576');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`dep_id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`em_id`),
  ADD KEY `r-empleados-departamentos` (`em_dep_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `dep_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `em_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `r-empleados-departamentos` FOREIGN KEY (`em_dep_id`) REFERENCES `departamentos` (`dep_id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
