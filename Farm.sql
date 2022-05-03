-- MySQL Script generated by MySQL Workbench
-- Mon May  2 21:56:00 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Farm
-- -----------------------------------------------------
CREATE SCHEMA Farm;
USE Farm;
-- -----------------------------------------------------
-- Table `b_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `b_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `building_type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `city_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `building`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `building` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `b_type_id` INT NOT NULL,
  `city_id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `animal_capacity` INT NOT NULL,
  `mts2` INT NULL,
  `address` VARCHAR(45) NULL,
  `address_number` INT NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`, `b_type_id`, `city_id`),
  INDEX `fk_building_b_type1_idx` (`b_type_id` ASC) VISIBLE,
  INDEX `fk_building_city1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_building_b_type1`
    FOREIGN KEY (`b_type_id`)
    REFERENCES `b_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_building_city1`
    FOREIGN KEY (`city_id`)
    REFERENCES `city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `status` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `objective`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `objective` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `objective_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `specie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `specie` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `specie_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `breed`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `breed` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `specie_id` INT NOT NULL,
  `breed_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`, `specie_id`),
  INDEX `fk_breed_specie1_idx` (`specie_id` ASC) VISIBLE,
  CONSTRAINT `fk_breed_specie1`
    FOREIGN KEY (`specie_id`)
    REFERENCES `specie` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `animal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `animal` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `status_id` INT NOT NULL,
  `breed_id` INT NOT NULL,
  `objective_id` INT NOT NULL,
  `building_id` INT NOT NULL,
  `age` INT(2) NOT NULL,
  `weight` INT NOT NULL,
  PRIMARY KEY (`id`, `status_id`, `breed_id`, `objective_id`, `building_id`),
  INDEX `fk_animal_building1_idx` (`building_id` ASC) VISIBLE,
  INDEX `fk_animal_status1_idx` (`status_id` ASC) VISIBLE,
  INDEX `fk_animal_objective1_idx` (`objective_id` ASC) VISIBLE,
  INDEX `fk_animal_breed1_idx` (`breed_id` ASC) VISIBLE,
  CONSTRAINT `fk_animal_building1`
    FOREIGN KEY (`building_id`)
    REFERENCES `building` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_animal_status1`
    FOREIGN KEY (`status_id`)
    REFERENCES `status` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_animal_objective1`
    FOREIGN KEY (`objective_id`)
    REFERENCES `objective` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_animal_breed1`
    FOREIGN KEY (`breed_id`)
    REFERENCES `breed` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `phone_number`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `phone_number` (
  `id` INT NOT NULL,
  `building_id` INT NOT NULL,
  `number` INT NOT NULL,
  PRIMARY KEY (`id`, `building_id`),
  INDEX `fk_phone_number_building1_idx` (`building_id` ASC) VISIBLE,
  CONSTRAINT `fk_phone_number_building1`
    FOREIGN KEY (`building_id`)
    REFERENCES `building` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `worker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `worker` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `last name` VARCHAR(45) NOT NULL,
  `job_position` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `position` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `position_name` VARCHAR(45) NOT NULL,
  `pay_per_hour` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `month`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `month` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `month_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `hours_register`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hours_register` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `worker_id` INT NOT NULL,
  `month_id` INT NOT NULL,
  `year` YEAR(4) NOT NULL,
  `hours_registercol` INT NOT NULL,
  PRIMARY KEY (`id`, `worker_id`, `month_id`),
  INDEX `fk_hours_register_worker1_idx` (`worker_id` ASC) VISIBLE,
  INDEX `fk_hours_register_month1_idx` (`month_id` ASC) VISIBLE,
  CONSTRAINT `fk_hours_register_worker1`
    FOREIGN KEY (`worker_id`)
    REFERENCES `worker` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_hours_register_month1`
    FOREIGN KEY (`month_id`)
    REFERENCES `month` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ticket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ticket` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `building` INT NOT NULL,
  `date` DATE NOT NULL,
  PRIMARY KEY (`id`, `building`),
  INDEX `fk_ticket_building1_idx` (`building` ASC) VISIBLE,
  CONSTRAINT `fk_ticket_building1`
    FOREIGN KEY (`building`)
    REFERENCES `building` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `meat_cut`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `meat_cut` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `specie_id` INT NOT NULL,
  `cut_name` VARCHAR(45) NOT NULL,
  `price_per_kg` INT NOT NULL,
  PRIMARY KEY (`id`, `specie_id`),
  INDEX `fk_meat_cut_specie1_idx` (`specie_id` ASC) VISIBLE,
  CONSTRAINT `fk_meat_cut_specie1`
    FOREIGN KEY (`specie_id`)
    REFERENCES `specie` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `item` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ticket_ticket_id` INT NOT NULL,
  `meat_cut_id` INT NOT NULL,
  `kg` INT NOT NULL,
  PRIMARY KEY (`id`, `ticket_ticket_id`, `meat_cut_id`),
  INDEX `fk_item_ticket1_idx` (`ticket_ticket_id` ASC) VISIBLE,
  INDEX `fk_item_meat_cut1_idx` (`meat_cut_id` ASC) VISIBLE,
  CONSTRAINT `fk_item_ticket1`
    FOREIGN KEY (`ticket_ticket_id`)
    REFERENCES `ticket` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_meat_cut1`
    FOREIGN KEY (`meat_cut_id`)
    REFERENCES `meat_cut` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `worker_has_position`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `worker_has_position` (
  `worker_id` INT NOT NULL,
  `position_id` INT NOT NULL,
  PRIMARY KEY (`worker_id`, `position_id`),
  INDEX `fk_worker_has_position_position1_idx` (`position_id` ASC) VISIBLE,
  INDEX `fk_worker_has_position_worker1_idx` (`worker_id` ASC) VISIBLE,
  CONSTRAINT `fk_worker_has_position_worker1`
    FOREIGN KEY (`worker_id`)
    REFERENCES `worker` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_worker_has_position_position1`
    FOREIGN KEY (`position_id`)
    REFERENCES `position` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `building_has_worker`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `building_has_worker` (
  `building_id` INT NOT NULL,
  `building_b_type_id` INT NOT NULL,
  `building_city_id` INT NOT NULL,
  `worker_id` INT NOT NULL,
  PRIMARY KEY (`building_id`, `building_b_type_id`, `building_city_id`, `worker_id`),
  INDEX `fk_building_has_worker_worker1_idx` (`worker_id` ASC) VISIBLE,
  INDEX `fk_building_has_worker_building1_idx` (`building_id` ASC, `building_b_type_id` ASC, `building_city_id` ASC) VISIBLE,
  CONSTRAINT `fk_building_has_worker_building1`
    FOREIGN KEY (`building_id` , `building_b_type_id` , `building_city_id`)
    REFERENCES `building` (`id` , `b_type_id` , `city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_building_has_worker_worker1`
    FOREIGN KEY (`worker_id`)
    REFERENCES `worker` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
