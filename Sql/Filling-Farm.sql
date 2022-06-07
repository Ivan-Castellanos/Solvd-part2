-- Building related insertions --
ALTER TABLE city AUTO_INCREMENT = 1;
INSERT INTO city (city_name)
VALUES ("Bahia Blanca"),
	("Mar Del Plata"),
    ("Tandil"),
    ("La Plata");
  
ALTER TABLE b_type AUTO_INCREMENT = 1;
INSERT INTO b_type (building_type)
VALUES ("Feeding house"),
	("Slaughterhouse"),
    ("Farm Shop"),
    ("Breeading house");
    
ALTER TABLE building AUTO_INCREMENT = 1;
INSERT INTO building (b_type_id, city_id, name, animal_capacity,
					mts2)
VALUES (2, 4, "The happy Pig", 200000, 5000),
	(1, 4, "The hungry horse", 100000, 4000),
    (4, 4, "animal House", 5000, 1000),
    (3, 4, "Farm Supermarket", 0, 70);
    
-- Animal related insertions --    
ALTER TABLE status AUTO_INCREMENT = 1;
INSERT INTO status (status_name)
VALUES ("On feeding station"),
	("Pregnant"),
    ("On transports"),
    ("To Slaugther");

ALTER TABLE specie AUTO_INCREMENT = 1;
INSERT INTO specie(specie_name)
VALUES ("Cattle"),
	("Chicken"),
    ("Pigs");


ALTER TABLE breed AUTO_INCREMENT = 1;
INSERT INTO breed(specie_id, breed_name)
VALUES (1, "Holando Argentina"),
	(1, "Aberdeen Angus"),
    (2, "Leghorn"),
    (2, "Long Island Red");
    
ALTER TABLE objective AUTO_INCREMENT = 1;
INSERT INTO objective(objective_name)
VALUES ("To Slaughter"),
	("for breeding");
    
ALTER TABLE animal AUTO_INCREMENT = 1;
INSERT 	INTO animal(status_id, breed_id, objective_id,building_id, age, weight)
VALUES (1,1,1,2,4,500),
	(1,2,2,3,4,500);
 
-- Workers related insertions --
ALTER TABLE month AUTO_INCREMENT = 1;
INSERT INTO month (month_name)
VALUES	("January"),
	("February"),
	("March"),
	("April"),
	("May"),
	("June"),
	("July"),
	("August"),
	("September"),
	("October"),
	("November"),
	("December");

-- Sell related insertions --
ALTER TABLE ticket AUTO_INCREMENT = 1;
INSERT INTO ticket (building, date)
VALUES (3, "2023-05-03");