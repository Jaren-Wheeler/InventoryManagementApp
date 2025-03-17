create table SALES(Qty);

create table INVOICES(Date,Cust_ID);

create table CUSTOMERS(Cust_Name, Street, Building, City, Province, Country);

create table PARTS(Part_Name, Serial_Num, Demensions, Rack_Num, Qty);

create table WORK_ORDERS(Wo_Type, Date, Cust_ID, P_ID);

create table MATERIALS(Mat_Name, Sub_Type, Diameter, Rack_Num, Lenght);

create table USERS(Name, Password);




CREATE TABLE SALE (
    part_id INT,
    inv_id INT,
    qty INT,
    PRIMARY KEY (part_id, inv_id),  -- Composite Primary Key
    FOREIGN KEY (part_id) REFERENCES PART(parts_id),
    FOREIGN KEY (inv_id) REFERENCES INVOICE(invoices_id)
);

CREATE TABLE INVOICE (
    invoices_id INT PRIMARY KEY,  -- Added primary key
    invoice_date DATE, 
    cust_id INT,
	FOREIGN KEY (cust_id) REFERENCES CUSTOMER(cust_id)
);

CREATE TABLE CUSTOMER (
    cust_id INT PRIMARY KEY,  -- Added primary key
    cust_name VARCHAR(255), 
    street VARCHAR(255), 
    building_num VARCHAR(50), 
    city VARCHAR(100), 
    province VARCHAR(100), 
    country VARCHAR(100)
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
    work_orders_id INT PRIMARY KEY,  -- Added primary key
    wo_type VARCHAR(50), 
    order_date DATE, 
    cust_id INT, 
    part_id INT,
	Foreign Key (part_id) References PART(part_id),
	Foreign Key (cust_id) References CUSTOMER(cust_id)
);

CREATE TABLE MATERIAL (
    mat_id INT PRIMARY KEY,  -- Added primary key
    mat_name VARCHAR(255), 
    sub_type VARCHAR(100), 
    diameter DECIMAL(10,2), 
    rack_num VARCHAR(50), 
    length DECIMAL(10,2)
);

CREATE TABLE USER (
    users_id INT PRIMARY KEY,  -- Added primary key
    username VARCHAR(100), 
    password_hash VARCHAR(255)  -- Store passwords securely as a hash
);
