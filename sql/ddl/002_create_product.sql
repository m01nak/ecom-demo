------------------------------------------------------------
-- Creating table "product" in "main" schema the database --
------------------------------------------------------------

create table main.product (
    product_id int not null auto_increment,
    product_name varchar(200) unique not null,
    product_mrp decimal(10,2) not null default 0,
    product_discount decimal(5,2) not null default 0,
    primary key(product_id)
);