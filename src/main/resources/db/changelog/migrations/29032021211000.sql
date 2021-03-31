--liquibase formatted sql

--changeset bhfreiberger:29032021211000
INSERT INTO PROCEDIMENTO_MEDICO (COD_PROC, AGE, SEX, ALLOWED) 
VALUES (1234, 10, 'M', TRUE), 
	   (4567, 20, 'M', TRUE),
       (6789, 10, 'F', TRUE),
       (6789, 10, 'M', TRUE),
       (1234, 20, 'M', TRUE),
       (4567, 30, 'F', TRUE);