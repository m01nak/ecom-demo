--------------------------------------------------------------------
-- Creating table "itemised_orders" in "main" schema the database --
--------------------------------------------------------------------

create table main.itemised_order (
	order_id int not null auto_increment,
    product_id int not null,
    product_count int not null,
    primary key (order_id,product_id),
    foreign key(order_id) references orders(order_id),
    foreign key(product_id) references products(product_id)
);