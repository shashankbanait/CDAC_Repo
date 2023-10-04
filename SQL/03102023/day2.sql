use dac23;
create table employee(
	id int,
    name varchar(20),
    address char(50),
    salary decimal(15, 2)
);
show tables;
select * from employee;
insert into employee (id, name, address, salary)
values (1,"harshal", "nimanwada", 1234), 
		(2, "milind", "wardha", 4312),
        (3, "prabhu", "nagpur", 5342);
        
delete from employee where id=5;

# Desabling safe mode
insert into employee values(4, "vaibhav", "shegaon", 5678);
insert into employee values(6, "swapnil", "pune", 4354);
SET SQL_SAFE_UPDATES = 0;

#add new column
alter table employee add contact int;

#update query
update employee set id=5 where name="swapnil";
