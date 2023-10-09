create database cdacPractice;
use cdacPractice;
create table customer(
	customerId int,
    firstName varchar(30),
    lastName varchar(30)
);
create table orders(
	orderId int,
    customerId int,
    prodName varchar(30)
);
insert into customer(customerId, firstName, lastName) 
values(101, "Ramesh", "Solanki"),
(102, "Suresh", "Sharma"),
(103, "Bhavesh", "Roy"),
(104, "Kailash", "Gupta"),
(105, "Mahesh", "Sharma");

insert into orders(orderId, customerId, prodName)
values(1, 102, "laptop"),
(2, 104, "mobile"),
(3, 102, "camera"),
(4, 106, "bike"),
(5, 108, "chair");

#when we apply this join on two tables than common tuple/record is produced as a relation
select customer.firstName, orders.prodName 
from customer inner join orders 
on customer.customerId = orders.customerId;

# full join
select customer.firstName, orders.prodName 
from customer left join orders 
on customer.customerId = orders.customerId;
