CREATE TABLE `recording` (
                             `id` int(11) NOT NULL AUTO_INCREMENT,
                             `customerID` int(11) DEFAULT NULL,
                             `hostelID` int(11) DEFAULT NULL,
                             `roomID` int(11) DEFAULT NULL,
                             `time` datetime DEFAULT NULL,
                             PRIMARY KEY (`id`),
                             KEY `recording___customerID` (`customerID`),
                             KEY `recording___hostelID` (`hostelID`),
                             KEY `recording___roomID` (`roomID`),
                             CONSTRAINT `recording___customerID` FOREIGN KEY (`customerID`) REFERENCES `customer` (`id`),
                             CONSTRAINT `recording___hostelID` FOREIGN KEY (`hostelID`) REFERENCES `hostel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;