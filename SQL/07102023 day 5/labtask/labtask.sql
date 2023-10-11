use cdacpractice;

create table products(
	id int,
    category varchar(30),
    product varchar(30),
    value1 int
);

insert into products(id, category, product, value)
values(1, "nonveg", "chicken", 150),
(2, "nonveg", "mutton", 200),
(3, "nonveg", "fish", 220),
(4, "nonveg", "prawns", 250),
(5, "veg", "gobi", 100),
(6, "veg", "parota", 45),
(7, "veg", "vegbiriyani", 150);

truncate table products;

select * from products;

create table OrderDetails(
	ordernumber int,
    orderline int,
    part varchar(2)
);

insert into OrderDetails(ordernumber,orderline,part)
values (10001,1,"A"),
	   (10001,2,"B"),
	   (10001,3,"C"),
	   (10002,1,"A"),
	   (10002,2,"B"),
	   (10002,3,"C"),
	   (10003,1,"A");

# 1. Write SQL query to add a primary key constraint to an existing table named "Products" for the "product_id" column.
alter table products add constraint primary key(id);

# 2. Write SQL query to add a foreign key constraint to an existing table named "OrderDetails" that references the "product_id" column in the "Products" table.
alter table orderdetails 
add constraint foreign key(orderline) references products(id);

# 3. Write a SQL query to retrieve a list of products from a table named "Products" sorted in ascending order by their price.
select product, value from products order by value asc;

