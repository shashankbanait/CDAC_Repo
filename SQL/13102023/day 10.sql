select char(65, 71, 89, 122);

select concat("John", "sinha");

select lower("New WORDS");

select upper("Hi this is Suresh"); 

select trim("Hello");

select substr("Shashank", 2, 4);

select instr(str1, str2) ;
select length ("shashank");



select mod(10,3);

select power(10, 2);

select round(193.325, 1);
# answer will be 193.3

select truncate(193.238, 2);
# answer will be 193.23

select current_date();
# gives the date

select now();
# gives date and time

select month(current_date());
# gives the month index number like 10 for october

select day("2023-12-10");

select system_user();
# gives the hostname

select sysdate();
#gives the system date

use dac23;

delimiter //
create function helloSir()
returns varchar(50)
deterministic
begin
	return "Hello Sir";
end //
delimiter ;

select helloSir();

#*********************************************************
delimiter //
create function addition(x int, y int)
returns int
deterministic
begin
	return (x+y);
end //
delimiter ;
select addition(222222, 222222222);