-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-04-2024 a las 10:14:20
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
-- Base de datos: `bd_almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cli_id` int(11) NOT NULL,
  `cli_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`) VALUES
(1, 'Cliente 1'),
(2, 'Cliente 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entradas`
--

CREATE TABLE `entradas` (
  `ent_id` int(11) NOT NULL,
  `ent_prov_id` int(11) NOT NULL,
  `ent_prod_id` int(11) NOT NULL,
  `ent_cantidad` int(11) NOT NULL,
  `ent_fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `entradas`
--

INSERT INTO `entradas` (`ent_id`, `ent_prov_id`, `ent_prod_id`, `ent_cantidad`, `ent_fecha`) VALUES
(2, 1, 1, 100, '2024-04-02 08:10:09'),
(3, 1, 2, 100, '2024-04-02 08:13:43');

--
-- Disparadores `entradas`
--
DELIMITER $$
CREATE TRIGGER `Al_Insertar` AFTER INSERT ON `entradas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock + NEW.ent_cantidad
WHERE prod_id = NEW.ent_prod_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `BD_delete` BEFORE DELETE ON `entradas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock - OLD.ent_cantidad
WHERE prod_id = OLD.ent_prod_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `BU_update` BEFORE UPDATE ON `entradas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock - OLD.ent_cantidad + 
    NEW.ent_cantidad
WHERE prod_id = OLD.ent_prod_id
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `prod_id` int(11) NOT NULL,
  `prod_nombre` varchar(50) NOT NULL,
  `prod_precio_e` decimal(10,2) NOT NULL,
  `prod_precio_s` decimal(10,2) NOT NULL,
  `prod_stock` int(11) NOT NULL,
  `prod_prov_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`prod_id`, `prod_nombre`, `prod_precio_e`, `prod_precio_s`, `prod_stock`, `prod_prov_id`) VALUES
(1, 'Regalices', '1.00', '2.00', 50, 1),
(2, 'Chicles', '0.50', '1.50', 70, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedore`
--

CREATE TABLE `proveedore` (
  `prov_id` int(11) NOT NULL,
  `prov_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedore`
--

INSERT INTO `proveedore` (`prov_id`, `prov_nombre`) VALUES
(1, 'Proveedor 1'),
(2, 'Proveedor 2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--

CREATE TABLE `salidas` (
  `sal_id` int(11) NOT NULL,
  `sal_cli_id` int(11) NOT NULL,
  `sal_prod_id` int(11) NOT NULL,
  `sal_cantidad` int(11) NOT NULL,
  `sal_fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `salidas`
--

INSERT INTO `salidas` (`sal_id`, `sal_cli_id`, `sal_prod_id`, `sal_cantidad`, `sal_fecha`) VALUES
(2, 1, 2, 30, '2024-04-02 08:09:17'),
(3, 1, 1, 50, '2024-04-02 08:09:56');

--
-- Disparadores `salidas`
--
DELIMITER $$
CREATE TRIGGER `Sal_Insertar` AFTER INSERT ON `salidas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock - NEW.sal_cantidad
WHERE prod_id = NEW.sal_prod_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `Sal_delete` BEFORE DELETE ON `salidas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock + OLD.sal_cantidad
WHERE prod_id = OLD.sal_prod_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `Sal_update` BEFORE UPDATE ON `salidas` FOR EACH ROW UPDATE productos
SET prod_stock = 
	prod_stock + OLD.sal_cantidad - 
    NEW.sal_cantidad
WHERE prod_id = OLD.sal_prod_id
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cli_id`);

--
-- Indices de la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`ent_id`),
  ADD KEY `r_ent_prov` (`ent_prov_id`),
  ADD KEY `r_ent_prod` (`ent_prod_id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`prod_id`),
  ADD KEY `r_proveedores` (`prod_prov_id`);

--
-- Indices de la tabla `proveedore`
--
ALTER TABLE `proveedore`
  ADD PRIMARY KEY (`prov_id`);

--
-- Indices de la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD PRIMARY KEY (`sal_id`),
  ADD KEY `r_sal_cli` (`sal_cli_id`),
  ADD KEY `r_sal_prod` (`sal_prod_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `cli_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `entradas`
--
ALTER TABLE `entradas`
  MODIFY `ent_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `prod_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `proveedore`
--
ALTER TABLE `proveedore`
  MODIFY `prov_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `salidas`
--
ALTER TABLE `salidas`
  MODIFY `sal_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `r_ent_prod` FOREIGN KEY (`ent_prod_id`) REFERENCES `productos` (`prod_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `r_ent_prov` FOREIGN KEY (`ent_prov_id`) REFERENCES `proveedore` (`prov_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `r_proveedores` FOREIGN KEY (`prod_prov_id`) REFERENCES `proveedore` (`prov_id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD CONSTRAINT `r_sal_cli` FOREIGN KEY (`sal_cli_id`) REFERENCES `clientes` (`cli_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `r_sal_prod` FOREIGN KEY (`sal_prod_id`) REFERENCES `productos` (`prod_id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
