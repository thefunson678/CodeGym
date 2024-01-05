use student_db;

-- Hiển thị danh sách tất cả các học viên
select * from student;

-- Hiển thị danh sách các học viên đang theo học.
select * from student where status_student = true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
select * from subjects where credit_subjects < 10;

-- Hiển thị danh sách học viên lớp A1
select * from student 
join class on student.id_class = class.id_class and class.name_class = "A1";

-- Hiển thị điểm môn CF của các học viên.
select student.id_student, student.name_student, subjects.name_subjects, marks.mark_point from student
join marks on student.id_student = marks.id_student
join subjects on marks.id_subjects = subjects.id_subjects
where subjects.name_subjects = 'CF';