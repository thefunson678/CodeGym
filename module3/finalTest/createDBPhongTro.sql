create database PhongTro;
Use PhongTro;

create	table humans(
human_id varchar(10),
human_name varchar(100),
human_main_phone varchar(45),
primary key(human_id)
);

create table rooms(
room_id varchar(6),
human_id varchar(10),
room_start_date date,
room_payment_method varchar(25),
room_note varchar(100),
primary key(room_id),
foreign key(human_id) references humans(human_id) 
);

insert into humans(human_id, human_name,human_main_phone)
values("KH001", "Nguyễn Văn A", "0123456789"),
("KH002", "Nguyễn Văn B", "0123456788"),
("KH003", "Nguyễn Văn C", "0123456789"),
("KH004", "Nguyễn Văn D", "0123456789"),
("KH005", "Nguyễn Văn E", "0123456789"),
("KH006", "Nguyễn Văn F", "0123456789");

insert into rooms(room_id,human_id,room_start_date,room_payment_method,room_note)
values("PT-001", "KH001", "2024-03-02","Theo tháng", "Phòng có điều hòa"),
("PT-002", "KH002", "2024-04-02","Theo tháng", "Phòng có điều hòa, Máy giặt"),
("PT-003", "KH003", "2024-03-08","Theo tháng", "Phòng có giường đôi"),
("PT-004", "KH004", "2024-05-07","Theo tháng", ""),
("PT-005", "KH005", "2024-09-02","Theo tháng", "Phòng có quạt trần");

select rooms.room_id, humans.human_name, humans.human_main_phone, rooms.room_start_date, rooms.room_payment_method, rooms.room_note from rooms join humans on rooms.human_id = humans.human_id;