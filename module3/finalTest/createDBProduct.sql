create database products;
use products;
create table category(
id_category int auto_increment,
name_category varchar(45),
primary key(id_category)
);

insert into category(name_category) values('Phone'),('Tivi'),('Tủ lạnh'),('Máy giặt');

create table products(
id_product int,
name_product varchar(45),
price_product double,
quantity_product int,
category_product int,
primary key(id_product),
foreign key(category_product) references category(id_category)
);

create table colors(
id_color int auto_increment,
name_color varchar(10),
primary key(id_color)
);

insert into colors(name_color) values('Đỏ'), ('Xanh'), ('Đen'),('Trắng'),('Vàng');

create table productcolor(
id_product int,
id_color int,
foreign key(id_product) references products(id_product),
foreign key(id_color) references colors(id_color)
);

insert into products(id_product,name_product,price_product,quantity_product,category_product)
values
(1,'iPhone 11', 799,12,1),
(2,'iPhone 11 Pro', 1100.0,12,1),
(3,'iPhone X', 749,12,1),
(4,'Smart Tivi 55 inch', 799,12,2),
(5,'Tủ lạnh 2 cánh Toshiba', 799,12,3),
(6,'Máy giặt cửa ngang SamSung', 320,12,4);

insert into productcolor(id_product,id_color)
values(1,1),(1,2),(1,3),
(2,1),(2,2),(2,3),
(3,1),(3,2),(3,3),
(4,1),(4,2),(4,3),
(5,1),(5,2),(5,3),
(6,1),(6,2),(6,3);

select products.id_product, products.name_product, products.price_product, products.quantity_product, category.name_category from products join category on products.category_product = category.id_category;

select colors.name_color from productcolor join colors on colors.id_color = productcolor.id_color where productcolor.id_product = 1 ;

delete from productcolor where id_product =1;
delete from products where id_product =1;