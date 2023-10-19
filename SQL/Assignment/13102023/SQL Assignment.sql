use dac23;
CREATE TABLE Post_Office (
    po_id INT PRIMARY KEY,
    po_name VARCHAR(35) NOT NULL,
    po_address VARCHAR(35) NOT NULL,
    po_city VARCHAR(35) NOT NULL,
    po_state CHAR(2) NOT NULL,
    po_pincode CHAR(5) NOT NULL
);

# b). Write insert query for the above table (Post_Office). Enter 5 rows in the table.
insert into post_office (po_id, po_name, po_address, po_city, po_state, po_pincode) values
(1, 'Mumbai GPO', 'Fort', 'Mumbai', 'MH', '40001'),
(2, 'Kolkata GPO', 'BBD Bagh', 'Kolkata', 'WB', '70001'),
(3, 'Bangalore GPO', 'MG Road', 'Bangalore', 'KA', '56001'),
(4, 'Pune GPO', 'Sadashiv Peth', 'Pune', 'MH', '41102'),
(5, 'Lucknow GPO', 'Hazratganj', 'Lucknow', 'UP', '22601');

select * from post_office;

# c). Write a query that will display all the Post Office records of a State. Display the address of Post Office in a same city.
select po_id, po_name, po_address, po_city, po_state, po_pincode
from post_office
where po_state = 'MH'
order by po_city, po_name;

# d).In which city having maximum number of post office,show the pincodes of those cities.
select po_city, count(*) as num_post_offices, group_concat(distinct po_pincode order by po_pincode) as pincodes
from post_office
group by po_city
having num_post_offices = (select MAX(num_post_offices) 
from (select po_city, count(*) as num_post_offices 
from post_office group by po_city) as subquery);


# Q2. Create a store procedure that receives the first name of the person table as input and the last name as output.
delimiter //
create procedure getlastnamebyfirstname(
    in inputfirstname varchar(255),
    out outputlastname varchar(255)
)
begin
    select po_name into outputlastname
    from post_office
    where po_name = inputfirstname;
end;
//
delimiter ;

call getlastnamebyfirstname('Mumbai GPO', @output);
select @output;

# Q3. Create a query to show the account number and customerid from the customer table for the customer without sales orders.
select c.account_number, c.customer_id
from customer c
left join sales_orders so on c.customer_id = so.customer_id
where so.customer_id is null;


# Q4. Create a query to show the top 10 customerIDs of users with more Orders.
select customer_id, count(order_id) as order_count
from orders
group by customer_id
order by order_count desc
limit 10;

# Q5. Creating procedure without parameters
delimiter //
create procedure CountAllCities()
begin
    declare po_id int;
    select po_id = count(*) from post_office;
    select po_id;
end // 
delimiter ;

CALL CountAllCities();


# Q6. Creating Procedure with (IN/OUT/INOUT) Parameters
delimiter //
create procedure example_procedure (
    in in_param int,
    out out_param int,
    inout inout_param int
)
begin
    set out_param = in_param * 2;
    set inout_param = inout_param * 3;
end //
delimiter ;

-- calling
declare @in_value int = 5;
declare @out_value int;
declare @inout_value int = 7;

call example_procedure(@in_value, @out_value, @inout_value);


# Q. 7
delimiter //

create procedure calculategrade(in student_score int, out student_grade char(1))
begin
    if student_score >= 90 then
        set student_grade = 'A';
    elseif student_score >= 80 then
        set student_grade = 'B';
    elseif student_score >= 70 then
        set student_grade = 'C';
    elseif student_score >= 60 then
        set student_grade = 'D';
    else
        set student_grade = 'Fail';
    end if;
end //

delimiter ;

call calculategrade(85, @student_grade);


# Q8. Write a MySQL stored procedure that uses a loop to iterate through a list of numbers from 1 to 20.
delimiter //
create procedure IterateNumbers()
begin
    declare counter int;
    set counter = 1;

    create temporary table if not exists NumberList (Number int);
    while counter <= 20 do
        insert into NumberList (Number) values (counter);

        set counter = counter + 1;
    end while;
    select * from NumberList;
    drop temporary table if exists NumberList;
end //
delimiter ;

call IterateNumbers();

# Q9.Create a stored procedure named CalculateFactorial that accepts a single integer parameter, n.Inside the procedure, use a loop to calculate the factorial of n.
delimiter //

create procedure calculatefactorial(in n int)
begin
  declare factorial int;
  declare i int;
  
  set factorial = 1;
  set i = 1;

  while i <= n do
    set factorial = factorial * i;
    set i = i + 1;
  end while;

  select factorial;
end;
//
delimiter ;

call calculatefactorial(5);



# Q10. Create a stored procedure named GenerateFibonacciSequence that accepts a single integer parameter, n, representing the number of terms in the Fibonacci sequence
delimiter //

create procedure GenerateFibonacciSequence(in n int)
begin
  declare a int;
  declare b int;
  declare i int;
  declare temp int;

  set a = 0;
  set b = 1;
  set i = 1;

  if n >= 1 then
    select a as FibonacciTerm;
  end if;

  if n >= 2 then
    select b as FibonacciTerm;
  end if;

  while i < n - 1 do
    set temp = a + b;
    set a = b;
    set b = temp;
    set i = i + 1;
    select temp as FibonacciTerm;
  end while;
end;
//

delimiter ;

call GenerateFibonacciSequence(10);
