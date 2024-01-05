use student_db;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student where name_student like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select * from class where Month(date_start) = 12 and status_class = true;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.\
select * from subjects where (credit_subjects between 3 and 5);

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
update student 
set student.id_class = 2 
where student.id_student = (select id_student from (select student.id_student from student where student.name_student = "Hung") as x);

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.name_student, subjects.name_subjects, marks.mark_point from student
join marks on student.id_student = marks.id_student
join subjects on marks.id_subjects = subjects.id_subjects
order by marks.mark_point desc, student.name_student asc;
