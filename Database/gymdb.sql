SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

CREATE TABLE `Trainerdetails` (
  `Firstname` varchar(30) DEFAULT NULL,
  `Lastname` varchar(30) DEFAULT NULL,
  `PhoneNo` varchar(30) DEFAULT NULL,
  `Age` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Gender` varchar(30) DEFAULT NULL,
  `Dayofbirth` varchar(30) DEFAULT NULL,
  `Monthofbirth` varchar(30) DEFAULT NULL,
  `Yearofbirth` varchar(30) DEFAULT NULL,
  `Trainertype` varchar(30) DEFAULT NULL,
  `Height` varchar(30) DEFAULT NULL,
  `Weight` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `Trainerdetails` (`Firstname`, `Lastname`, `PhoneNo`, `Age`, `Email`, `Gender`, `Dayofbirth`, `Monthofbirth`, `Yearofbirth`, `Trainertype`, `Height`, `Weight`)
VALUES ('Naod', 'Zekeria', '0912211212', '21', 'naoo@example.com', 'Male', '10', '1', '1990', 'Personal Trainer', '175', '70');

CREATE TABLE `customerdetails` (
  `Firstname` varchar(30) DEFAULT NULL,
  `Lastname` varchar(30) DEFAULT NULL,
  `Age` varchar(30) DEFAULT NULL,
  `Gender` varchar(30) DEFAULT NULL,
  `Dayofbirth` varchar(30) DEFAULT NULL,
  `Monthofbirth` varchar(30) DEFAULT NULL,
  `Yearofbirth` varchar(30) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `PhoneNo` varchar(20) DEFAULT NULL,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Height` varchar(30) DEFAULT NULL,
  `Weight` varchar(30) DEFAULT NULL,
  `Plan`varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `customerdetails` (`Firstname`, `Lastname`, `Age`, `Gender`, `Dayofbirth`, `Monthofbirth`, `Yearofbirth`, `Email`, `PhoneNo`, `Username`, `Password`, `Height`, `Weight`, `Plan`)
VALUES ('sofia', 'ali', '25', 'Female', '15', '3', '1998', 'saah@example.com', '09876543210', 'soal', 'pass123', '165', '55', '6 Month');
