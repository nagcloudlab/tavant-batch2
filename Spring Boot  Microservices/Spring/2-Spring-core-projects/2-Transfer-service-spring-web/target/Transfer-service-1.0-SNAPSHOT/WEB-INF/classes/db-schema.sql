
create database testdb;
use testdb;

create table Account (
 number varchar(12) not null,
 balance double precision not null,
 primary key (number)
);

insert into Account values ("1",1000.00);
insert into Account values ("2",1000.00);