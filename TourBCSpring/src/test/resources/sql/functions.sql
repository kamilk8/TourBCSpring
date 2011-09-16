CREATE OR REPLACE FUNCTION generate_rooms() 
RETURNS void
AS $$
DECLARE
   hotelcurs CURSOR IS SELECT id FROM hotel;
   roomtypecurs CURSOR(standardVar VARCHAR) IS SELECT id FROM roomtype WHERE roomtype.standardd = standardVar;
   --count integer;
   num integer;
   names VARCHAR;
BEGIN
	count:=10;
	FOR hotelId IN hotelcurs LOOP
	num:=1;
		FOR i IN 1..15 LOOP
			FOR roomtypeId IN roomtypecurs('Apartament') LOOP
				INSERT INTO room(id, number, hotel_id, roomtype_id) VALUES(NEXTVAL('room_seq'), trim(both ' ' from to_char(num, '9999')), hotelId.id, roomtypeId.id);
				num:=num+1;
			END LOOP;
		END LOOP;
		
		FOR i IN 1..45 LOOP
			FOR roomtypeId IN roomtypecurs('Standard') LOOP
				INSERT INTO room(id, number, hotel_id, roomtype_id) VALUES(NEXTVAL('room_seq'), trim(both ' ' from to_char(num, '9999')), hotelId.id, roomtypeId.id);
				num:=num+1;
			END LOOP;
		END LOOP;
		
		FOR i IN 1..45 LOOP
			FOR roomtypeId IN roomtypecurs('MiniRoom') LOOP
				INSERT INTO room(id, number, hotel_id, roomtype_id) VALUES(NEXTVAL('room_seq'), trim(both ' ' from to_char(num, '9999')), hotelId.id, roomtypeId.id);
				num:=num+1;
			END LOOP;
		END LOOP;
	END LOOP;   
END;

$$ LANGUAGE plpgsql; 


CREATE OR REPLACE FUNCTION generate_tours() 
RETURNS void
AS $$
DECLARE
   hotelcurs CURSOR IS SELECT id FROM hotel;
   
   tourcurs CURSOR IS SELECT id, hotel_id FROM tour;
   roomcurs CURSOR(hotelVar INTEGER) IS SELECT id FROM room WHERE room.hotel_id = hotelVar;

   foodtypecurs CURSOR(num INTEGER) IS SELECT id FROM foodtype ORDER BY RANDOM() LIMIT num;
   
   count integer;
   num integer;
   names VARCHAR;
   dateFrom date;
   dateTo date;
   roomId integer;
   foodtypeId integer;
   
BEGIN
	dateFrom:=date(now() + trunc(random()  * 100) * '1 day'::interval + '2 day'::interval);
	dateTo:=date(dateFrom + get_random_number(4, 8) * '1 day'::interval);
	
	FOR hotelId IN hotelcurs LOOP
		INSERT INTO tour(id, date_from, date_to, hotel_id) VALUES(NEXTVAL('tour_seq'), dateFrom, dateTo, hotelId.id);
	END LOOP;
		
	FOR tourId IN tourcurs LOOP
		OPEN roomcurs(tourId.hotel_id);
		FETCH roomcurs INTO roomId;
		INSERT INTO tourroom(tour_id, room_id) VALUES(tourId.id, roomId); -- roomId.id OR roomId ?
		CLOSE roomcurs;

		OPEN foodtypecurs(get_random_number(2, 4));
		FETCH foodtypecurs INTO foodtypeId;
		INSERT INTO tourfoodtype(tour_id, foodtype_id) VALUES(tourId.id, foodtypeId);
		CLOSE foodtypecurs;
		
	END LOOP;
	
END;

$$ LANGUAGE plpgsql; 


CREATE OR REPLACE FUNCTION generate_tours() 
RETURNS void
AS $$
DECLARE
   hotelcurs CURSOR IS SELECT id FROM hotel;

   dateFrom date;
   dateTo date;
   roomId integer;
   foodtypeId integer;
   
BEGIN
	dateFrom:=date(now() + trunc(random()  * 100) * '1 day'::interval + '2 day'::interval);
	dateTo:=date(dateFrom + get_random_number(4, 8) * '1 day'::interval);
	RAISE NOTICE 'przed petla';
	FOR hotelId IN hotelcurs LOOP
	RAISE NOTICE 'w petli';
		INSERT INTO tour(id, date_from, date_to, hotel_id) VALUES(NEXTVAL('tour_seq'), dateFrom, dateTo, hotelId.id);
	END LOOP;
		

	
END;

$$ LANGUAGE plpgsql; 

___________________________________________

CREATE OR REPLACE FUNCTION generate_tourroom() 
RETURNS void
AS $$
DECLARE
   
   tourcurs CURSOR IS SELECT id, hotel_id FROM tour;
   roomcurs CURSOR(hotelVar INTEGER) IS SELECT id FROM room WHERE room.hotel_id = hotelVar;
   
