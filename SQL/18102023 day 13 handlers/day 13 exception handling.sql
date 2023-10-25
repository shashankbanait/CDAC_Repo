SELECT * FROM dac23.userinfo;

#THESE HANDLER ARE LIKE AN EXCEPTION HANDLING IN PROGRAMMING
######################EXIT HANDLERE############################
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertRecord`(in id int, in name varchar(50))
BEGIN
	declare exit handler for 1062
    begin
		select 'PQlease avoid duplicate entry in primary key' as message;
    end;
    
	insert into userInfo(userId, userName) values(id, name);
    
    select * from userInfo;
END



###################CONTINUE HANDLER#########################
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertRecord`(in id int, in name varchar(50))
BEGIN
	declare continue handler for 1062
    begin
		select 'Please avoid duplicate entry in primary key' as message;
    end;
    
	insert into userInfo(userId, userName) values(id, name);
    
    select * from userInfo;
END