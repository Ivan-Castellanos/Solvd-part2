-- Selecting --
SELECT * from city;
select * from status;
select * from b_type;
SELECT * from month;
SELECT * from specie;
SELECT * from breed;
SELECT * from building;
SELECT * from objective;
SELECT * from animal;

-- updating --

UPDATE building
SET name = "The happy Cow"
WHERE id = 1;

UPDATE building
SET animal_capacity = 200000
where id = 2;

UPDATE building
SET name = "SuperMax"
where id = 4;

UPDATE animal
SET age = 3, weight = 469
where id = 1;

UPDATE breed
SET breed_name = "Long Island Black"
where id =4;

UPDATE city
SET city_name = "Tigre"
where id = 3;

UPDATE specie
SET specie_name = "horse"
where id = 3;

UPDATE building
SET address = "45 street", address_number = 34, email = "thehappypigs@gmail.com"
where id = 1;

UPDATE building
SET address = "5 street", address_number = 576, email = "supermax@gmail.com"
where id = 4;

UPDATE building
SET address = "main street", address_number = 923, email = "animalhouse2321@gmail.com"
where id = 3;

UPDATE building
SET address = "46 street", address_number = 521, email = "feederhungryhorse@gmail.com"
where id = 2;

-- alter tables -- 
-- ALTER TABLE building
-- DROP COLUMN email;

ALTER TABLE animal
ADD COLUMN diet VARCHAR(20);

ALTER TABLE animal
ADD COLUMN birth_date DATE;

ALTER TABLE animal 
MODIFY COLUMN birth_date YEAR(4);

ALTER TABLE animal
DROP COLUMN birth_date;

SELECT * FROM building;

-- big Join --
SELECT animal.id, status.status_name, breed.breed_name, objective.objective_name, age, weight
FROM animal
JOIN status on status_id = status_name
JOIN breed on breed_id = breed_name
JOIN objective on objective_id = objective_name;

-- Other joins --

SELECT animal.id, building.name
FROM animal
LEFT JOIN status on building_id = name;

-- deletions --
delete from city;
delete from status;
delete from b_type;
delete from month;
delete from specie;
delete from breed;
delete from building;
delete from objective;
delete from animal;