CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NULL,
  `perfil` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);
  
ALTER TABLE `usuario`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
