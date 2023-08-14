drop table if exists saudacao;
create table saudacao
(
    id       bigint       not null AUTO_INCREMENT,
    conteudo varchar(255) not null,
    PRIMARY KEY (id)
);