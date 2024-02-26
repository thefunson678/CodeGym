create database UserDBusers;
use UserDB;
create table users(
user_id int not null auto_increment,
user_name varchar(120) not null,
user_email varchar(220) not null,
user_country varchar(120) ,
primary key(user_id)
);

-- insert into userdb.users(user_name, user_email, user_country)
-- values("thuan", "thuan@gmail.com", "Việt Nam");