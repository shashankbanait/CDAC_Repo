use dac23;
delimiter //
create procedure oddevencheck(inout x int)
begin
    declare status varchar(10);
    
    if x % 2 = 0 then
        set status = 'even';
    else
        set status = 'odd';
    end if;
    
    select status as Result;
end //
delimiter ;

set @num = 111; 
call oddevencheck(@num);

# procedure drop karne ke liye
drop procedure oddEvenCheck;


#####################################################
delimiter //
create procedure factorial(in x int)
begin
	declare ans int default 1;
    
    while x>0 do
		set ans = ans*x;
		set x = x-1;
    end while;
    select ans;
end //
delimiter ;

set @n = 5;
call factorial(@n);
    