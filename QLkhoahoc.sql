-- drop  database QLKhoahoc; 

create database QLKhoahoc;
 use   QLKhoahoc;
create table bophan(
  mabophan nvarchar(20) primary key,
  tenbophan nvarchar(100)
  );
  
create table nhanvien(
manhanvien  nvarchar(20) primary key,
tennhanvien  nvarchar(100),
chuyenmon  nvarchar(100),
chucvu nvarchar(100),
mabophan nvarchar(20),
foreign key (mabophan) references bophan(mabophan)
);



create table giangvienngoai(
magiangvienngoai  nvarchar(20) primary key,
tengiangvien nvarchar(100),
luong   float 
);

 
  
create table loaikhoahoc(
maloaikhoahoc  nvarchar(20) primary key,
tenloakhoahoc nvarchar(100)
);

create table hinhthucnoibo(
mahinhthucnoibo  nvarchar(20) primary key,
tenloakhoahoc nvarchar(100),
maloaikhoahoc  nvarchar(20) ,
foreign key (maloaikhoahoc) references loaikhoahoc(maloaikhoahoc),
magiangvienngoai  nvarchar(20) ,
foreign key (magiangvienngoai) references giangvienngoai(magiangvienngoai),
manhanvienobophanquanly  nvarchar(20) ,
foreign key (manhanvienobophanquanly) references nhanvien(manhanvien)
);



create table hinhthuctaicoso(
macoso  nvarchar(20) primary key,
diachicoso nvarchar(100),
tencoso nvarchar(100),
maloaikhoahoc  nvarchar(20) ,
foreign key (maloaikhoahoc) references loaikhoahoc(maloaikhoahoc),
chiphi float,
magiangvienngoai  nvarchar(20),
foreign key (magiangvienngoai) references giangvienngoai(magiangvienngoai),
manhanvienobophanquanly  nvarchar(20) ,
foreign key (manhanvienobophanquanly) references nhanvien(manhanvien)
);


create table trongcongty_lkcoso(
macosolienketcongty nvarchar(20) primary key,
diachicoso nvarchar(100),
tencoso nvarchar(100),
maloaikhoahoc  nvarchar(20) ,
foreign key (maloaikhoahoc) references loaikhoahoc(maloaikhoahoc),
chiphi float,
magiangvienngoai  nvarchar(20),
foreign key (magiangvienngoai) references giangvienngoai(magiangvienngoai),
manhanvienobophanquanly  nvarchar(20) ,
foreign key (manhanvienobophanquanly) references nhanvien(manhanvien)
);


create table khoahoc(
makhoahoc  nvarchar(20) primary key,
tenkhoahoc nvarchar(100),
thoidiembatdau date ,
thodiemketthuc date ,
chiphi float ,
manhanvienquanly  nvarchar(20),
foreign key (manhanvienquanly) references nhanvien(manhanvien),
maloaikhoahoc  nvarchar(20) ,
foreign key (maloaikhoahoc) references loaikhoahoc(maloaikhoahoc)
);

create table khoahoc_nhanvien(
makhoahoc  nvarchar(20),
manhanvien  nvarchar(20),
primary key  (makhoahoc , manhanvien),
foreign key (makhoahoc) references khoahoc(makhoahoc),
foreign key (manhanvien) references nhanvien(manhanvien)
);



