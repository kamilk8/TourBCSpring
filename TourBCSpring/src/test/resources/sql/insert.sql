INSERT INTO country(id, name) VALUES(1, 'Turcja');
INSERT INTO country(id, name) VALUES(2, 'Polska');
INSERT INTO country(id, name) VALUES(3, 'Bu³garia');
INSERT INTO country(id, name) VALUES(4, 'Hiszpania');

INSERT INTO region(id, name, country_id) VALUES(1, 'Riwiera Turecka', 1);
INSERT INTO region(id, name, country_id) VALUES(2, 'Turcja Egejska', 1);
INSERT INTO region(id, name, country_id) VALUES(3, 'Kaszuby', 2);
INSERT INTO region(id, name, country_id) VALUES(4, 'Bieszczady', 2);
INSERT INTO region(id, name, country_id) VALUES(5, 'Pomorze', 2);
INSERT INTO region(id, name, country_id) VALUES(6, 'Riwiera Bu³garska', 3);

INSERT INTO region(id, name, country_id) VALUES(8, 'Majorka', 4);

INSERT INTO city(id, name, country_id, region_id) VALUES(1,'Alanya', 1, 1);
INSERT INTO city(id, name, country_id, region_id) VALUES(2,'Antalya', 1, 1);
INSERT INTO city(id, name, country_id, region_id) VALUES(3,'Stambu³', 1, 2);
INSERT INTO city(id, name, country_id, region_id) VALUES(4,'Ankara', 1, 2);
INSERT INTO city(id, name, country_id, region_id) VALUES(5,'Kartuzy', 2, 3);
INSERT INTO city(id, name, country_id, region_id) VALUES(6,'Koœcierzyna', 2, 3);
INSERT INTO city(id, name, country_id, region_id) VALUES(7,'Ar³amów', 2, 4);
INSERT INTO city(id, name, country_id, region_id) VALUES(8,'Czarna', 2, 4);
INSERT INTO city(id, name, country_id, region_id) VALUES(9,'Ustka', 2, 5);
INSERT INTO city(id, name, country_id, region_id) VALUES(10,'Gdañsk', 2, 5);
INSERT INTO city(id, name, country_id, region_id) VALUES(11,'Sopot', 2, 5);
INSERT INTO city(id, name, country_id, region_id) VALUES(12,'Warna', 3, 6);
INSERT INTO city(id, name, country_id, region_id) VALUES(13,'Balchik', 3, 6);
INSERT INTO city(id, name, country_id, region_id) VALUES(14,'Palma de Mallorca', 4, 8);
INSERT INTO city(id, name, country_id) VALUES(15, 'Ibiza', 4);

INSERT INTO foodtype(id, food_type, food_price) VALUES(1, 'All inclusive', 150);
INSERT INTO foodtype(id, food_type, food_price) VALUES(2, 'Ultra all inclusive', 200);
INSERT INTO foodtype(id, food_type, food_price) VALUES(3, 'All inclusive snack', 50);
INSERT INTO foodtype(id, food_type, food_price) VALUES(4, 'Half board', 70);
INSERT INTO foodtype(id, food_type, food_price) VALUES(5, 'Bed & breakfast', 40);
INSERT INTO foodtype(id, food_type, food_price) VALUES(6, 'Continental breakfast', 50);
INSERT INTO foodtype(id, food_type, food_price) VALUES(7, 'Szwedzki stó³', 60);

INSERT INTO seasontype(id, season_type, season_price_ratio) VALUES(1, 'Pe³ny sezon', 2.5);
INSERT INTO seasontype(id, season_type, season_price_ratio) VALUES(2, 'Sezon œredni', 1.0);
INSERT INTO seasontype(id, season_type, season_price_ratio) VALUES(3, 'Sezon ogórkowy', 0.7);

INSERT INTO season(id, date_from, date_to, seasontype_id) VALUES(1, '2000-07-01','2000-08-31', 1);
INSERT INTO season(id, date_from, date_to, seasontype_id) VALUES(2, '2000-09-01','2000-10-31', 2);
INSERT INTO season(id, date_from, date_to, seasontype_id) VALUES(3, '2000-02-16','2000-06-30', 2);
INSERT INTO season(id, date_from, date_to, seasontype_id) VALUES(4, '2000-01-01','2000-02-15', 3);
INSERT INTO season(id, date_from, date_to, seasontype_id) VALUES(5, '2000-11-01','2000-12-31', 3);

INSERT INTO roomtype(id, place_quantity, standardd) VALUES(1, 3, 'Apartament');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(2, 2, 'Apartament');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(3, 1, 'Apartament');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(5, 4, 'Standard');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(6, 3, 'Standard');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(7, 2, 'Standard');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(8, 1, 'Standard');
INSERT INTO roomtype(id, place_quantity, standardd) VALUES(9, 1, 'MiniRoom');


INSERT INTO hotel(id, name, place_id, place_type) VALUES(1, 'Al-Sahab', 1, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(2, 'Ultebe', 2, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(3, 'Mashaba', 3, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(4, 'Mekka', 4, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(5, 'Pod pok³adem', 5, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(6, 'Pod kilem', 6, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(7, 'Hotel Ar³amów', 7, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(8, 'Nafta hotel', 8, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(9, 'U rybaka', 9, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(10, 'Heweliusz', 10, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(11, 'Grand Hotel', 11, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(12, 'Terok Nor', 12, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(13, 'Stadin Tej', 13, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(14, 'Costa Permana', 14, 'C');
INSERT INTO hotel(id, name, place_id, place_type) VALUES(15, 'Rio Grande', 15, 'C');

SELECT generate_rooms();
SELECT generate_tours();
SELECT generate_tourroom();
SELECT generate_tourfoodtype();
SELECT generate_completereservation();

