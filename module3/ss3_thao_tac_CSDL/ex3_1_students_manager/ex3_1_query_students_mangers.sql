use students_managers;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from students where students.student_name like "h%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from classes group by class_id having month(classes.class_started_date) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from	subjects where subjects.subject_credit >=3 and subjects.subject_credit <=5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set sql_safe_updates = 0;
update students_managers.students 
set class_ID = 2
where student_name = "Hung";
set sql_safe_updates = 1;

-- Hiển thị các thông tin: StudentName, SubName, Mark. 
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student_name , subjects.subject_name, marks.mark_point from students 
join marks on students.student_id = marks.student_id
join subjects on marks.subject_id = subjects.subject_id
order by marks.mark_point DESC, students.student_name ASC;
