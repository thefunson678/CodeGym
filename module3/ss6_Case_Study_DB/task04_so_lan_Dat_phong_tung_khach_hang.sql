use furama_services;
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(ma_hop_dong) as "Số lần đặt phòng"
from hop_dong 
join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
where loai_khach.ten_loai_khach = "Diamond"
group by hop_dong.ma_khach_hang
order by count(ma_hop_dong) ASC