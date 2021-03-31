--liquibase formatted sql

--changeset bhfreiberger:29032021210000
CREATE TABLE PROCEDIMENTO_MEDICO (
	ID INT NOT NULL AUTO_INCREMENT,
    CODIGO INT NOT NULL,
    IDADE INT NOT NULL,
	SEXO VARCHAR(1) NOT NULL,
    PERMITIDO BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (ID) 
);