--------------------------------------------------------------------
-- Creating table "itemised_orders" in "main" schema the database --
--------------------------------------------------------------------

create table main.itemised_order (
	itemised_order_id int not null primary key auto_increment,
	order_id int not null,
    product_id int not null,
    product_count int not null,
    foreign key(order_id) references orders(order_id),
    foreign key(product_id) references products(product_id)
);