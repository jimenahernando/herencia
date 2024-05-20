-- EMPLEADO
truncate table empleado RESTART IDENTITY CASCADE;

select *
from empleado;

--MAPPEDSUPERCLASS
truncate table lupulo RESTART IDENTITY CASCADE;
truncate table cereal RESTART IDENTITY CASCADE;

select *
from lupulo;
select *
from cereal;

-- SINGLE TABLE
TRUNCATE animales  RESTART IDENTITY CASCADE;

select *
from animales;

--JOIN TABLE
TRUNCATE instrumentos RESTART IDENTITY CASCADE;

truncate table cuerda restart identity;
truncate table viento restart identity;
truncate table percusion restart identity;

select *
from instrumentos;
select *
from cuerda;
select *
from viento;
select *
from percusion;