DROP TABLE IF EXISTS `user_table`;
CREATE TABLE `user_table` (
  `id` varchar(36) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(36) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;