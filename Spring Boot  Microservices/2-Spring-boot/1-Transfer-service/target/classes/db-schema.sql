
create database testdb;
use testdb;

create table accounts (
 number varchar(12) not null,
 balance double precision not null,
 primary key (number)
);

insert into accounts values ("1",1000.00);
insert into accounts values ("2",1000.00);