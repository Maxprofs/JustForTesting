select * from ccompany;
select * from cperson;
select * from country;

delete from country where name='Portugal';
delete from country where name='Easter Island';
delete from country where name='Brazil';
delete from cperson where name='Yumi';
delete from cperson where name='Yumi2';
delete from ccompany where name='Delta';
delete from ccompany where name='Delta2';

create table country(
id bigserial not null,
name varchar(20),
size varchar(10),
p_id bigint not null REFERENCES cperson(id)
);

insert into country (name,size,p_id) values('Cambodia','Medium',1);
insert into country (name,size,p_id) values('France','Large',1);

create table cperson(
id bigserial not null,
name varchar(20),
idno varchar(10) not null,
c_id bigint not null REFERENCES ccompany(id),
PRIMARY KEY(id)
);

insert into cperson (name,idno,c_id) values('Sophany','123456789',1);
insert into cperson (name,idno,c_id) values('Joseph','123456788',1);
insert into cperson (name,idno,c_id) values('Natalie','123456787',1);


create table ccompany(
id bigserial not null,
name varchar(20) unique,
PRIMARY KEY (id)
);

insert into ccompany (name) values('Alpha');
insert into ccompany (name) values('Bravo');
insert into ccompany (name) values('Charlie');