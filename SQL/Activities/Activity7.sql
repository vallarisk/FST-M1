--activity 7

SELECT SUM(purchase_amount) AS "Total Sum" FROM orders;

SELECT AVG(purchase_amount) AS "Avg Purchase Amount" FROM orders;

SELECT MAX(purchase_amount) AS "Max Purchase Amount" FROM orders;

SELECT MIN(purchase_amount) AS "Min Purchase Amount" FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS "Total Salesman headcount" FROM orders;