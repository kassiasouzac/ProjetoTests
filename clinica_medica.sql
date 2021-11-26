drop database clinica_medica;
create database clinica_medica;

USE clinica_medica;


CREATE TABLE funcionarios ( 
Codigo_Funcionario INT NOT NULL AUTO_INCREMENT, 
Nome_Completo VARCHAR(50) NULL, 
Numero_RG VARCHAR(12) NULL,
Orgao_Emissor VARCHAR(6) NULL, 
Numero_CPF VARCHAR(14) NULL, 
Endereco VARCHAR(50) NULL, 
Numero VARCHAR(15) NULL, 
Complemento VARCHAR(30) NULL, 
Bairro VARCHAR(40) NULL, 
Cidade VARCHAR(40) NULL, 
Estado VARCHAR(2) NULL, 
Telefone VARCHAR(20) NULL, 
Celular VARCHAR(20) NULL, 
Numero_CTPS VARCHAR(20) NULL, 
Numero_PIS VARCHAR(20) NULL, 
Data_Nascimento DATE NULL, 
PRIMARY KEY (Codigo_Funcionario)
);