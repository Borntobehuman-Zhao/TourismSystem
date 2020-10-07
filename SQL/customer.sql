DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `phone` varchar(11) NOT NULL,
                            `idNumber` varchar(20),
                            `password` varchar(255) NOT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `sex` tinyint(1) NOT NULL,
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `customer_phone_uindex` (`phone`),
                            UNIQUE KEY `customer_idNumber_uindex` (`idNumber`),
                            UNIQUE KEY `customer_name_uindex` (`name`),
                            UNIQUE KEY `customer_name_uindex_2` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;