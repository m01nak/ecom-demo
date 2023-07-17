--------------------------------------------------------------
-- Creating table "inventory" in "main" schema the database --
--------------------------------------------------------------

create table main.inventory (
	product_id int not null,
	product_count int,
	check (product_count >= 0),
	primary key (product_id),
	foreign key (product_id) references products(product_id)
);