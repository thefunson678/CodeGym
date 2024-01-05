create database student_DB;
use student_DB;

create	table Class(
id_class int not null auto_increment primary key,
name_class varchar(60) not null,
date_start datetime not null,
status_class bit
);

create table Student(
id_student int not null auto_increment primary key,
name_student varchar(30) not null,
address_student varchar(50),
phone_student varchar(20),
status_student bit(1),
id_class int not null,
foreign key(id_class) references class(id_class)
);

create table subjects(
id_subjects int not null auto_increment primary key,
name_subjects varchar(30) not null,
credit_subjects tinyint not null default 1 check (credit_subjects >= 1),
status_subjects bit default 1
);

create table marks(
id_marks int not null auto_increment primary key,
id_subjects int not null,
id_student int not null,
mark_point float default 0 check (mark_point between 0 and 100),
exame_times tinyint default 1,
unique(id_subjects, id_student),
foreign key(id_subjects) references subjects(id_subjects),
foreign key(id_student) references student(id_student)
);

