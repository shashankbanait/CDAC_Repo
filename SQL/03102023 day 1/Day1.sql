# For creation of database
create database dac23;

# For selecting the database
use dac23;

# For checking available databases
show databases;

# Create a table
Create table Employee(
	empId int,
    empName varchar(25)
);

# Check for table availability
show tables;

# Check Schema of table structure
desc employee;

# Add new column to existing table
alter table Employee
	add column empdept varchar(50);
    
# Adding one more new column to existing table at particular position
alter table Employee
	add column salary decimal(10, 2) after empName;
    
# Modify existing column in the table
alter table employee
	modify column empName varchar(50) not null;
    
# Change name of the column
alter table employee
	change column salary empSalary decimal(10, 2);
    
# Change table name
alter table employee
	rename dacEmployee;

# Delete particular column
alter table dacEmployee
	drop column depart;
    
#delete complete table structure
drop table dacEmployee;