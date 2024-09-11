@���#� %�磓�    /Actividad3.1           -org.eclipse.core.resources.noExplicitEncoding  severity    location /Actividad3.1 message 3Project 'Actividad3.1' has no explicit encoding set  ��`T��X��#� Q�{�w�                                                                                                                                                                                                                                                                                               NNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_trigger`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Cli_id` int(11) NOT NULL,
  `cli_nombre` varchar(50) NOT NULL,
  `cli_dni` varchar(50) NOT NULL,
  `cli_telefono` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`Cli_id`, `cli_nombre`, `cli_dni`, `cli_telefono`) VALUES
(3, 'fffffff', 'ffffffff', '678456128');

--
-- Disparadores `clientes`
--
DELIMITER $$
CREATE TRIGGER `BD_AfterInsert` AFTER INSERT ON `clientes` FOR EACH ROW INSERT INTO historico VALUES (null, null,null,null, NEW.cli_nombre, NEW.cli_dni, NEW.cli_telefono, now(),NEW.cli_id, 1)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `BD_BeforeDelete` BEFORE DELETE ON `clientes` FOR EACH ROW INSERT INTO historico VALUES (null, OLD.cli_nombre, OLD.cli_dni, OLD.cli_telefono, null, null, null, now(), OLD.cli_id, 1)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `BU_BeforeUpdate` BEFORE UPDATE ON `clientes` FOR EACH ROW INSERT INTO historico VALUES (null, OLD.cli_nombre, OLD.cli_dni, OLD.cli_telefono, NEW.cli_nombre, NEW.cli_dni, NEW.cli_telefono, now(), NEW.cli_id, 1)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historico`
--

CREATE TABLE `historico` (
  `hist_id` int(11) NOT NULL,
  `hist_nombreAnterior` varchar(50) DEFAULT NULL,
  `hist_dniAnterior` varchar(50) DEFAULT NULL,
  `hist_telefonoAnterior` varchar(50) DEFAULT NULL,
  `hist_nombreActual` varchar(50) DEFAULT NULL,
  `hist_dniActual` varchar(50) DEFAULT NULL,
  `hist_telefonoActual` varchar(50) DEFAULT NULL,
  `hist_fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `hist_cli_id` int(11) NOT NULL,
  `hist_usu_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `historico`
--

INSERT INTO `historico` (`hist_id`, `hist_nombreAnterior`, `hist_dniAnterior`, `hist_telefonoAnterior`, `hist_nombreActual`, `hist_dniActual`, `hist_telefonoActual`, `hist_fecha`, `hist_cli_id`, `hist_usu_id`) VALUES
(2, NULL, NULL, NULL, 'fffffff', 'ffffffff', '678456123', '2024-04-04 07:46:05', 3, 1),
(3, 'fffffff', 'ffffffff', '678456123', 'fffffff', 'ffffffff', '678456128', '2024-04-04 07:48:50', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Usu_id` int(11) NOT NULL,
  `Usu_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Usu_id`, `Usu_nombre`) VALUES
(1, 'Alberto');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Cli_id`);

--
-- Indices de la tabla `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`hist_id`),
  ADD KEY `r_hist_usuario` (`hist_usu_id`),
  ADD KEY `r_hist_cliente` (`hist_cli_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Usu_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `Cli_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `historico`
--
ALTER TABLE `historico`
  MODIFY `hist_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Usu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historico`
--
ALTER TABLE `historico`
  ADD CONSTRAINT `r_hist_cliente` FOREIGN KEY (`hist_cli_id`) REFERENCES `clientes` (`Cli_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `r_hist_usuario` FOREIGN KEY (`hist_usu_id`) REFERENCES `usuarios` (`Usu_id`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
