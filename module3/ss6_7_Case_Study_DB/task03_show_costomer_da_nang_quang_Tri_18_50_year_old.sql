use furama_services;
select * from khach_hang
having (timestampdiff(year,ngay_sinh,now())>=18 and timestampdiff(year,ngay_sinh,now())<=50)
and (dia_chi like "%Đà Nẵng" or dia_chi like "%Quảng Trị") ;