BEGIN
	RAISE NOTICE 'przed petla.';		
	FOR tourId IN tourcurs LOOP
	RAISE NOTICE 'obieg';	
		FOR roomId IN roomcurs(tourId.hotel_id) LOOP
		INSERT INTO tourroom(tour_id, room_id) VALUES(tourId.id, roomId.id); -- roomId.id OR roomId ?
		END LOOP;	
	END LOOP;
	
END;


$$ LANGUAGE plpgsql; 

______________________________________________

CREATE OR REPLACE FUNCTION generate_tourfoodtype() 
RETURNS void
AS $$
DECLARE
   num integer;
   tourcurs CURSOR IS SELECT id FROM tour;
   foodtypecurs CURSOR(num INTEGER) IS SELECT id FROM foodtype ORDER BY RANDOM() LIMIT num;
 
   
BEGIN

	FOR tourId IN tourcurs LOOP
		FOR foodtypeId IN foodtypecurs(get_random_number(2, 4)) LOOP
			RAISE NOTICE 'tourId.id = %', tourId.id;
			INSERT INTO tourfoodtype(tour_id, foodtype_id) VALUES(tourId.id, foodtypeId.id);
		END LOOP;
		
	END LOOP;
	

$$ LANGUAGE plpgsql; 

_________________________________________

CREATE OR REPLACE FUNCTION generate_completereservation() 
RETURNS void
AS $$
DECLARE
   
   tourroomcurs CURSOR IS SELECT room_id, tour_id FROM tourroom;
   
   tourfoodtypecurs CURSOR(id integer) IS SELECT foodtype_id FROM tourfoodtype WHERE tourfoodtype.tour_id = id;
   
   num integer;
   howMany integer;
   foodtypeId integer;
   name_array VARCHAR[];
   surname_array VARCHAR[];
BEGIN
	name_array[25]:=array['Kamil', 'Jerzy', 'Danuta', 'Dariusz', 
	'Ma³gorzata', 'Zbigniew', 'Anna', 'Piotr', 'Pawe³', 'Rafa³',
	'£ukasz', 'Katarzyna', 'Barbara', 'Henryk', 'Robert', 
	'Andrzej', 'Monika', 'Marcin', 'Maciej', 'Patrycja', 
	'Szymon', 'Sebastian', 'Tadeusz', 'Magdalena', 'Tomasz'];
	
	surname_array[45]:=array['Nowak', 'Go³¹b', 'Zaj¹c', 'Królik', 
	'Tetmajer', 'Kielar', 'Socha', 'Klimek', 
	'S³owik', 'Tomoñ', 'Kozera', 'Stasik', 
	'Machnik', 'Gdula', 'Put', 'Zajas', 
	'Irek', 'Habrat', 'Kuta', 'Lis', 
	'Or³oœ', 'Tusk', 'Pielach', 'Kurpiel', 
	'Kolanko', 	'Pawe³ek', 'Rogala', 'Wilk', 
	'Ziêba', 'Rusin', 'Wêglarczyk', 'Prokop', 
	'S³oñ', 'Grysiak', 'B³a¿', 'Zahuta', 
	'Nêdza', 'Tchórz', 'Stoltmann', 'Leœniak', 
	'Szylak', 'Kocio³a', 'Kazimierczak', 'Zdziebko', 
	'Nicko', 'Kurdybacha', 'Mi³osz', 'Czopik'];
	

	FOR tourroomId IN tourroomcurs LOOP
	num:=get_random_number(1,4);
		IF num < 3 THEN
			
			INSERT INTO client(id, name, surname) 
				VALUES (NEXTVAL('client_seq'), name_array[get_random_number(0,25)], surname_array[get_random_number(0,45)]);
			
			SELECT place_quantity FROM roomtype WHERE roomtype.id IN (SELECT roomtype_id FROM room WHERE room.id = tourroomId.room_id) INTO howMany;

			

			OPEN tourfoodtypecurs(tourroomId.tour_id);
			FETCH tourfoodtypecurs INTO foodtypeId;
			INSERT INTO reservation(id, participant_quantity, tour_id, client_id, foodtype_id) 
				VALUES(NEXTVAL('reservation_seq'), howMany, tourroomId.tour_id, CURRVAL('client_seq'), foodtypeId);
			CLOSE tourfoodtypecurs;
			
			INSERT INTO reservationroom(reservation_id, room_id) VALUES(CURRVAL('reservation_seq'), tourroomId.room_id);
		END IF;
	END LOOP;	

	
END;


$$ LANGUAGE plpgsql; 
________________________________________

CREATE OR REPLACE FUNCTION get_random_number(INTEGER, INTEGER) RETURNS INTEGER AS $$
DECLARE
    start_int ALIAS FOR $1;
    end_int ALIAS FOR $2;
BEGIN
    RETURN trunc(random() * (end_int-start_int) + start_int);
END;
$$ LANGUAGE 'plpgsql';

CREATE OR REPLACE FUNCTION generate_tours() 
RETURNS void
AS $$
DECLARE
   data date;
BEGIN
	baseData:=date(now() + trunc(random()  * 20) * '1 day'::interval);
END;
INSERT INTO tour 
$$ LANGUAGE plpgsql; 
