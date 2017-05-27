drop schema if exists superpet;
CREATE SCHEMA superpet DEFAULT CHARACTER SET utf8;

create table superpet.usuario(
	id int auto_increment,
    nome varchar(255),
    login varchar(255) unique,
    senha varchar(256),
    email_contato varchar(255),
    numero_contato varchar(255),
    facebook varchar(255),
    cep varchar(9) unique,
    estado varchar(255),
    cidade varchar(255),
    CONSTRAINT pk__usuario__id primary key(id)
);

create table superpet.autorizacao(
	id int,
    nome varchar(255),
     CONSTRAINT pk_autorizacao_id primary key(id)
);

insert into superpet.autorizacao values (1,'ROLE_ADMIN');
insert into superpet.autorizacao values (2,'ROLE_USER');
insert into superpet.autorizacao values (3,'ROLE_CUIDADOR');
insert into superpet.autorizacao values (4,'ROLE_ADOTADOR');

create table superpet.autorizacao_usuario(
	fk_usuario int,
    fk_autorizacao int,
    CONSTRAINT fk__autorizacao_usuario_fk_usuario foreign key (fk_usuario) references superpet.usuario(id),
    CONSTRAINT fk__autorizacao_usuario_fk_autorizacao foreign key (fk_autorizacao) references superpet.autorizacao(id),
    CONSTRAINT pk_autorizacao_usuario_id primary key(fk_usuario,fk_autorizacao)
);
create table superpet.tipo(
	id int,
    nome varchar(255),
    CONSTRAINT pk__tipo__id primary key(id)
);


insert into superpet.tipo values(1,'Cachorro');
insert into superpet.tipo values(2,'Gato');

create table superpet.porte(
 id int,
 porte varchar(255),
 CONSTRAINT pk__porte__id primary key(id)
);


insert into superpet.porte values(1,'Pequeno');
insert into superpet.porte values(2,'Médio');
insert into superpet.porte values(3,'Grande');

create table superpet.sexo(
 id int,
 sexo varchar(255),
 CONSTRAINT pk__sexo__id primary key(id)
);

insert into superpet.sexo values(1,'M');
insert into superpet.sexo values(2,'F');

create table superpet.idade(
 id int,
 idade varchar(255),
 CONSTRAINT pk__idade__id primary key(id)
);
insert into superpet.idade values(1,'Filhote');
insert into superpet.idade values(2,'Jovem');
insert into superpet.idade values(3,'Adulto');

create table superpet.pet(
	id int auto_increment,
    fk_tipo int,
    nome varchar(255),
    descricao varchar(255),
    fk_porte int,
    fk_sexo int,
    raca varchar(255),
    fk_idade int,
    CONSTRAINT pk__pet__id primary key(id),
    CONSTRAINT fk__pet__fk_tipo foreign key(fk_tipo) references superpet.tipo(id),
    CONSTRAINT fk__pet__fk_porte foreign key(fk_porte) references superpet.porte(id),
    CONSTRAINT fk__pet__fk_sexo foreign key(fk_sexo) references superpet.sexo(id),
    CONSTRAINT fk__pet__fk_idade foreign key(fk_idade) references superpet.idade(id)
);

create table superpet.favoritos(
    fk_pet int,
    fk_usuario int,
    CONSTRAINT fk__favoritos_fk_pet foreign key (fk_pet) references superpet.pet(id),
    CONSTRAINT fk__favoritos_fk_usuario foreign key (fk_usuario) references superpet.usuario(id),
    CONSTRAINT pk__favoritos__id primary key(fk_pet,fk_usuario)
    
);

create table superpet.foto(
	id int,
    foto blob,
    CONSTRAINT pk_foto_id primary key(id)
);

create table pet_foto(
	fk_pet int,
    fk_foto int,
    CONSTRAINT fk__pet_foto__fk_pet foreign key (fk_pet) references superpet.pet(id),
    CONSTRAINT fk__pet_foto__fk_foto foreign key (fk_foto) references superpet.foto(id),
    CONSTRAINT pk__pet_foto__id primary key(fk_pet,fk_foto)
);

create table superpet.interesse(
  id int,
  fk_pet int,
  fk_usuario int,
  CONSTRAINT fk__insteresse__fk_pet foreign key (fk_pet) references superpet.pet(id),
  CONSTRAINT fk__pet_foto__fk_usuario foreign key (fk_usuario) references superpet.usuario(id),
  CONSTRAINT pk__pet_foto__id primary key(id,fk_pet,fk_usuario)
);


create table superpet.adocao(
	fk_pet int,
    fk_usuario_cuidador int,
    fk_usuario_adotador int,
    data timestamp,
    CONSTRAINT fk__adocao__fk_pet foreign key (fk_pet) references superpet.pet(id),
    CONSTRAINT fk__adocao__fk_usuario_cuidador foreign key (fk_usuario_cuidador) references superpet.usuario(id),
    CONSTRAINT fk__adocao__fk_usuario_adotador foreign key (fk_usuario_adotador) references superpet.usuario(id)
);

