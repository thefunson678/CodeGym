use students_managers;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subjects where(subject_credit = (select max(subject_credit)  from subjects));


-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
-- Cach 1
select  * from subjects
join marks on subjects.subject_id = marks.subject_id
where (mark_point = (select max(mark_point) from marks ));

-- Cach 2
select * from subjects 
where subject_id 
in (
select subject_id from marks 
	   where mark_point = (select max(mark_point) from marks)
);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select students.student_id, student_name, student_address, student_phone, student_stauts, avg(marks.mark_point) from students
join marks on marks.student_id = students.student_id
group by students.student_id
order by avg(marks.mark_point) DESC;