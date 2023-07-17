----------------------------------------------------------
-- Creating table "users" in "main" schema the database --
----------------------------------------------------------

create table users (
	user_id int not null primary key auto_increment,
    user_email varchar(320) not null,
    user_phone varchar(10),
    user_first_name varchar(20) not null,
    user_last_name varchar(20),
    user_password varchar(100) not null
);