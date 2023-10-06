create database students_managers;
use students_managers;

create table classes(
class_ID int auto_increment,
class_name varchar(2),
class_started_date varchar(10),
class_status int,
primary key(class_ID)
);
insert into classes values(1,"A1","2008-12-20",1);
insert into classes values(2,"A2","2008-12-22",1);
insert into classes values(3,"B3",current_date(),0);

create table students(
student_ID int auto_increment,
student_name varchar(50),
student_address varchar(50),
student_phone varchar(10),
student_stauts int,
class_ID int,
primary key (student_ID),
foreign key(class_ID)  references classes(class_ID)
);
insert into students_managers.students(student_name, student_address, student_phone, student_stauts, class_ID)
values('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into students_managers.students(student_name, student_address, student_stauts, class_ID)
values('Hoa', 'Hai phong', 1, 1);
insert into students_managers.students(student_name, student_address, student_phone, student_stauts, class_ID)
values('Manh', 'HCM', '0123123123', 0, 2);

create table Subjects(
subject_id int,
subject_name varchar(10),
subject_credit int,
subject_status int,
primary key(subject_ID)
);
INSERT INTO  students_managers.Subjects
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
create table marks(
mark_ID int auto_increment,
subject_id int,
student_id int,
mark_point int check (mark_point >= 0 and mark_point <= 100),
mark_examTimes int,
primary key(mark_ID),
foreign key(subject_id) references subjects(subject_id),
foreign key(student_id) references students(student_id)
);
INSERT INTO Marks(subject_id, student_id, mark_point, mark_examTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);