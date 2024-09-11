-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-04-2024 a las 11:25:33
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
-- Base de datos: `bd_academia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `alu_id` int(11) NOT NULL,
  `alu_nombre` varchar(50) NOT NULL,
  `alu_apellidos` varchar(50) NOT NULL,
  `alu_fnac` date NOT NULL,
  `alu_asi_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`alu_id`, `alu_nombre`, `alu_apellidos`, `alu_fnac`, `alu_asi_id`) VALUES
(1, 'Pepe', 'Guardiola', '2000-01-01', 1),
(2, 'Juan', 'García', '1999-01-01', 1),
(3, 'Ana', 'Bowele', '2001-01-01', 2),
(4, 'Eva', 'Sanchez', '2002-01-01', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignaturas`
--

CREATE TABLE `asignaturas` (
  `asi_id` int(11) NOT NULL,
  `asi_nombre` varchar(50) NOT NULL,
  `asi_descripcion` text NOT NULL,
  `asi_cur_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignaturas`
--

INSERT INTO `asignaturas` (`asi_id`, `asi_nombre`, `asi_descripcion`, `asi_cur_id`) VALUES
(1, 'FOL', '', 1),
(2, 'FOL', '', 2),
(3, 'Lenguaje de Marcas', '', 1),
(4, 'Lenguaje de Marcas', '', 2),
(5, 'Bases de datos', '', 1),
(6, 'Bases de datos', '', 2),
(7, 'Programación', '', 1),
(8, 'Programación', '', 2),
(9, 'Sistemas informáticos', '', 1),
(10, 'Sistemas informáticos', '', 2),
(11, 'Entornos de desarrollo', '', 1),
(12, 'Entornos de desarrollo', '', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `cur_id` int(11) NOT NULL,
  `cur_nombre` varchar(50) NOT NULL,
  `cur_plazas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`cur_id`, `cur_nombre`, `cur_plazas`) VALUES
(1, 'DAM1', 30),
(2, 'DAW1', 25),
(3, 'DAM2', 20),
(4, 'DAW2', 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE `notas` (
  `nota_alu_id` int(11) NOT NULL,
  `nota_asi_id` int(11) NOT NULL,
  `nota_fecha` date NOT NULL,
  `nota` decimal(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`alu_id`),
  ADD KEY `r_asignaturas` (`alu_asi_id`);

--
-- Indices de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD PRIMARY KEY (`asi_id`),
  ADD KEY `r_cursos` (`asi_cur_id`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`cur_id`);

--
-- Indices de la tabla `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`nota_alu_id`,`nota_asi_id`,`nota_fecha`),
  ADD KEY `r_asignaturas1` (`nota_asi_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `alu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `asi_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `cur_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD CONSTRAINT `r_asignaturas` FOREIGN KEY (`alu_asi_id`) REFERENCES `asignaturas` (`asi_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD CONSTRAINT `r_cursos` FOREIGN KEY (`asi_cur_id`) REFERENCES `cursos` (`cur_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `notas`
--
ALTER TABLE `notas`
  ADD CONSTRAINT `r_alumnos` FOREIGN KEY (`nota_alu_id`) REFERENCES `alumnos` (`alu_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `r_asignaturas1` FOREIGN KEY (`nota_asi_id`) REFERENCES `asignaturas` (`asi_id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
