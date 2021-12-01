show databases;
create table tempp
(
	fir int,
    sec char(15)
);
-- -- procedure 1
delimiter //
create procedure abc()
begin
	insert into tempp values(1,'HEllo');
end;//
delimiter ;

call abc();
select * from tempp;
drop procedure abc;

-- -- procedure 2
delimiter //
create procedure abc()
begin
	declare x int;
    set x=10;
	insert into tempp values(x,'HEllo');
end;//
delimiter ;
call abc();
drop procedure abc;

-- -- procedure 3
delimiter //
create procedure abc()
begin
	declare x char(15) default'CDAC Mumbai';
    insert into tempp values (1, x);
end;//
delimiter ;
call abc();
drop procedure abc;

-- -- procedure 4
delimiter //
create procedure abc()
begin 
	declare x char(15) default 'King';
    declare y float default 3000;
    declare z float default 0.4;
    declare hra float;
    set hra = y*z;
    insert into tempp values(y,x);
    insert into tempp values(hra,'HRA');
end;//
delimiter ;
call abc();
select * from tempp;
drop procedure abc;

