-- RECORDAR!
-- 1. crear el esquema de base de datos con nombre Herencia
-- 2. ejecutar este script para crear las tablas


-- public.animales definition

-- Drop table

-- DROP TABLE public.animales;

CREATE TABLE public.animales (
	id serial4 NOT NULL,
	tipo_animal varchar(255) NOT NULL,
	nombre varchar(255) NULL,
	edad int4 NULL,
	sexo varchar(255) NULL,
	cantidad_mamas int4 NULL,
	color_plumaje varchar(255) NULL,
	CONSTRAINT animales_pkey PRIMARY KEY (id)
);


-- public.cereal definition

-- Drop table

-- DROP TABLE public.cereal;

CREATE TABLE public.cereal (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE),
	nombre varchar NOT NULL,
	descripcion varchar NULL,
	color varchar NULL,
	CONSTRAINT newtable_pk PRIMARY KEY (id)
);


-- public.empleado definition

-- Drop table

-- DROP TABLE public.empleado;

CREATE TABLE public.empleado (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE),
	nombre varchar NOT NULL,
	matricula varchar NULL,
	CONSTRAINT empleado_pk PRIMARY KEY (id)
);


-- public.instrumentos definition

-- Drop table

-- DROP TABLE public.instrumentos;

CREATE TABLE public.instrumentos (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE),
	nombre varchar NOT NULL,
	CONSTRAINT instrumentos_pk PRIMARY KEY (id)
);


-- public.lupulo definition

-- Drop table

-- DROP TABLE public.lupulo;

CREATE TABLE public.lupulo (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 2147483647 START 1 CACHE 1 NO CYCLE),
	nombre varchar NULL,
	pais varchar NULL,
	CONSTRAINT lupulo_pk PRIMARY KEY (id)
);


-- public.cuerda definition

-- Drop table

-- DROP TABLE public.cuerda;

CREATE TABLE public.cuerda (
	cantidad_cuerdas int4 NULL,
	material_cuerda varchar NULL,
	instrumento int4 NULL,
	CONSTRAINT cuerda_instrumentos_fk FOREIGN KEY (instrumento) REFERENCES public.instrumentos(id)
);


-- public.percusion definition

-- Drop table

-- DROP TABLE public.percusion;

CREATE TABLE public.percusion (
	diametro numeric NULL,
	instrumento int4 NULL,
	CONSTRAINT percusion_instrumentos_fk FOREIGN KEY (instrumento) REFERENCES public.instrumentos(id)
);


-- public.viento definition

-- Drop table

-- DROP TABLE public.viento;

CREATE TABLE public.viento (
	material varchar NULL,
	instrumento int4 NULL,
	CONSTRAINT viento_instrumentos_fk FOREIGN KEY (instrumento) REFERENCES public.instrumentos(id)
);


