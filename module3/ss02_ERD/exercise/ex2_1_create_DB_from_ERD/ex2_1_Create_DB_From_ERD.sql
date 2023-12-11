create database Ex21;
use EX21;

create table Phieu_xuat(
id_phieu_xuat varchar(45),
date_xuat date,
primary key(id_phieu_xuat)
);

create table vat_tu(
id_vat_tu varchar(45),
name_vat_tu varchar(45),
primary key(id_vat_tu)
);

create table chi_tiet_phieu_xuat(
id_chi_tiet_phieu_xuat int auto_increment,
id_phieu_xuat varchar(45),
id_vat_tu varchar(45),
don_gia_xuat double,
so_luong_xuat int,
primary key(id_chi_tiet_phieu_xuat),
foreign key(id_phieu_xuat) references Phieu_xuat(id_phieu_xuat),
foreign key(id_vat_tu) references vat_tu(id_vat_tu)
);

create table phieu_nhap(
id_phieu_nhap varchar(45),
date_nhap date,
primary key(id_phieu_nhap)
);

create table chi_tiet_phieu_nhap(
id_chi_tiet_phieu_nhap int auto_increment,
id_phieu_nhap varchar(45),
id_vat_tu varchar(45),
don_gia_nhap double,
so_luong_nhap int,
primary key(id_chi_tiet_phieu_nhap),
foreign key(id_phieu_nhap) references phieu_nhap(id_phieu_nhap),
foreign key(id_vat_tu) references vat_tu(id_vat_tu)
);

create	table nha_cung_cap(
id_nha_cung_cap varchar(45),
name_nha_cung_cap varchar(45),
address_nha_cung_cap varchar(45),
primary key(id_nha_cung_cap)
);

create table so_dien_thoai_nha_cung_cap(
so_dien_thoai_nha_cung_cap varchar(45),
id_nha_cung_cap varchar(45),
primary key(so_dien_thoai_nha_cung_cap),
foreign key(id_nha_cung_cap) references nha_cung_cap(id_nha_cung_cap)
);

create table don_dat_hang(
	id_don_dat_hang varchar(45),
    id_nha_cung_cap varchar(45),
    date_dat_hang date,
    primary key(id_don_dat_hang),
    foreign key(id_nha_cung_cap) references nha_cung_cap(id_nha_cung_cap)
);


create table chi_tiet_don_dat_hang(
id_chi_tiet_don_dat_hang  int auto_increment,
id_vat_tu varchar(45),
id_don_dat_hang varchar(45),
primary key(id_chi_tiet_don_dat_hang),
foreign key(id_vat_tu) references vat_tu(id_vat_tu),
foreign key(id_don_dat_hang) references don_dat_hang(id_don_dat_hang)
);

