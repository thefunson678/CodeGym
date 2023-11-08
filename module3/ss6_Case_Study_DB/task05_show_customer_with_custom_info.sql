use furama_services;
select distinct  khach_hang.ho_ten, 
		loai_khach.ten_loai_khach,
		hop_dong.ma_hop_dong,
        dich_vu.ten_dich_vu,
        hop_dong.ngay_lam_hop_dong,
        hop_dong.ngay_ket_thuc,
        dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia as "tổng tiền"
from loai_khach
right join khach_hang on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
left join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
left join dich_vu_di_kem on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem;

select   khach_hang.ma_khach_hang,
		khach_hang.ho_ten, 
		loai_khach.ten_loai_khach,
        hop_dong.ma_hop_dong,
        dich_vu.ten_dich_vu,
        hop_dong.ngay_lam_hop_dong,
        hop_dong.ngay_ket_thuc,
      --  dich_vu.chi_phi_thue,
      --  hop_dong_chi_tiet.ma_dich_vu_di_kem,
      -- hop_dong_chi_tiet.so_luong,
      --  dich_vu_di_kem.ten_dich_vu_di_kem,
       -- dich_vu_di_kem.gia,
       -- dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong as "Tiền thêm" ,
	   (dich_vu.chi_phi_thue + ifnull(sum(dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong),0)) as "Tổng tiền"
from loai_khach
join khach_hang on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
left join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
left join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by  khach_hang.ma_khach_hang, hop_dong.ma_hop_dong;