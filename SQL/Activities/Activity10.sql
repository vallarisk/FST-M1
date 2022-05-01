--activity 10

SELECT * FROM  orders WHERE salesman_id = (SELECT DISTINCT salesman_id FROM customers WHERE customer_id = 3007);

SELECT AVG(grade) avg_grade FROM customers WHERE city = 'New York'

SELECT grade, COUNT(DISTINCT customer_id) AS cust_count FROM customers GROUP BY grade HAVING grade > (SELECT AVG(grade) avg_grade FROM customers WHERE city = 'New York');

SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE commission = (SELECT MAX(commission) FROM salesman));