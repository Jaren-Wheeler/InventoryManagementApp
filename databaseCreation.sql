


CREATE TABLE CUSTOMER (
    cust_id INT PRIMARY KEY,  -- Added primary key
    cust_name VARCHAR(255), 
    street VARCHAR(255), 
    building_num VARCHAR(50), 
    city VARCHAR(100), 
    province VARCHAR(100), 
    country VARCHAR(100)
);

CREATE TABLE INVOICE (
    invoices_id INT PRIMARY KEY,  -- Added primary key
    invoice_date DATE, 
    cust_id INT,
	FOREIGN KEY (cust_id) REFERENCES CUSTOMER(cust_id)
);

CREATE TABLE MATERIAL (
    mat_id INT PRIMARY KEY,  -- Added primary key
    mat_name VARCHAR(255), 
    sub_type VARCHAR(100), 
    diameter DECIMAL(10,2), 
    rack_num VARCHAR(50), 
    length DECIMAL(10,2)
);

CREATE TABLE PART (
    part_id INT PRIMARY KEY,  -- Added primary key
    part_name VARCHAR(255), 
    serial_num VARCHAR(255), 
    dimensions VARCHAR(100), 
    rack_num VARCHAR(50), 
    qty INT,
	mat_id INT,
	Foreign Key (mat_id) References MATERIAL(mat_id)
);

CREATE TABLE WORK_ORDER (
    work_order_id INT PRIMARY KEY,  -- Added primary key
    wo_type VARCHAR(50), 
    order_date DATE, 
    cust_id INT, 
    part_id INT,
	Foreign Key (part_id) References PART(part_id),
	Foreign Key (cust_id) References CUSTOMER(cust_id)
);

CREATE TABLE SALE (
    part_id INT,
    inv_id INT,
    qty INT,
    PRIMARY KEY (part_id, inv_id),  -- Composite Primary Key
    FOREIGN KEY (part_id) REFERENCES PART(part_id),
    FOREIGN KEY (inv_id) REFERENCES INVOICE(invoices_id)
);

CREATE TABLE PERSON (
    person_id INT PRIMARY KEY,  -- Added primary key
    username VARCHAR(100), 
    password_hash VARCHAR(255)  -- Store passwords securely as a hash
);
