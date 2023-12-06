create database student_manager;
use student_manager;
create table class(
id_class int auto_increment,
name_class varchar(10) not null,
primary key(id_class)
);

create table teacher (
id_teacher int auto_increment primary key,
name_teacher varchar(50),
age_teacher int,
country_teacher varchar(50)
);
