create database dac_sept_23;
use dac_sept_23;
create table voter(
	voterId int,
    voterName varchar(50) not null,
    age int check(age>18),
    aadhar varchar(12) unique,
    income decimal(10,2) default 0.00,
    primary key(voterId)
);

desc voter;

insert into voter(voterId, voterName, age, aadhar, income)
values(101, "Surendra Bhatt", 21, "6332326623", 25000);

insert into voter(voterId, voterName, age, aadhar, income)
values(102, "Surendra Bhatt", 21, "6332326624", 25000);

insert into voter(voterId, voterName, age, aadhar, income)
values(103, "Vaibhav Sharma", 24, "6332326625", 35000),
(104, "Vaibhav Sharma", 26, "6332326626", 35000),
(105, "Vaibhav Sharma", 27, "6332326627", 35000),
(106, "Vaibhav Sharma", 28, "6332326628", 35000),
(107, "Vaibhav Sharma", 29, "6332326629", 35000),
(108, "Vaibhav Sharma", 30, "6332326630", 35000) ;

#Aggregate function
select max(income) as "highest salary" from voter;
select count(income) from voter;
select min(income) as "lowest salary" from voter;
select sum(income) as "Total income" from voter;
select count(*) as "Total record" from voter;
select avg(income) as "Average Income" from voter;

#clauses
select * from voter;
select voterName as Name, age as Age from Voter;
select voterName as Name, age as Age from Voter where income>30000;
select voterName as Name, age as Age from voter where income in(24000, 34000);
#24000 se leke 50000 ke bich ki income wale sare records show honge
select voterName as Name, age as Age from voter where income between 24000 and 50000;
select voterName as Name, age as Age from voter where income between 24000 and 50000 order by age;

#jo naam su se shuru ho rhe sirf wahi dikhana hai
select * from voter where voterName like 'Su%';

#jo naam av par khatm ho rhe hai sirf wahi records dikhana hai
select * from voter where voterName like '%ma';

#agar middle me koi word likha hai aur vo search karna hai to
select * from voter where voterName like '%Sh%';

# ascending order me income(ya phir kisi bhi value ko sort karna hai) to
select voterName, income from voter order by income;

# descending order me income(ya phir kisi bhi value ko descending order me sort karna hai) to
select voterName, income from voter order by income desc;

# age ko group karke income add kar di
select age, sum(income) from voter group by (age);

# 24 ki age se jyaada age ke logo ko group karke income add karke show kardi bs
select age, sum(income) from voter group by (age) having age>24;

select * from voter where aadhar is not null;

# repeated chize show nhi karta hai
select distinct(voterName) from voter;