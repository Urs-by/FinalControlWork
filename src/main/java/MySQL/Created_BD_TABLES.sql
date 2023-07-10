DROP DATABASE IF EXISTS mans_frends;
CREATE DATABASE IF NOT EXISTS mans_frends;
USE mans_frends;

CREATE TABLE animals
(
	id_animal INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nickname VARCHAR(45),
    dob DATE,
    gender VARCHAR(5),
    species VARCHAR(45)
);

CREATE TABLE home_animals
(
	id_home_animal INT NOT NULL PRIMARY KEY,
    color VARCHAR(45),
    command VARCHAR(50),
    id_animal INT,
    FOREIGN KEY (id_animal) REFERENCES animals(id_animal) ON DELETE CASCADE
);

CREATE TABLE pack_animals
(
	id_pack_animal INT NOT NULL PRIMARY KEY,
    carrying INT,
    size INT, 
    weight INT,
    id_animal INT,
    
    FOREIGN KEY (id_animal) REFERENCES animals(id_animal) ON DELETE CASCADE
);

CREATE TABLE dogs
(
	id_dogs INT NOT NULL PRIMARY KEY,
    kind VARCHAR(45),
    size VARCHAR(45), 
    id_home_animal INT,
    FOREIGN KEY (id_home_animal) REFERENCES home_animals(id_home_animal) ON DELETE CASCADE
);

CREATE TABLE cats
(
	id_cats INT NOT NULL PRIMARY KEY,
    kind VARCHAR(45),    
    weight DECIMAL(3,1), 
    id_home_animal INT,
    FOREIGN KEY (id_home_animal) REFERENCES home_animals(id_home_animal) ON DELETE CASCADE
);

CREATE TABLE hamsters
(
	id_hamsters INT NOT NULL PRIMARY KEY,
    body_length TINYINT,
    taiL_ength TINYINT,
    id_home_animal INT,
    FOREIGN KEY (id_home_animal) REFERENCES home_animals(id_home_animal) ON DELETE CASCADE
);

CREATE TABLE hors
(
	id_hors INT NOT NULL PRIMARY KEY,
    lear VARCHAR(45),
    id_pack_animal INT,    
    FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal) ON DELETE CASCADE
);

CREATE TABLE camels
(
	id_camels INT NOT NULL PRIMARY KEY,
    humps TINYINT,
    id_pack_animal INT,
    FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal) ON DELETE CASCADE
);

CREATE TABLE donkeys
(
	id_donkeys INT NOT NULL PRIMARY KEY,
    colors VARCHAR(45),
    id_pack_animal INT,
    FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal) ON DELETE CASCADE
);


