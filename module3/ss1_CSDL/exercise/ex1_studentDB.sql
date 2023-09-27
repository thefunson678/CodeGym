create database student_manager;

create table student_manager.Class(
id int auto_increment,
className varchar(15) null,
primary key (id));

create table student_manager.Teacher(
id int auto_increment,
nameTeacher varchar(45) null,
age int,
country varchar(45) null,
primary key(id))