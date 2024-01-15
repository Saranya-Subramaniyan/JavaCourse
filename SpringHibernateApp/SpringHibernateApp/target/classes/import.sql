create table person (
id integer primary key,
name varchar(255),
location varchar(255),
birth_date timestamp(6)
);


insert into person(id,name,location,birth_date) values(1,'saranya','cbe',current_Timestamp);
insert into person(id,name,location,birth_date) values(2,'sanjay','ttt',current_Timestamp);
insert into person(id,name,location,birth_date) values(3,'sruthi','kk',current_Timestamp);
insert into person(id,name,location,birth_date) values(4,'swathi','sok',current_Timestamp);
insert into person(id,name,location,birth_date) values(5,'samyu','nam',current_Timestamp);


select * from person;