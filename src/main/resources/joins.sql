SELECT c.name
FROM customers c
INNER JOIN customers_PRIME O ON c.customer_id = o.customer_id;


SELECT c.name
FROM customers c
LEFT JOIN  customers_PRIME O ON c.customer_id = o.customer_id;

SELECT  O.NAME , O.CUSTOMER_ID
FROM customers c
RIGHT JOIN customers_PRIME O ON c.customer_id = o.customer_id;