----------------------------------------------------------
-- Creating table "order" in "main" schema the database --
----------------------------------------------------------
create table main.order (
	order_id int not null auto_increment,
	user_id int not null,
	order_created_dtm timestamp not null default now(),
	order_closed_dtm timestamp,
	order_status varchar(20) not null default 'new',
	primary key(order_id),
	foreign key(user_id) references user(user_id),
	foreign key(order_status) references order_status(order_status)
);