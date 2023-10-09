create database labtask;
use labtask;
create table orders(
	ord_no int,
    purch_amt decimal(10, 2),
    ord_date date,
    customer_id int,
    salesman_id int	
);
desc orders;
insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70001, 150.5, '2012-10-05', 3005, 5002),
(70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001),
(70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-09-10', 3002, 5001);

select * from orders;

#2.Write a SQL query that counts the number of unique salespeople. Return number of salespeople.
select count(distinct(salesman_id)) as "salesman people" from orders;

#3.Write a SQL query to calculate the average purchase amount of all orders. Return average purchase amount.
select avg(purch_amt) as "purchase average" from orders;

#4.Write a SQL query to calculate total purchase amount of all orders. Return total purchase amount
select sum(purch_amt) from orders;

#5.Write a SQL query to find the salesperson and customer who reside in the same city. Return Salesman, cust_name and city.

#6.Write a SQL query to find distinct salespeople and their cities. Return salesperson ID and city.
alter table orders add column (salesmann varchar(20), city varchar(20));
select * from orders;

update orders set salesmann="John"
where ord_no="70001";

update orders set salesmann="barney"
where ord_no="70009";

update orders set salesmann="ted"
where ord_no="70002";

update orders set salesmann="dua"
where ord_no="70005";

update orders set salesmann="anne"
where ord_no="70008";
