create database ERDtoTables;

use ERDtoTables;

create table materials(
material_ID varchar(50),
material_name varchar(100),
primary key(material_ID)
);

create table OutputTicked(
output_ID int auto_increment,
output_Date datetime,
primary key(output_ID)
);

create table outputDetails(
material_ID varchar(50),
output_ID int,
output_price double,
output_quantity int,
primary key (material_ID, output_ID),
foreign key(material_ID) references materials(material_ID),
foreign key(output_ID) references OutputTicked(output_ID)
);

create table inputTicked(
input_ID int auto_increment,
input_date datetime,
primary key(input_id)
);

create table inputDetails(
material_ID varchar(50),
input_ID int,
input_price double,
input_quantity int,
primary key(material_ID, input_ID),
foreign key(material_ID) references materials(material_ID),
foreign key(input_ID) references inputTicked(input_ID)
);

create table manufacturers(
manufacturer_ID varchar(50),
manufacturer_name varchar(100),
maunfacturer_address text,
primary key(manufacturer_ID)
);

create table OrderTickeds(
order_ID varchar(50),
order_date date,
manufacturer_ID varchar(50),
primary key(order_ID),
foreign key(manufacturer_ID) references manufacturers(manufacturer_ID)
);

create table material_ordertickeds(
material_ID varchar(50),
order_ID varchar(50),
primary key(material_ID,order_ID),
foreign key(material_ID) references materials(material_ID),
foreign key(order_ID) references ordertickeds(order_ID)
);

create table manufacturer_phone_number(
phone_ID int auto_increment,
manufacturer_ID varchar(50),
phone_number varchar(20),
primary key(phone_ID),
foreign key(manufacturer_ID) references manufacturers(manufacturer_ID)
)
