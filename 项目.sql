create table Customer
(
	Cu_ID varchar(20) primary key,
	customer_Name varchar(20),
	customer_Psd varchar(20),
	customer_sex varchar(10),
	Brithday datetime,
	tel varchar(50),
	Comments varchar(100)	
);


create table Order
	(
		order_ID varchar(20) primary key ,
		Car_ID varchar(20),
		cu_ID varchar(20) ,
		post_Pname varchar(20),
		post_PTel varchar(20),
		post_Paddr varchar(50),
		get_Pname varchar(20),
		get_Ptel varchar(20),
		get_Addr varchar(50),
		goods_Name varchar(100),
		goods_Weight int,
		order_Type varchar(10),
		order_State varchar(20),
		order_PortPrice decimal(20),
		transpor_Price decimal(20),
		delivery_Price decimal(20),
		total_price varchar(20),
		Comments varchar(100)
	);
	
	alter table order1 add primary key(order_ID);
	alter table order1 add foreign key(Cu_ID) references Customer(Cu_ID);
	
	


create table car
(
	car_ID varchar(20) primary key,
	ropute_ID varchar(20),
	car_Type varchar(20),
	car_Orgin varchar(50),
	car_ProDate datetime,
	car_BuyDate datetime,
	car_capaCity int,
	car_State bit,
	Comments varchar(100) 
)

alter table car add foreign key(ropute_ID) references Route(route_ID);

create table route
(
	route_ID varchar(20) primary key,
	city_ID varchar(20),
	province_ID varchar(20),
	route_Name varchar(20),
	sart_province varchar(20),
	start_City varchar(20),
	end_province varchar(20),
	end_city varchar(20),
	mid_province varchar(20),
	mid_City varchar(20),
	transpor_price varchar(20),
	Comments varchar(100)
)
alter table route add foreign key(province_ID) references Privance(province_ID);
alter table route add foreign key(city_ID) references City(city_ID);

create table privance
(
	province_ID varchar(20) primary key,
	province_Name varchar(20)
)

create table City
(
	city_ID varchar(20) primary key,
	province_ID varchar(20),
	city_Name varchar(20),
	province_Name varchar(20)
)

alter table City add foreign key(province_ID) references privance(province_ID);


create table Association_1
(
	Ordorder_id varchar(20) primary key,
	DeldeliveryReceipt_ID varchar(20),
	order_ID varchar(20),
	deliveryReceipt_id varchar(20)
)

alter table Association_1 add foreign key(Ordorder_id) references order1(order_ID);
alter table Association_1 add foreign key(DeldeliveryReceipt_ID) references delivery_Receipt(deliveryReceipt_ID);


create table delivery_Receipt
(
	deliveryReceipt_ID varchar(20) primary key,
	start_city varchar(20),
	end_City varchar(20),
	mid_City varchar(20),
	make_Date datetime,
	Comments varchar(100)
)


create table Manager
(
	mql_ID varchar(20) primary key,
	role_ID varchar(20),
	manager_Name varchar(20),
	manager_Psd varchar(20),
	manager_Sex char(10),
	Tel varchar(20),
	Address varchar(50),
	Comments varchar(100)
)

alter table Manager add foreign key(role_ID) references Role(role_ID);



create table Delivery_Place
(
	dep_ID varchar(20) primary key,
	mg_ID varchar(20),
	dep_Name varchar(20),
	province_Name varchar(20),
	city_Name varchar(20),
	mg_Name varchar(20),
	dep_Tel varchar(20),
	dep_Addr varchar(100),
	Comments varchar(100)
	
)

alter table Delivery_Place add foreign key(mg_ID) references Manager(mql_ID);


create table Role
(
	role_ID varchar(20) primary key,
	role_Name varchar(20),
	Comments varchar(100)
)

create table Delevery_Range
(
	ranqel_ID varchar(20) primary key,
	dep_ID varchar(20),
	area_ID varchar(20),
	ranqel_Name varchar(20),
	delivery_price varchar(20),
	Comments varchar(100)
)


alter table Delevery_Range add foreign key(dep_ID) references Delivery_Place(dep_ID);
alter table Delevery_Range add foreign key(ranqel_ID) references City_Area(range_ID);


create table City_Area
(
	area_ID varchar(20) primary key,
	city_ID varchar(20),
	range_ID varchar(20),
	area_Name varchar(20),
	City_Name varchar(100)
)


alter table City_Area add foreign key(area_ID) references Delevery_Range(area_ID);
alter table City_Area add foreign key(city_ID) references City(City_ID);





