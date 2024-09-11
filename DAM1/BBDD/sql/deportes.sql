-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-01-2024 a las 13:02:56
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
-- Base de datos: `deportes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportes`
--

CREATE TABLE `deportes` (
  `dep_id` int(11) NOT NULL,
  `dep_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportes`
--

INSERT INTO `deportes` (`dep_id`, `dep_nombre`) VALUES
(1, 'Futbol'),
(2, 'Baloncesto'),
(3, 'Judo'),
(4, 'Tenis');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportes_deportistas`
--

CREATE TABLE `deportes_deportistas` (
  `dep_id` int(11) NOT NULL,
  `dta_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportes_deportistas`
--

INSERT INTO `deportes_deportistas` (`dep_id`, `dta_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportistas`
--

CREATE TABLE `deportistas` (
  `dta_id` int(11) NOT NULL,
  `dta_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportistas`
--

INSERT INTO `deportistas` (`dta_id`, `dta_nombre`) VALUES
(1, 'Garnacho'),
(2, 'Curry'),
(3, 'Celia'),
(4, 'Nadal');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `deportes`
--
ALTER TABLE `deportes`
  ADD PRIMARY KEY (`dep_id`);

--
-- Indices de la tabla `deportes_deportistas`
--
ALTER TABLE `deportes_deportistas`
  ADD PRIMARY KEY (`dep_id`,`dta_id`),
  ADD KEY `dta_id` (`dta_id`);

--
-- Indices de la tabla `deportistas`
--
ALTER TABLE `deportistas`
  ADD PRIMARY KEY (`dta_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `deportes`
--
ALTER TABLE `deportes`
  MODIFY `dep_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `deportistas`
--
ALTER TABLE `deportistas`
  MODIFY `dta_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `deportes_deportistas`
--
ALTER TABLE `deportes_deportistas`
  ADD CONSTRAINT `deportes_deportistas_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `deportes` (`dep_id`),
  ADD CONSTRAINT `deportes_deportistas_ibfk_2` FOREIGN KEY (`dta_id`) REFERENCES `deportistas` (`dta_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
