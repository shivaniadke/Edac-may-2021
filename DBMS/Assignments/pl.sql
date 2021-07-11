create schema PL;
use pl;

create table abc      -- -------CREATION OF TABLE
(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
first int(10),
sec varchar(25)
);

delimiter // 
create procedure abc()
begin
insert into abc values(1,'inside abc');
end;//
delimiter ;

call abc();  # first make call to procedure
select * from abc; 



-- -------------------------------------MySQL----------------------------------------------------------
-- -----------------------------------Exercise 1------------------------------------------------------- 
/*1. Write a program that computes the perimeter and the area of a rectangle. Define your own values for the length and width. (Assuming that L and W are the length 
and width of the rectangle, Perimeter = 2*(L+W) and Area = L*W. */

create table rect
(
perimeter float,
area float
);

delimiter $
create procedure rectangle(l int,w int)
begin
declare area float;
declare perimeter float;
set area = l*w;
set perimeter = 2*(l+w);
insert into rect values (perimeter,area);
end; $
delimiter ;


drop procedure rectangle;
drop table rect;

call rectangle(10,20);
select * from rect;

/*2. Write a program that declares an integer variable called num, assigns a value to it, 
and computes and inserts into the tempp table the value of the variable itself, its 
square, and its cube. */

create table roots
(
square float,
cuube float
);

delimiter //
create procedure varibles(num float)
begin
declare square float;
declare cuube float;
set square=num*num;
set cuube=num*num*num;
insert into roots values(square,cuube);
end ;//
delimiter ;

call varibles(5);
select * from roots;

/*3. Convert a temperature in Fahrenheit (F) to its equivalent in Celsius (C) and vice 
versa. The required formulae are:- C= (F-32)*5/9 
F= 9/5*C + 32 */

create table temperature
(
	TEMP FLOAT,
    Degree varchar(50)
);

delimiter //
create procedure conversion(num float,str varchar(30))
begin 
	declare Fahrenheit  float;
    declare celsius  float;
    if(str='F' or 'Fahrenheit') then
    set celsius = (num-32)*5/9;
    insert into temperature values(celsius,'C');
	elseif(str='C' or 'Celsius') then
    set Fahrenheit = 9/5*num + 32;
    insert into temperature values(Fahrenheit,'F');
    else
    insert into temperature values(num,'invalid input'); 
    end if;
    end ;//
    delimiter ;
    
    call conversion(37,'d');
    
    select * from temperature;
    drop table temperature;
    drop procedure conversion;
    

/*4. Convert a number of inches into yards, feet, and inches. For example, 124 inches 
equals 3 yards, 1 foot, and 4 inches. */

create table conversion
(
	yards float,
    foot float,
    inches float
);



 
/*5. Write a program that enables a user to input an integer. The program should then 
state whether the integer is evenly divisible by 5. */
 
/*6. Your block should read in two real numbers and tell whether the product of the two 
numbers is equal to or greater than 100.*/