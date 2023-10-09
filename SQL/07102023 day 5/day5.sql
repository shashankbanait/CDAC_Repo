use cdacPractice;
create table Department(
	deptId int primary key,
    name varchar(50) not null
);

#Copy structure of existing table to new table
create table depart like department;

insert into Department(deptId, name) values(101, "Accout"),(102, "Developer"), (103, "Admin");
select * from department;

create table Employee(
	empid int primary key,
    empName varchar(50) not null,
    empSalary decimal(15,2),
    did int,
    foreign key(did) references department(deptId)
);

insert into employee(empId, empName, empSalary, did)
values(1, "Ramesh", 45789, 102);

insert into employee(empId, empName, empSalary, did)
values(2, "Ramesh", 35789, 101), (4, "Bhavesh", 75789, 102), (5, "Dinesh", 25789, 101), ;

select employee.did, employee.empName, department.name
from employee, department where employee.did = department.dept