use cdacpractice;
create table california(
	salesman_id int,
    name varchar(30),
    city varchar(30),
    commission decimal(10,2)
);

insert into california(salesman_id, name, city, commission)
values(5001, "James hoog", "california", 0.15), 
(5002, "Nail knite", "paris", 0.13),
(5005, "Pit Alex", "london", 0.11),
(5006, "Mc Lyon", "paris", 0.14),
(5007, "Paul Adam", "rome", 0.13),
(5003, "Lauson Hen", "san jose", 0.12);

select * from california;

create view noofCustomeer as
select salesman_id, name from california where city = "California";  

#ques 2
create table customers (
		cust_id int,
        cust_name varchar(20),
        city varchar(20),
        grade int,
        salesman_id int
);

insert into customers(cust_id,cust_name,city,grade,salesman_id) 
values (3002, "Nick Rimando", "California" ,100, 5001),
		(3007, "Brad Davis", "California" ,200 ,5001),
        (3005, "Graham Zusi", "New York", 200, 5002),
        (3008, "Julian Green", "London", 300, 5002),
        (3004, "Fabian Johnson", "Paris", 300 ,5006);


create view cust_count as
select count(cust_id), grade from customers group by grade;
