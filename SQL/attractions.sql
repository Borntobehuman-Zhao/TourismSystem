DROP TABLE IF EXISTS `attractions`;
CREATE TABLE `attractions` (
                               `id` int(11) NOT NULL AUTO_INCREMENT,
                               `phone` varchar(11) NOT NULL,
                               `address` varchar(255) NOT NULL,
                               `price` double NOT NULL,
                               `name` varchar(255) NOT NULL,
                               `files` varchar(255),
                               `url` varchar(255),
                               PRIMARY KEY (`id`),
                               UNIQUE KEY `attractions_name_uindex` (`name`),
                               UNIQUE KEY `attractions_phone_uindex` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;