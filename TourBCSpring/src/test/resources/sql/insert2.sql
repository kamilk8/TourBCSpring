insert into country(id, name) values(1, 'Turcja');
insert into country(id, name) values(2, 'Polska');
insert into country(id, name) values(3, 'Bu³garia');
insert into country(id, name) values(4, 'Hiszpania');

insert into region(id, name, country_id) values(1, 'Riwiera Turecka', 1);
insert into region(id, name, country_id) values(2, 'Turcja Egejska', 1);
insert into region(id, name, country_id) values(3, 'Kaszuby', 2);
insert into region(id, name, country_id) values(4, 'Bieszczady', 2);
insert into region(id, name, country_id) values(5, 'Pomorze', 2);
insert into region(id, name, country_id) values(6, 'Riwiera Bu³garska', 3);

insert into region(id, name, country_id) values(8, 'Majorka', 4);

insert into city(id, name, country_id, region_id) values(1,'Alanya', 1, 1);
insert into city(id, name, country_id, region_id) values(2,'Antalya', 1, 1);
insert into city(id, name, country_id, region_id) values(3,'Stambu³', 1, 2);
insert into city(id, name, country_id, region_id) values(4,'Ankara', 1, 2);
insert into city(id, name, country_id, region_id) values(5,'Kartuzy', 2, 3);
insert into city(id, name, country_id, region_id) values(6,'Koœcierzyna', 2, 3);
insert into city(id, name, country_id, region_id) values(7,'Ar³amów', 2, 4);
insert into city(id, name, country_id, region_id) values(8,'Czarna', 2, 4);
insert into city(id, name, country_id, region_id) values(9,'Ustka', 2, 5);
insert into city(id, name, country_id, region_id) values(10,'Gdañsk', 2, 5);
insert into city(id, name, country_id, region_id) values(11,'Sopot', 2, 5);
insert into city(id, name, country_id, region_id) values(12,'Warna', 3, 6);
insert into city(id, name, country_id, region_id) values(13,'Balchik', 3, 6);
insert into city(id, name, country_id, region_id) values(14,'Palma de Mallorca', 4, 8);
insert into city(id, name, country_id) values(15, 'Ibiza', 4);

insert into foodtype(id, food_type, food_price) values(1, 'All inclusive', 150);
insert into foodtype(id, food_type, food_price) values(2, 'Ultra all inclusive', 200);
insert into foodtype(id, food_type, food_price) values(3, 'All inclusive snack', 50);
insert into foodtype(id, food_type, food_price) values(4, 'Half board', 70);
insert into foodtype(id, food_type, food_price) values(5, 'Bed & breakfast', 40);
insert into foodtype(id, food_type, food_price) values(6, 'Continental breakfast', 50);
insert into foodtype(id, food_type, food_price) values(7, 'Szwedzki stó³', 60);

insert into seasontype(id, season_type, season_price_ratio) values(1, 'Pe³ny sezon', 2.5);
insert into seasontype(id, season_type, season_price_ratio) values(2, 'Sezon œredni', 1.0);
insert into seasontype(id, season_type, season_price_ratio) values(3, 'Sezon ogórkowy', 0.7);

insert into season(id, date_from, date_to, seasontype_id) values(1, '2000-07-01','2000-08-31', 1);
insert into season(id, date_from, date_to, seasontype_id) values(2, '2000-09-01','2000-10-31', 2);
insert into season(id, date_from, date_to, seasontype_id) values(3, '2000-02-16','2000-06-30', 2);
insert into season(id, date_from, date_to, seasontype_id) values(4, '2000-01-01','2000-02-15', 3);
insert into season(id, date_from, date_to, seasontype_id) values(5, '2000-11-01','2000-12-31', 3);

insert into roomtype(id, place_quantity, standard) values(1, 2, 'Apartament');
insert into roomtype(id, place_quantity, standard) values(2, 1, 'Apartament');
insert into roomtype(id, place_quantity, standard) values(3, 2, 'Standard');
insert into roomtype(id, place_quantity, standard) values(4, 1, 'Standard');
insert into roomtype(id, place_quantity, standard) values(5, 1, 'MiniRoom');

