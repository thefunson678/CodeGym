create database stores;
use stores;

create table customer(
id_customer varchar(45),
name_customer varchar(45),
age_customer date,
primary key(id_customer)
);

create table product(
id_product varchar(45),
name_product varchar(45),
price_product double,
primary key(id_product)
);

create table orders(
id_orders varchar(45),
id_customer varchar(45),
date_orders date,
total_price_orders double,
primary key(id_orders),
foreign key(id_customer) references customer(id_customer)
);

create table OrderDetail(
id_orders varchar(45),
id_product varchar(45),
quality_orders int,
foreign key(id_orders) references orders(id_orders),
foreign key(id_product) references product(id_product)
) ;