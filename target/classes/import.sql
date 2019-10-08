INSERT INTO clientes(id_cliente, tipo_persona, rfc, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, direccion, razon_social, fecha_creacion) VALUES(1, 1, 'FILJ850418QM3', 'Julio Alberto', 'Figueroa', 'Licona', '1985-04-18 12:00', 'Gobernador Garcia Conde 34', null, null);
INSERT INTO clientes(id_cliente, tipo_persona, rfc, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, direccion, razon_social, fecha_creacion) VALUES(2, 2, 'JLS191008DF1', null, null, null, null, 'Paseo de los Tamarindos', 'JLSystems', '2019-10-08 00:00');
INSERT INTO contratos(id_contrato, id_cliente, numero_contrato, fecha_contrato) VALUES(1, 1, 'Contrato 1', '2015-01-01 12:00');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(1, 1, 'Anexo 1', 24, 15000.00, 'Clase C Sedan');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(2, 1, 'Anexo 2', 36, 10000.00, 'Clase A Hatchback');
INSERT INTO contratos(id_contrato, id_cliente, numero_contrato, fecha_contrato) VALUES(2, 1, 'Contrato 2', '2019-01-01 12:00');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(3, 2, 'Anexo 1', 24, 15000.00, 'Clase C Coupe');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(4, 2, 'Anexo 2', 36, 10000.00, 'Clase A Hatchback AMG');
INSERT INTO contratos(id_contrato, id_cliente, numero_contrato, fecha_contrato) VALUES(3, 2, 'Contrato 3', '2019-10-08 12:00');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(5, 3, 'Anexo 3', 60, 50000.00, 'Camion FG45');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(6, 3, 'Anexo 4', 60, 50000.00, 'Camion FG45');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(7, 3, 'Anexo 5', 60, 50000.00, 'Camion FG45');
INSERT INTO anexos(id_anexo, id_contrato, numero_anexo, plazo, pago_mensual, numero_serie) VALUES(8, 3, 'Anexo 6', 60, 50000.00, 'Camion FG45');