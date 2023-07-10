USE mans_frends;

# для проверки каких животных (верблюдов) необходимо удалить через JOIN
SELECT a.*, pack.*
FROM animals a
JOIN pack_animals pack
ON a.id_animal = pack.id_animal
JOIN camels c
ON pack.id_pack_animal = c.id_pack_animal;  

# удаляем верблюдов из всех таблиц 
DELETE a.*, pa.* FROM animals a INNER JOIN pack_animals pa INNER JOIN camels c
WHERE a.id_animal=pa.id_animal AND pa.id_pack_animal=c.id_pack_animal;

# проверка количества оставшихся животных
SELECT count(*) FROM animals;
SELECT * FROM pack_animals;
SELECT * FROM camels;
 
 # 
SELECT * FROM donkeys;
SELECT * FROM hors;

/*SELECT h.*, d.* FROM hors h
LEFT JOIN donkeys d
ON h.id_pack_animal = d.id_pack_animal
UNION
SELECT h.*, d.* FROM donkeys d
LEFT JOIN hors h
ON h.id_pack_animal = d.id_pack_animal 
WHERE d.id_pack_animal IS NULL;*/

CREATE TABLE new_pack_animals AS
SELECT h.id_pack_animal, h.id_hors, h.lear, NULL AS id_donkeys, NULL AS colors
FROM hors h
LEFT JOIN donkeys d ON h.id_pack_animal = d.id_pack_animal
UNION
SELECT d.id_pack_animal, NULL AS id_hors, NULL AS lear, d.id_donkeys, d.colors
FROM donkeys d
LEFT JOIN hors h ON h.id_pack_animal = d.id_pack_animal
WHERE h.id_hors IS NULL;

SELECT * FROM new_pack_animals;

-- Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, 
-- но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

CREATE TABLE young_animals AS
SELECT * , concat(PERIOD_DIFF(DATE_FORMAT(CURRENT_DATE(), '%Y%m'), DATE_FORMAT(dob, '%Y%m')) div 12   , ' год(а) ',
PERIOD_DIFF(DATE_FORMAT(CURRENT_DATE(), '%Y%m'), DATE_FORMAT(dob, '%Y%m'))  % 12 ,' месяца(ев)' ) as age FROM animals
WHERE YEAR(CURRENT_DATE()) - YEAR(dob) >= 1 AND PERIOD_DIFF(DATE_FORMAT(CURRENT_DATE(), '%Y%m'), DATE_FORMAT(dob, '%Y%m')) div 12 <3;

-- можно использовать команду: HERE YEAR(CURRENT_DATE()) - YEAR(dob) BETWEEN 1 AND 3 , но тогда в отборку попадут животные до 4 лет
SELECT * FROM young_animals;


# SELECT * , PERIOD_DIFF(DATE_FORMAT(CURRENT_DATE(), '%Y%m'), DATE_FORMAT(dob, '%Y%m')) AS age FROM animals;

# Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

-- SELECT a.* , h.*, p.*, d.* , c.*, hm.*, hr.*, dk.* from animals a
-- или :
SELECT a.nickname, a.dob, a.gender, a.species, h.color, h.command, p.carrying, p.size, p.weight,
d.kind, d.size, c.kind, c.weight, hm.body_length, hm.taiL_ength, hr.lear, dk.colors FROM animals a
LEFT JOIN home_animals h
ON a.id_animal = h.id_animal
LEFT JOIN pack_animals p
ON a.id_animal = p.id_animal
LEFT JOIN dogs d
ON h.id_home_animal = d.id_home_animal
LEFT JOIN cats c
ON h.id_home_animal = c.id_home_animal
LEFT JOIN hamsters hm
ON h.id_home_animal = hm.id_home_animal
LEFT JOIN hors hr
ON p.id_pack_animal = hr.id_pack_animal
LEFT JOIN donkeys dk
ON p.id_pack_animal = dk.id_pack_animal;





