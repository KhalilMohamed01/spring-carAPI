/*
-- Query: select * from car.data
LIMIT 0, 1000

-- Date: 2023-04-26 00:01
*/
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (1,2016,'Manuelle','Diesel',100000,5,4,88000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (2,2019,'Manuelle','Diesel',95000,5,4,145000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (3,2009,'Manuelle','Essence',160000,5,4,48000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (52,2019,'Manuelle','Diesel',65000,5,4,128000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (53,2021,'Manuelle','Diesel',35000,5,4,175000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (54,2012,'Manuelle','Essence',90000,5,4,67000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (55,2017,'Manuelle','Diesel',80000,5,4,113000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (56,2016,'Manuelle','Diesel',100000,5,4,88000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (57,2016,'Manuelle','Diesel',120000,5,4,89000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (58,2016,'Manuelle','Diesel',70000,5,4,95000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (59,2016,'Manuelle','Diesel',74000,5,4,95000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (60,2016,'Manuelle','Diesel',95000,5,4,91000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (61,2017,'Manuelle','Diesel',90000,5,4,93000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (62,2017,'Manuelle','Diesel',70000,5,4,113000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (63,2017,'Manuelle','Diesel',170000,5,4,90000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (64,2017,'Manuelle','Diesel',50000,5,4,120000,54,57);
INSERT INTO car.data (`id`,`annee`,`boiteVitesse`,`energie`,`kilometrage`,`nbPlace`,`nbPorte`,`prix`,`marque_id`,`modele_id`) VALUES (65,2017,'Manuelle','Diesel',35000,5,4,130000,54,57);


/*
-- Query: select * from car.marque
LIMIT 0, 1000

-- Date: 2023-04-26 00:00
*/
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Audi',1);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Alfa Romeo',2);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Autres',52);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('BMW',53);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Citroen',54);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Dacia',55);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Ferrari',56);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Fiat',57);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Ford',58);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Honda',59);
INSERT INTO car.marque (`marque_label`,`id`) VALUES ('Kia',60);

/*
-- Query: select * from car.modele
LIMIT 0, 1000

-- Date: 2023-04-26 00:00
*/
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('A7',1);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('A8',2);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('GT',52);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Mito',53);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Autres',54);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('M5',55);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('M6',56);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('C3',57);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('C4',58);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Sandero',59);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Logan',60);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('F40',61);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Nitro',62);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('500',63);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('FIESTA',64);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('PUNTO',65);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Boss',66);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Accord',67);
INSERT INTO car.modele (`modele_label`,`id`) VALUES ('Ceed',68);
