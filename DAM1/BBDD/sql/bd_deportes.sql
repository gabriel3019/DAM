-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2023 a las 12:22:32
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
-- Base de datos: `bd_deportes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportes`
--

CREATE TABLE `deportes` (
  `dte_id` int(11) NOT NULL,
  `dte_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportes`
--

INSERT INTO `deportes` (`dte_id`, `dte_nombre`) VALUES
(4, 'Baloncesto'),
(3, 'Balonmano'),
(7, 'equitacion'),
(1, 'Fútbol'),
(5, 'Golf'),
(6, 'Natación'),
(2, 'Pádel');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportistas`
--

CREATE TABLE `deportistas` (
  `dta_id` int(11) NOT NULL,
  `dta_nombre` varchar(50) NOT NULL,
  `dta_fnac` date DEFAULT NULL,
  `dta_pais` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportistas`
--

INSERT INTO `deportistas` (`dta_id`, `dta_nombre`, `dta_fnac`, `dta_pais`) VALUES
(1, 'Hernando Haldene', '2004-08-28', 'Russia'),
(2, 'Shana McAreavey', '1983-04-28', 'Argentina'),
(3, 'Claudelle Cauldwell', '1996-08-24', 'France'),
(4, 'Ives Klimkowski', '1988-11-13', 'Argentina'),
(5, 'Corri Brentnall', '1988-08-25', 'China'),
(6, 'Jacobo Robuchon', '1999-04-30', 'Philippines'),
(7, 'Yancey McGeachey', '1994-10-01', 'China'),
(8, 'Lesli Paradis', '1981-04-23', 'Poland'),
(9, 'Philippa Rossetti', '1997-06-07', 'Japan'),
(10, 'Carena Lyddiard', '1992-05-03', 'Cuba'),
(11, 'Wendi Jahnisch', '1981-11-16', 'Dominica'),
(12, 'Florentia Mallinson', '1996-11-15', 'Russia'),
(13, 'Calida Westgate', '2008-08-08', 'China'),
(14, 'Nero Naul', '2011-02-27', 'Marshall Islands'),
(15, 'Athene Yewman', '1996-08-24', 'China'),
(16, 'Carlen Burehill', '1984-10-14', 'Mongolia'),
(17, 'Tulley Axtell', '2010-09-28', 'France'),
(18, 'Gertie Hairs', '1988-09-02', 'Indonesia'),
(19, 'Moshe Flaune', '1998-10-27', 'China'),
(20, 'Jsandye Hurrion', '2020-06-09', 'Croatia'),
(21, 'Alphard Shales', '2017-01-12', 'Armenia'),
(22, 'Ambrose Jiricka', '1994-08-04', 'Indonesia'),
(23, 'Mozelle Bricket', '2015-10-13', 'Russia'),
(24, 'Jonis Schuchmacher', '2003-12-16', 'China'),
(25, 'Gene Byway', '1992-01-20', 'Mauritius'),
(26, 'Barnebas Spolton', '2005-07-20', 'Sweden'),
(27, 'Gabey Robinson', '2002-05-03', 'China'),
(28, 'Barris Tranfield', '1989-03-29', 'France'),
(29, 'Dilly Mattaser', '1989-01-10', 'South Korea'),
(30, 'Windham Storks', '2017-11-23', 'China'),
(31, 'Damiano Synder', '1986-10-04', 'Kenya'),
(32, 'Yul Fessler', '2012-02-07', 'Japan'),
(33, 'Henri Conlon', '1992-11-19', 'China'),
(34, 'Rowena Lodge', '2018-06-20', 'China'),
(35, 'Shanta Lanchester', '2003-11-05', 'China'),
(36, 'Shelia Doby', '2016-03-16', 'China'),
(37, 'Al Varsey', '1995-08-05', 'Argentina'),
(38, 'Kelsi Martijn', '2007-04-18', 'Angola'),
(39, 'Odille Saunter', '1984-02-24', 'Colombia'),
(40, 'Gibb Franzman', '1994-05-02', 'China'),
(41, 'Cathleen Brain', '1994-03-22', 'Tanzania'),
(42, 'Scarlett Chadbourne', '1994-05-13', 'Greece'),
(43, 'Janela Nield', '1992-12-27', 'United States'),
(44, 'Danie Neumann', '2019-11-01', 'Philippines'),
(45, 'Valentine Phateplace', '1985-08-23', 'Ukraine'),
(46, 'Bonni Eldin', '2015-12-24', 'Burundi'),
(47, 'Hyacinth Padley', '1998-09-03', 'Chad'),
(48, 'Graehme Canario', '2012-05-23', 'Tunisia'),
(49, 'Lenore Sproston', '2016-06-11', 'China'),
(50, 'Brett Rude', '1987-07-02', 'Portugal'),
(51, 'Pepe', '1992-09-19', 'Spain');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportistas_deporte`
--

CREATE TABLE `deportistas_deporte` (
  `dd_dta_id` int(11) NOT NULL,
  `dd_dte_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `deportistas_deporte`
--

INSERT INTO `deportistas_deporte` (`dd_dta_id`, `dd_dte_id`) VALUES
(13, 6),
(16, 2),
(21, 2),
(21, 4),
(21, 5),
(22, 1),
(27, 2),
(28, 1),
(31, 1),
(37, 4),
(37, 6),
(46, 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `deportes`
--
ALTER TABLE `deportes`
  ADD PRIMARY KEY (`dte_id`),
  ADD UNIQUE KEY `dte_nombre` (`dte_nombre`);

--
-- Indices de la tabla `deportistas`
--
ALTER TABLE `deportistas`
  ADD PRIMARY KEY (`dta_id`),
  ADD UNIQUE KEY `dta_nombre` (`dta_nombre`);

--
-- Indices de la tabla `deportistas_deporte`
--
ALTER TABLE `deportistas_deporte`
  ADD PRIMARY KEY (`dd_dta_id`,`dd_dte_id`),
  ADD KEY `r-deportes` (`dd_dte_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `deportes`
--
ALTER TABLE `deportes`
  MODIFY `dte_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `deportistas`
--
ALTER TABLE `deportistas`
  MODIFY `dta_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `deportistas_deporte`
--
ALTER TABLE `deportistas_deporte`
  ADD CONSTRAINT `r-deportes` FOREIGN KEY (`dd_dte_id`) REFERENCES `deportes` (`dte_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `r-deportistas` FOREIGN KEY (`dd_dta_id`) REFERENCES `deportistas` (`dta_id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
