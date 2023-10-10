use cdacpractice;

create table products(
	id int,
    category varchar(30),
    product varchar(30),
    value1 int
);

insert into products(id, category, product, value1)
values(1, "nonveg", "chicken", 150),
(2, "nonveg", "mutton", 200),
(1, "nonveg", "fish", 220),
(1, "nonveg", "prawns", 250),
(1, "veg", "gobi", 100),
(1, "veg", "parota", 45),
(1, "veg", "vegbiriyani", 150);