insert into regiones (id, nombre) VALUES (1, 'Sudamérica');
insert into regiones (id, nombre) VALUES (2, 'Centroamérica');
insert into regiones (id, nombre) VALUES (3, 'Norteamérica');
insert into regiones (id, nombre) VALUES (4, 'Europa');
insert into regiones (id, nombre) VALUES (5, 'Asia');
insert into regiones (id, nombre) VALUES (6, 'Oceanía');
insert into regiones (id, nombre) VALUES (7, 'Antártida');

insert into clientes(region_id, nombre, apellido, email, create_at) values (1, 'Andres','Guzman','profesora@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (2, 'Federico','Marcelo','profesor1@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (4, 'Marcelo','Marcelo','Marcelo@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (4, 'Antonio','Guzman','Guzman@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (1, 'Pedro','Jose','profesor@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (3, 'Jose','Guzman','Guzman2@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (5, 'Mario','Guzman','profesor3@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (6, 'Andres','Guzman','profesor4@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (1, 'Andres','Mario','profesor5@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (7, 'Antonio','Mario','profesor6@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (1, 'Federico','Seeber','seeberfederico7@gmail.com','2019-10-09');
insert into clientes(region_id, nombre, apellido, email, create_at) values (2, 'Andres','Guzman','profesora@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (2, 'Federico','Marcelo','profesor1@gmail.com','2018-01-01');
insert into clientes(region_id, nombre, apellido, email, create_at) values (2, 'Marcelo','Marcelo','Marcelo@gmail.com','2018-01-01');

/* Creamos algunos usuarios con sus roles*/
insert into usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$oYBmPcdVLCh.A85Bjq3aRu40eUW7o.QD4esNSwAdYSWl88fgRQddO', 1, 'Federico', 'Seeber', 'seeberfederico@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$U9VwL47095p2GVVyb7qeaeo9l1ibIBt3heP2JaZ6OLTwF31TFoD1O', 2, 'Fulano', 'Mengano', 'fulano@hotmail.com');

insert into roles (nombre) VALUES ('ROLE_USER');
insert into roles (nombre) VALUES ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, role_id) VALUES (1, 1);
insert into usuarios_roles (usuario_id, role_id) VALUES (2, 2);
insert into usuarios_roles (usuario_id, role_id) VALUES (2, 1);