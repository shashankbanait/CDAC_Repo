use dac23;
create table user(
	id int primary key auto_increment,
    name varchar(50),
    email varchar(100)
);

create table audit_log(
	event_type varchar(50),
    event_description varchar(150)
);

##########INSERT##################
delimiter //
create trigger after_user_insert
after insert on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values('Insert', concat('New user inserted : Id ', new.id, ',Name ', new.name,',Email ', new.email));
end //
delimiter ;

insert into user(name, email) values
("Ramesh", "ram@gmail.com");

select * from audit_log;

insert into user(name, email) values
("Suresh", "suresh@gmail.com");


####################DELETE############################
delimiter //
create trigger before_user_delete
before delete on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values('Delete', concat('Old user deleted : Id ', old.id, ',Name ', old.name,',Email ', old.email));
end //
delimiter ;

delete from user where id=2;

select * from audit_log;

############UPDATE#################
delimiter //
create trigger after_user_update
after update on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values('Update', concat('User Updated : Id ', new.id, ',Name ', new.name,',Email ', new.email));
end //
delimiter ;

update user set email="ramesh@gmail.com" where id=1;
select * from audit_log;
select * from user;

