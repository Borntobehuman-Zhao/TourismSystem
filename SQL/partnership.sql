CREATE TABLE `partnership` (
                               `attractionsID` int(11) NOT NULL,
                               `id` int(11) NOT NULL AUTO_INCREMENT,
                               `hostelID` int(11) DEFAULT NULL,
                               `distance` int(11) NOT NULL,
                               PRIMARY KEY (`id`),
                               KEY `partnership___attractions` (`attractionsID`),
                               CONSTRAINT `partnership___attractions` FOREIGN KEY (`attractionsID`) REFERENCES `attractions` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;