CREATE TABLE `room` (
                        `id` int(11) NOT NULL AUTO_INCREMENT,
                        `roomID` varchar(64) NOT NULL,
                        `administrator` varchar(255),
                        `member` float NOT NUll,/*折扣*/
                        `status` tinyint(1) NOT NULL,/*房间状态  0是空房间，1是预订了，2当前已有人入住*/
                        `hostelID` int(11) NOT NULL,
                        `price` double NOT NULL,
                        `type` varchar(10) NOT NULL ,
                        PRIMARY KEY (`id`),
                        CONSTRAINT `room_hostelID` FOREIGN KEY (`hostelID`) REFERENCES `hostel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;