-------------------------------------------------------------------
-- Creating table "order_statuses" in "main" schema the database --
-------------------------------------------------------------------

create table main.order_status (
	order_status varchar(20) not null primary key,
	description varchar(200)
);