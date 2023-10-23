####################################Cursor#######################3
use dac23;

delimiter //
create procedure cursor_demo2()
begin
declare finished int default 0;
declare name varchar(50);
declare salary decimal(15, 2);

declare cursor2 cursor for select empName, empSalary from employee;
declare continue handler for not found set finished = 1;
open cursor2;
loop1: loop
	if finished then
    leave loop1;
    end if;
fetch cursor2 into name, salary;
select name, salary;
end loop;
close cursor2;
end //
delimiter ;

call cursor_demo2();

