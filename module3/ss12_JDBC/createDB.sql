create database userDao;
use userDao;
create table users(
 id  int NOT NULL AUTO_INCREMENT,
 username varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(username, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(username, email, country) values('Kante','kante@che.uk','Kenia');