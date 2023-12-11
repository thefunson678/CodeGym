create database furama_database;
use furama_database;

create table job_position(
id_job_position int,
name_job_position varchar(45),
primary key (id_job_position)
);

create table education_degree(
id_education_degree int,
name_education_degree varchar(45),
primary key(id_education_degree)
);


create table department(
id_department int,
name_department varchar(45),
primary key(id_department)
);

create table staff(
id_staff int,
name_staff varchar(45),
dob_staff date,
card_id_staff varchar(45),
salary_staff double,
phone_staff varchar(45),
email_staff varchar(45),
address_staff varchar(45),
id_job_position int,
id_education_degree int,
id_department int
);

