/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, numdoc , tipodoc, create_at,edad) VALUES(1, 'Alonso', 'Guzman', 'alonso@bolsadeideas.com','44887891','1', '2018-01-01',32);
INSERT INTO clientes (region_id, nombre, apellido, email, numdoc , tipodoc, create_at,edad) VALUES(2, 'Janier', 'Valdivia Carrillo', 'janovaldivia@gmail.com','44887892','1', '2018-01-01',45);
INSERT INTO clientes (region_id, nombre, apellido, email, numdoc , tipodoc, create_at,edad) VALUES(3, 'Alan', 'Cairampoma Carrillo', 'alancairampoma@gmail.com','44887893','1', '2018-01-01',32);
INSERT INTO clientes (region_id, nombre, apellido, email, numdoc , tipodoc, create_at,edad) VALUES(4, 'Matias','Cairampoma Serin', 'fserin@gmail.com','44887895','1', '2018-01-01',33);
INSERT INTO clientes (region_id, nombre, apellido, email, numdoc , tipodoc, create_at,edad) VALUES(5, 'Yur Adan', 'Valdez', 'yvaldez@gmail.com','44887894','1', '2018-01-01',33);

/* Creamos algunos usuarios con sus roles */
INSERT INTO adm_usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jvaldivia','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',true, 'Janier', 'Valdivia','profesor@bolsadeideas.com');
INSERT INTO adm_usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true, 'Matias','Cairampoma','jhon.doe@bolsadeideas.com');
INSERT INTO adm_usuarios (username, password, enabled, nombre, apellido, email) VALUES ('acairampoma','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true, 'Alan','Cairampoma','alancairampoma@gmail.com');
INSERT INTO adm_usuarios (username, password, enabled, nombre, apellido, email) VALUES ('gziegler','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true, 'Gonzalo','Ziegler','gziegler@gmail.com');
INSERT INTO adm_usuarios (username, password, enabled, nombre, apellido, email) VALUES ('yvaldez','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true, 'Yur', 'valdes','yvaldez@gmail.com');

INSERT INTO adm_roles (nombre) VALUES ('ROLE_USER');
INSERT INTO adm_roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (1, 2);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (2, 1);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (3, 1);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (3, 2);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (4, 1);
INSERT INTO adm_usuarios_roles (usuario_id, role_id) VALUES (4, 2);

/* Creamos algunas especialidades*/

INSERT INTO adm_especialidad_mae(cod_dpto,nom_dpto,ind_tipo,estado,fec_registro,user_registro)VALUES('01','ABDOMEN','1','1',NOW(),'ADMIN');
INSERT INTO adm_especialidad_mae(cod_dpto,nom_dpto,ind_tipo,estado,fec_registro,user_registro)VALUES('02','CABEZA Y CUELLO','1','1',NOW(),'ADMIN');
INSERT INTO adm_especialidad_mae(cod_dpto,nom_dpto,ind_tipo,estado,fec_registro,user_registro)VALUES('03','RADIOTERAPIA','1','1',NOW(),'ADMIN');
INSERT INTO adm_especialidad_mae(cod_dpto,nom_dpto,ind_tipo,estado,fec_registro,user_registro)VALUES('04','MASTOLOGIA','1','1',NOW(),'ADMIN');


/* Creamos algunos medicos*/
INSERT INTO adm_profesional_mae(cod_cmp,des_nombres,des_apellidos,tipo_profesion,especialid_id,usuario_id,estado,fec_registro,user_registro)VALUES('032591','Janier','Valdivia','1',1,1,'1',NOW(),'ADMIN');
INSERT INTO adm_profesional_mae(cod_cmp,des_nombres,des_apellidos,tipo_profesion,especialid_id,usuario_id,estado,fec_registro,user_registro)VALUES('032592','Matias','Cairampoma','1',2,2,'1',NOW(),'ADMIN');
INSERT INTO adm_profesional_mae(cod_cmp,des_nombres,des_apellidos,tipo_profesion,especialid_id,usuario_id,estado,fec_registro,user_registro)VALUES('032593','Alan', 'Cairampoma','1',3,3,'1',NOW(),'ADMIN');
INSERT INTO adm_profesional_mae(cod_cmp,des_nombres,des_apellidos,tipo_profesion,especialid_id,usuario_id,estado,fec_registro,user_registro)VALUES('032594','Yur',  'Valdes','1',4,4,'1',NOW(),'ADMIN');

/* Creamos algunos diagnostico*/
INSERT INTO adm_diagnostico_mae(cod_dx,nom_dx,estado,fec_registro,user_registro)VALUES('C501','CA.MAMA DERECHA','1',NOW(),'ADMIN');
INSERT INTO adm_diagnostico_mae(cod_dx,nom_dx,estado,fec_registro,user_registro)VALUES('C502','CA.ESTOMOGO','1',NOW(),'ADMIN');
INSERT INTO adm_diagnostico_mae(cod_dx,nom_dx,estado,fec_registro,user_registro)VALUES('C503','CA.LARINGE','1',NOW(),'ADMIN');
INSERT INTO adm_diagnostico_mae(cod_dx,nom_dx,estado,fec_registro,user_registro)VALUES('C504','CA.OVARIO','1',NOW(),'ADMIN');
INSERT INTO adm_diagnostico_mae(cod_dx,nom_dx,estado,fec_registro,user_registro)VALUES('C505','CA.PULMON','1',NOW(),'ADMIN');


/* Creamos algunos examenes*/
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA ESTOMAGO','1','001','1',NOW(),'ADMIN');
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA MAMA','1','001','1',NOW(),'ADMIN');
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA ESOFAGO','1','001','1',NOW(),'ADMIN');
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA BRAZOS','1','001','1',NOW(),'ADMIN');
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA PIERNAS','1','001','1',NOW(),'ADMIN');
INSERT INTO cli_examenes_mae(nombre,tipo_servicio,cod_dpto,estado,fec_registro,user_registro) VALUES('ECOGRAFIA UTERO','1','001','1',NOW(),'ADMIN');

/* Creamos algunos medicamentos*/
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('OMEPRAZOL','1','2',NOW(),'ADMIN');
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('RANITIDINA','1','2',NOW(),'ADMIN');
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('PARACETAMOL','1','2',NOW(),'ADMIN');
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('IBUPROFENO','1','2',NOW(),'ADMIN');
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('GARBAPASEPINA','1','2',NOW(),'ADMIN');
INSERT INTO cli_medicina_mae(nombre,estado,tipo_medicina,fec_registro,user_registro) VALUES('CETERISINA','1','2',NOW(),'ADMIN');


