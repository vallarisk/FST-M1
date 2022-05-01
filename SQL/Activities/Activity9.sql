--activity9
-- Create the customers table
create table customers (
    customer_id int primary key, 
	customer_name varchar(32),
    city varchar(20), 
	grade int, 
	salesman_id int);

INSERT ALL 
	INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
	INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
	INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
	INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
	INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
	INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
	INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
	INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

select c.customer_id, c.customer_name, s.salesman_name, s.salesman_city
from customers c
INNER JOIN salesman s
ON c.salesman_id = s.salesman_id;

select c.customer_name, c.city,  c.grade, s.salesman_name AS Salesman, s.salesman_city
from customers c
INNER JOIN salesman s
ON c.salesman_id = s.salesman_id
where c.grade <300 AND NOT s.salesman_id = 0;

select c.customer_name, c.city, s.salesman_name, s.commission
from customers c
INNER JOIN salesman s
ON c.salesman_id = s.salesman_id
where s.commission > 12;

Select o.ORDER_NO,	o.ORDER_DATE, o.PURCHASE_AMOUNT, c.customer_name,  s.salesman_name, s.commission
FROM orders o
INNER JOIN salesman s ON o.salesman_id = s.salesman_id
INNER JOIN customers c ON o.customer_id = c.customer_id;
where o.order_no = 70001;
