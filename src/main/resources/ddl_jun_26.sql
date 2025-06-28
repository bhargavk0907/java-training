-- Create 'customers' table
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(50)
);

-- Create 'orders' table
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product VARCHAR(100),
    order_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);


CREATE TABLE customers_PRIME(
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    city VARCHAR(50)
);



-- Insert data into 'customers'
INSERT INTO customers (customer_id, name, email, city) VALUES
(1, 'Alice Johnson', 'alice@example.com', 'New York'),
(2, 'Bob Smith', 'bob@example.com', 'Chicago'),
(3, 'Charlie Lee', 'charlie@example.com', 'Los Angeles'),
(2000,'ce Johnson', 'alice@example.com', 'New York');

-- Insert data into 'customers'
INSERT INTO customers_PRIME (customer_id, name, email, city) VALUES
(1, 'Alice Johnson', 'alice@example.com', 'New York'),
(2, 'Bob Smith', 'bob@example.com', 'Chicago'),
(3, 'Charlie Lee', 'charlie@example.com', 'Los Angeles'),
(8, 'tEST SHARK', 'charlie@example.com', 'Columbus');


-- Insert data into 'orders'
INSERT INTO orders (order_id, customer_id, product, order_date) VALUES
(101, 1, 'Laptop', '2024-06-01'),
(102, 2, 'Smartphone', '2024-06-05'),
(103, 1, 'Wireless Mouse', '2024-06-10'),
(104, 3, 'Headphones', '2024-06-12');