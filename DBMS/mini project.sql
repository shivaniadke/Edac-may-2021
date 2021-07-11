-- --------------------------------------------------------MINI PROJECT-------------------------------------------------------------
-- ---------------------------------------------------------Team 12-----------------------------------------------------------------
-- Team Meambers
# Shivani Nitin Adke
# Shivani Shrikrishna Joshi
-- -------------------------------------------------------GROCERY STORE-------------------------------------------------------------

create schema project;
show databases;
use project;

CREATE TABLE `customer` (
  `cust_id` int(11) DEFAULT NULL,
  `cust_name` varchar(40) DEFAULT NULL,
  `ph_no` bigint DEFAULT NULL
) ;
insert into customer values(101,'JACK',8084540098),
(102,'THOMAS',9850210411),
(103,'KAYLIE',7055770048),
(104,'SCOTT',8810239700),
(105,'MONIKA',7743095628),
(106,'ROBERT',8084540099),
(107,'STEVE',9130503151),
(108,'PETER',9607092069);
select * from customer;

create table employee(emp_id varchar(40),emp_name varchar(45),Dept varchar(45),sal int,Hire_date date);
drop table employee;
insert into employee values('E01','Rachel','MGR',50000,'2015-12-01'),
('E02','Tonny','Acc',20000,'2019-05-17'),
('E03','Bruce','Acc',15000,'2020-01-15'),
('E04','Sam','Acc',10000,'2021-03-25'),
('E05','Eva','Sales',17000,'2017-08-11'),
('E06','James','Sales',12000,'2020-07-09');
select * from employee;

create table product(Pro_id varchar(40),Pro_name varchar(45),stock int,price float);
insert into product values('P01','Maggi',100,15.00),
('P02','Cookies',75,100.00),
('P03','Shampoo',40,145.00),
('P04','Soap',150,45.00),
('P05','Jam',20,65.00),
('P06','Cheese',60,105.00),
('P07','Rice',200,55.40),
('P08','Tea powder',50,90.00);
select * from product;

create table payment(Pay_id varchar(40),cust_id varchar(45),Pro_id varchar(45),Qty float,Purch_Date date);
insert into payment values('AX01','101','P01',3,'2021-01-11'),
('AX02','102','P02',10,'2021-01-15'),
('AX03','103','P03',2,'2021-02-01'),
('AX04','104','P04',5,'2021-02-10'),
('AX05','105','P05',15,'2021-03-15'),
('AX06','106','P06',4,'2021-03-29'),
('AX07','107','P07',1,'2021-04-05'),
('AX08','108','P08',12,'2021-04-19');
drop table payment;
select * from payment;
select * from employee;
select * from customer;
select * from product;

# find out the maximum salary from employees
select emp_name, max(sal) from employee;

# find out the minimum salary from employees
select emp_name,sal from employee where sal= 
(select min(sal) from employee);

#find the sum of salary of all the employees
select sum(sal) from employee;

#find total amount earned by grocery store
select (sum(qty)*sum(price)) as total from payment;

# find name of the person who purchase maximum qty
select cust_name, qty from payment where qty = (select max(qty) from payment);

# display the quantity and customer name who has purchased quantity between 2 and 10
select customer.cust_name, qty from customer, payment where qty between 2 and 10 and customer.cust_name=payment.cust_name; 

#display the product with lowest stock
SELECT  pro_name,Stock from product a WHERE 3 >= (SELECT count(Stock) from product b WHERE a.stock >= b.stock) order by a.stock desc;

-- ------------------------------------------------------------------------------------------------------------------------------------------------
#joins
-- -------------------------------------------------------------------------------------------------------------------------------------------------
#  Display customer name  their phone number,the product they purchase along with its quantity and display it alphbetically.
select customer.cust_name,ph_no,product.pro_name,qty from customer,product,payment 
where payment.pro_name = product.pro_name and customer.cust_name = payment.cust_name order by 1;

# write a query to display final bill including customer name, product name, quantity purchased,product price with total amount to be paid.
select customer.cust_name,product.pro_name,qty,payment.price,(payment.price*payment.qty) as Total from customer,product,payment 
where payment.pro_name=product.pro_name and customer.cust_name=payment.cust_name;
-- ---------------------------------------------------------------------------------------------------------------------------------------------------
#procedure
create table tempp
(
  qty int,
  dis float,
  statuss varchar(20)
);
select * from tempp;
delimiter //
create procedure discount1()
begin
     declare dis float;
     declare qty int;
     set qty=6;
     set dis=(qty * 5/100);
     if qty>4 then
        insert into tempp values(qty,dis,'discount sucessfull');
     else
        insert into tempp values(qty,dis,'discount unsucessfull');
        end if;
 end;//
 delimiter ;
 call discount1;
 select * from tempp;
 drop procedure discount1;
 

#procedure
delimiter //
create procedure discount()
begin
      declare dis float;
      declare qty int;
      set qty=15;
      set dis=((qty) * 5/100);
      insert into payment values(dis,qty);
 end;//
 delimiter ;
 call discount();
drop procedure discount;


        
      
