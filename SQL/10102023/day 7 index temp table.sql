use dac23;
select * from employee;
select * from employee where salary>3000;
create index salIndex on employee(salary);
select * from salIndex;

#****************************************************
#Temporary Table
# 1 withoutu using existing table
create temporary table table1(tid int, name varchar(20));
desc table1;
select * from table1;


# 2 temporary tabl with structure of existing table
create temporary table table2 like department;
desc table2;
select * from table2;


# 3 Temporary table with structure and data of existing table
create temporary table table3 select * from department;
select * from table3;

desc employee;

create temporary table table4 select deptName from department;
select * from table4;