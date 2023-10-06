create database demo;
use demo;
create table Products(
product_id int,
product_code varchar(20),
product_name varchar(100),
product_price double check(product_price >0),
product_amount int check(product_amount >= 0),
product_Description text,
product_Status bit,
primary key (product_id)
);

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index product_code_index on products(product_code);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create  index product_name_price_index on products(product_name, product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain select * from products;

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view product_name_price_view as
select product_code, product_name, product_price, product_status from products;
select * from product_name_price_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
create procedure get_all_products()
begin
	select * from products;
end //
delimiter ; 

call get_all_products();

-- Tạo store procedure thêm một sản phẩm mới
delimiter //
create procedure add_new_product(
						product_id int,
						product_code varchar(20),
						product_name varchar(100),
						product_price double,
						product_amount int,
						product_Description text,
						product_Status bit
						)
begin
	declare countid int;
    declare countcode int;
    set countid = (select count(product_id) from products where products.product_id = product_id);
	set countcode = (select count(product_code) from products where products.product_code = product_code);
    if (countid > 0) then
		call edit_product_by_id(product_id, product_code, product_name, product_price,product_amount,product_Description,product_Status);
	elseif (countcode >0 ) then
		set product_id = (select product_id from products where products.product_code = product_code);
    else 
		insert into products(product_id,product_code, product_name, product_price,product_amount,product_Description,product_Status)
					values(product_id,product_code, product_name, product_price,product_amount,product_Description,product_Status);
    end if;
end //
delimiter ; 

call add_new_product(3,4,"Sản phẩm 5",15.6,56,"KHoogn có mô ta",0);

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure edit_product_by_id(
									product_id int,
									product_code varchar(20),
									product_name varchar(100),
									product_price double,
									product_amount int,
									product_Description text,
									product_Status bit)
begin
	update products
    set products.product_id = product_id,
     products.product_code = product_code,
     roducts.product_name=product_name,
     products.product_price=product_price,
     products.product_amount=product_amount,
     products.product_Description=product_Description,
     products.product_Status=product_Status
    where products.product_id = product_id;
end //
delimiter ;


-- Tạo store procedure xoá sản phẩm theo id
delimiter //
create procedure delete_product_by_id(product_id int)
begin
	delete from products where products.product_id = product_id;
end //
delimiter ;