-----------------------------------------------------------
-- Creating table "orders" in "main" schema the database --
-----------------------------------------------------------

create table orders (
	order_id int not null auto_increment,
    user_id int not null,
    order_created_dtm timestamp not null default now(),
    order_closed_dtm timestamp,
    order_status varchar(20) not null default 'new',
    order_product_id int not null,
    order_product_count int not null,
    primary key(order_id),
    foreign key(user_id) references users(user_id),
    foreign key(order_status) references order_statuses(order_status),
    foreign key(order_product_id) references products(product_id)
);