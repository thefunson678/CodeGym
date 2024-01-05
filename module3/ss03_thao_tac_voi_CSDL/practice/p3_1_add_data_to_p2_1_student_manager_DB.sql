use student_db;

insert into student_db.class(id_class, name_class, date_start, status_class)
values
(1,"A1","2008-12-20",1),
(2, "A2", "2008-12-22", 1),
(3,"B3", current_date(),0);

insert into student_db.student(id_student, name_student, address_student, phone_student, status_student, id_class)
values (1,'Hung', 'Ha Noi',  '0912113113', 1,1);
insert into student_db.student(id_student, name_student, address_student, status_student, id_class)
values (2,'Hoa', 'Hai Phong',1,1);
insert into student_db.student(id_student, name_student, address_student, phone_student, status_student, id_class)
values (3,'Manh', 'HCM', '0123123123',0,2);

insert into student_db.subjects(id_subjects, name_subjects, credit_subjects, status_subjects)
values(1,'CF',5,1),
	  (2,'C',6,1),
      (3,'HDJ',5,1),
      (4,'RDBMS',10,1);
      
insert into student_db.marks(id_subjects, id_student, mark_point, exame_times)
values(1,1,8,1),
	  (1,2,10,2),
      (2,1,12,1);