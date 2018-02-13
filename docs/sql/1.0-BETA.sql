create user sandbox;
create database SANDBOXDEV;

create table USUARIO (
    USUA_ID INT PRIMARY KEY NOT NULL,
    USUA_NOME VARCHAR(128),
    USUA_LOGIN VARCHAR(64),
    USUA_SENHA VARCHAR(256),
    USUA_DT_CRIACAO DATE,
    USUA_STATUS VARCHAR(64),
    USUA_ROLE VARCHAR (64)
);
create sequence usuario_id_seq increment 1 minvalue 1 maxvalue 9223372036854775807 start 1 cache 1;
alter table usuario alter column usua_id set default nextval('usuario_id_seq'::regclass);

create table USUARIO_AUTENTICACAO (
    UAUT_ID INT PRIMARY KEY NOT NULL,
    UAUT_ID_USUA INT REFERENCES USUARIO(USUA_ID),
    UAUT_DT_AUTENTICACAO TIMESTAMP,
    UAUT_TOKEN VARCHAR(256)
);
create sequence usuario_autenticacao_id_seq increment 1 minvalue 1 maxvalue 9223372036854775807 start 1 cache 1;
alter table usuario_autenticacao alter column uaut_id set default nextval('usuario_autenticacao_id_seq'::regclass);

