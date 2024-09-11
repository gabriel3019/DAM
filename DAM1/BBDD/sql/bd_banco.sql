-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-04-2024 a las 10:23:42
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
-- Base de datos: `bd_banco`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE ` m_borrar` (IN `_id` INT)  delete from movimientos where m_id = _id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE ` m_mayor` (IN `_mayor` DECIMAL(10,2))  select * from movimientos WHERE m_importe > _mayor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_borrar` (IN `_id` INT)  delete from cuentas where c_num_cta = _id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_insertar` (IN `_nif` VARCHAR(50), IN `_titular` VARCHAR(50), IN `_fecha` DATETIME, IN `_saldo` DECIMAL(10,2))  insert into cuentas values (null, _nif, _titular, now(), _saldo)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_modificar` (IN `_id` INT, IN `_nif` VARCHAR(50), IN `_titular` VARCHAR(50))  UPDATE cuentas SET
    c_nif = _nif,
    c_titular = _titular
    WHERE c_num_cta = _id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_por_cta` (IN `_id` INT)  select * from cuentas where c_num_cta = _id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_saldos_mayor` (IN `_mayor` DECIMAL(10,2))  select * from cuentas WHERE c_saldo > _mayor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_saldos_menor` (IN `_menor` DECIMAL(10,2))  select * from cuentas WHERE c_saldo < _menor$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `cta_todas_filtrado` (IN `_filtro` VARCHAR(50))  select * from cuentas where c_nif like concat('%', _filtro, '%') OR c_fecha_creacion like concat('%', _filtro, '%') OR c_titular like concat('%', _filtro, '%')$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `m_insertar` (IN `_m_c_num_cta` INT, IN `_fecha` DATETIME, IN `_importe` DECIMAL(10,2), IN `_concepto` VARCHAR(50))  insert into movimientos values (null, _m_c_num_cta, now(), _importe, _concepto)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `m_modificar` (IN `_id` INT, IN `_cta` INT, IN `_fecha` DATETIME, IN `_importe` DECIMAL(10,2), IN `_concepto` VARCHAR(50))  UPDATE movimientos SET
    m_c_num_cta = _cta,
    m_fecha = _fecha,
    m_importe = _importe,
    m_concepto = _concepto
    WHERE m_id = _id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `m_mvtos_entre_fechas` (IN `_cta` INT, IN `_fecha` DATETIME, IN `_fecha2` DATETIME)  if _cta = null then
	select * from movimientos where m_fecha > _fecha AND m_fecha < _fecha2;
    else
    select * from movimientos where m_c_num_cta = _cta AND m_fecha > _fecha AND m_fecha < _fecha2;
    end if$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `m_todos_filtrado` (IN `_filtro` VARCHAR(50))  select * from movimientos, cuentas where m_c_num_cta = c_num_cta OR c_fecha_creacion like concat('%', _filtro, '%')  OR c_nif like concat('%', _filtro, '%') OR c_titular like concat('%', _filtro, '%')$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `m_todos_por_cuenta` (IN `_id` INT)  select * from movimientos where m_id = _id$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `c_num_cta` int(11) NOT NULL,
  `c_nif` varchar(9) NOT NULL,
  `c_titular` varchar(50) NOT NULL,
  `c_fecha_creacion` date NOT NULL,
  `c_saldo` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`c_num_cta`, `c_nif`, `c_titular`, `c_fecha_creacion`, `c_saldo`) VALUES
(1, '343433ffd', 'pepe', '2024-04-16', '41.00'),
(2, '345MDK4', 'Celia', '2024-04-18', '25.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

CREATE TABLE `movimientos` (
  `m_id` int(11) NOT NULL,
  `m_c_num_cta` int(11) NOT NULL,
  `m_fecha` datetime NOT NULL,
  `m_importe` decimal(10,2) DEFAULT NULL,
  `m_concepto` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `movimientos`
--

INSERT INTO `movimientos` (`m_id`, `m_c_num_cta`, `m_fecha`, `m_importe`, `m_concepto`) VALUES
(7, 1, '2024-04-16 13:39:24', '29.00', 'ss'),
(8, 2, '2024-04-18 09:51:07', '12.00', 'Botas');

--
-- Disparadores `movimientos`
--
DELIMITER $$
CREATE TRIGGER `trigger_mvto_aI` AFTER INSERT ON `movimientos` FOR EACH ROW begin
	update cuentas SET c_saldo =
	c_saldo + NEW.m_importe
	WHERE c_num_cta = NEW.m_c_num_cta;
end
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trigger_mvto_bd` BEFORE DELETE ON `movimientos` FOR EACH ROW update cuentas SET c_saldo = c_saldo - OLD.m_importe
WHERE c_num_cta = OLD.m_c_num_cta
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `trigger_mvto_bu` BEFORE UPDATE ON `movimientos` FOR EACH ROW UPDATE cuentas SET c_saldo = c_saldo - OLD.m_importe + NEW.m_importe
WHERE c_num_cta = NEW.m_c_num_cta
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`c_num_cta`);

--
-- Indices de la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD PRIMARY KEY (`m_id`),
  ADD KEY `m_c_num_cta` (`m_c_num_cta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  MODIFY `c_num_cta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `movimientos`
--
ALTER TABLE `movimientos`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD CONSTRAINT `movimientos_ibfk_1` FOREIGN KEY (`m_c_num_cta`) REFERENCES `cuentas` (`c_num_cta`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
