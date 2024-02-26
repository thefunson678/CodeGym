create database TestTest;
use TestTest;
create table testTable(
date_test date,
time_test datetime,
test_id int,
list_test varchar(45),
text_test varchar(45),
option_test varchar(45),
yes_no bit(1),
primary key(test_id)
);

insert into testTable(date_test, time_test, test_id, list_test, text_test, option_test, yes_no)
values
("2022-12-5", "2022-12-5 12:05:56", 1,"Chọn 1", "Text 1", "Option 1", 1),
("2022-12-5", "2022-12-5 12:05:56",2,"Chọn 2", "Text 1", "Option 2", 0),
("2022-12-5", "2022-12-5 12:05:56",3,"Chọn 3", "Text 2", "Option 1", 0),
("2022-12-5", "2022-12-5 12:05:56",4,"Chọn 4", "Text 3", "Option 1", 1),
("2022-12-5", "2022-12-5 12:05:56",5,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",6,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",7,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",8,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",9,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",10,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",11,"Chọn 1", "Text 1", "Option 1", true),
("2022-12-5", "2022-12-5 12:05:56",12,"Chọn 1", "Text 1", "Option 2", true);

insert into testTable(date_test, time_test, test_id, list_test, text_test, option_test, yes_no)
values
("2022-12-25", "2022-12-5 12:05:56.0", 14,"Chọn 1", "Text 1", "Option 1", 1);
select * from testTable;
truncate table testTable;
select date_test, time_test, test_id, list_test, text_test, option_test, yes_no from testTable
order by list_test asc;