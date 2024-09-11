-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2023 a las 22:18:15
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_ejemplos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `nombre` varchar(120) DEFAULT NULL,
  `apellidos` varchar(120) DEFAULT NULL,
  `departamento` varchar(120) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `apellidos`, `departamento`, `salario`) VALUES
(1, 'Paul', 'Garrix', 'Grandes Cuentas', 3547.25),
(2, 'Astrid', 'Fox', 'Pequeños Clientes', 2845.56),
(3, 'Matthias', 'Johnson', 'Pequeños Clientes', 3009.41),
(4, 'Lucy', 'Patterson', 'Pequeños Clientes', 3547.25),
(5, 'Tom', 'Page', 'Grandes Cuentas', 5974.41),
(6, 'Claudia', 'Conte', 'Grandes Cuentas', 4714.12),
(7, 'Walter', 'Deer', 'Pequeños Clientes', 3547.25),
(8, 'Stephanie', 'Marx', 'Grandes Cuentas', 2894.51),
(9, 'Luca', 'Pavarotti', 'Pequeños Clientes', 4123.45),
(10, 'Victoria', 'Pollock', 'Grandes Cuentas', 4789.53);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas_trimestrales`
--

CREATE TABLE `ventas_trimestrales` (
  `ventas_anio` int(11) NOT NULL,
  `empleado_id` int(11) NOT NULL,
  `t1` decimal(10,2) DEFAULT NULL,
  `t2` decimal(10,2) DEFAULT NULL,
  `t3` decimal(10,2) DEFAULT NULL,
  `t4` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas_trimestrales`
--

INSERT INTO `ventas_trimestrales` (`ventas_anio`, `empleado_id`, `t1`, `t2`, `t3`, `t4`) VALUES
(2022, 1, 8715.55, 8465.65, 24747.82, 3514.36),
(2022, 2, 4989.23, 5103.22, 4897.98, 5322.05),
(2022, 3, 12774.51, 24784.31, 12223.34, 8451.51),
(2022, 4, 5417.81, 12846.23, 8741.54, 3589.99),
(2022, 5, 6349.74, 7555.55, 6944.35, 7788.01),
(2022, 6, 2498.63, 8741.45, 3997.65, 2497.21),
(2022, 7, 18415.66, 15279.37, 14634.44, 14445.12),
(2022, 8, 3471.41, 14789.25, 3478.34, 1254.23),
(2022, 9, 4485.36, 4101.50, 8787.45, 7648.90),
(2022, 10, 1547.52, 1269.66, 1478.65, 2474.33),
(2023, 1, 7000.00, 7500.00, NULL, NULL),
(2023, 2, 3000.00, 5000.00, NULL, NULL),
(2023, 3, 12000.00, 24000.00, NULL, NULL),
(2023, 4, 5600.81, 15000.00, NULL, NULL),
(2023, 5, 7000.00, 8000.00, NULL, NULL),
(2023, 6, 2000.00, 9000.00, NULL, NULL),
(2023, 7, 20000.00, 15000.37, NULL, NULL),
(2023, 8, 5000.00, 20000.00, NULL, NULL),
(2023, 9, 5000.00, 4000.00, NULL, NULL),
(2023, 10, 4000.00, 3000.00, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas_trimestrales`
--
ALTER TABLE `ventas_trimestrales`
  ADD PRIMARY KEY (`ventas_anio`,`empleado_id`),
  ADD KEY `r-empleados` (`empleado_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ventas_trimestrales`
--
ALTER TABLE `ventas_trimestrales`
  ADD CONSTRAINT `r-empleados` FOREIGN KEY (`empleado_id`) REFERENCES `empleados` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
