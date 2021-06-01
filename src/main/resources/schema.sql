create table currency_exchange(
id int not null,
currency_from varchar(20) not null,
currency_to varchar(20) not null,
conversion_multiple decimal(10,2) not null,
environment varchar(20)
);