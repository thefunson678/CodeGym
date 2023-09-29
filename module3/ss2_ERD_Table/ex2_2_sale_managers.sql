create database SaleMangers;
use Salemangers;

create table customers(
customer_ID varchar(50),
customer_name varchar(100),
customer_age int check(customer_age >=18),
primary key(customer_ID)
);

create table products(
product_ID varchar(50),
product_name varchar(100),
product_price double check(product_price >=0),
primary key(product_ID)
);

create table orders(
order_ID varchar(50),
customer_ID varchar(50),
order_date datetime,
order_totalPrice double check (order_totalPrice >=0),
primary key(order_ID),
foreign key(customer_ID) references customers(customer_ID)
);

create table orderDetail(
order_ID varchar(50),
product_ID varchar(50),
order_quantity int not null,
primary key(order_ID, product_ID),
foreign key(order_ID) references orders(order_ID),
foreign key(product_ID) references products(product_ID)
)