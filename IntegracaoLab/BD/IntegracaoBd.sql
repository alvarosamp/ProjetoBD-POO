drop database if exists integracão;
create database integracao;

use integracao;

create table Medidas_Biométricas(
	id int not null auto_increment primary key,
    id_usuario int,
    peso int,
    pressao_arterial  double,
    saturacao double,
    batimentos int
    );
create table Usuarios(
	id_usuario int not null auto_increment primary key,
    nome varchar(45) not null,
    email varchar(45) not null,
    idade int,
    sexo varchar(1),
    altura int
);
create table Consultas_medicas(
	id int not null auto_increment primary key,
    id_usuario int,
    date date,
    motivo text,
    resultado text
);
create table Historico_de_Doenca(
	id int not null auto_increment primary key,
    id_usuario int,
    nome_da_doenca varchar(45),
    date date,
    tratamento text
);
create table Sintomas(
	id int not null auto_increment primary key,
    Id_usuario int,
    descricao text,
    intensidade varchar(20)
);