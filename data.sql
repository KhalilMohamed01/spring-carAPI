CREATE TABLE `car`.`data` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Marque` VARCHAR(45) NOT NULL,
  `Model` VARCHAR(45) NOT NULL,
  `Annee` INT NOT NULL,
  `Energie` VARCHAR(45) NOT NULL,
  `Kilometrage` INT NOT NULL,
  `BoiteVitesse` VARCHAR(45) NOT NULL,
  `NbPlace` INT NOT NULL,
  `NbPorte` INT NOT NULL,
  `Prix` INT NOT NULL,
  PRIMARY KEY (`Id`));
