use dac_sept_23;


select * from department;
Delimiter //
create procedure getAllEmployee()
begin
	select empname from employee;
end //
Delimiter ;

call getAllEmployee();

Delimiter //
create procedure getAllEmployeeAndNos()
begin
	select empname from employee;
    select count(*) from employee;
end //
Delimiter ;

call getAllEMployee();
call getAllEmployeeAndNos();
#*****************IN/OUT/INOUT***********************************

drop procedure getAllEmployeeAndNos;

Delimiter //
create procedure getSingleEmployee(in id int)
begin
	select empName from employee where empid=id;
end //
Delimiter ;

call getSingleEmployee(4);

drop procedure getSingleEmployee;

#****************************************************************************************

Delimiter //
create procedure findMaxSalary(out highestSalary decimal(10,2))
begin
	select Max(empSalary) into highestSalary from employee;
end //
Delimiter ;

call findMaxSalary(@m);

#***************************************************

Delimiter //
create procedure findSalary(in id int, out Salary decimal(10, 2))
begin
	Select EmpSalary into Salary from employee where empid=id;
end //
delimiter ;

call findSalary(2, @m);
select @m as Highest;

#******************************************************
Delimiter //
create procedure updateSalary(inout sal decimal(10, 2), in id int)
begin
	Select empSalary into sal from employee where empId = id;
    
    set sal=sal*1.10;
    
    update employee set empSalary=sal where empId = id;
    
end //
Delimiter ;

call updateSalary(@s, 2);
select @s;

#**********************************************

Delimiter  //
create procedure sumOfSalary(out sal decimal(14, 2))
begin
	select sum(empSalary) into sal from employee;
end //
delimiter ;

call sumOfSalary(@k);