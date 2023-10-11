use furama_services;
select 
	dich_vu.ma_dich_vu,
	dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
from hop_dong
right join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
where  dich_vu.ma_dich_vu 
not in (select ma_dich_vu 
        from hop_dong 
        where (ngay_lam_hop_dong >= "2021/01/01" and ngay_lam_hop_dong <= "2021/03/31") group by ma_dich_vu
        )
group by dich_vu.ma_dich_vu;
