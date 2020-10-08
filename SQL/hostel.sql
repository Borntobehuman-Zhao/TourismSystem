CREATE TABLE `hostel` (
                          `id` int(11) NOT NULL AUTO_INCREMENT  ,
                          `address` varchar(255) DEFAULT NULL,
                          `phone` varchar(11) NOT NULL,
                          `name` varchar(255) DEFAULT NULL,
                          `url` varchar(255) DEFAULT NULL,
                          PRIMARY KEY (`id`),
                          UNIQUE KEY `hostel_phone_uindex` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;