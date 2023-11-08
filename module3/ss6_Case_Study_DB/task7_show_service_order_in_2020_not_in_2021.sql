use furama_services;

 delimiter //
create function count_service_in_2021(ma_dich_vu_in2021 int) returns int
reads sql data
deterministic
begin
declare counts int;
set counts = (select count(ma_dich_vu)
from hop_dong where (year(ngay_lam_hop_dong) = 2021 and ma_dich_vu_in2021 = ma_dich_vu));
return counts;
end //
delimiter ;
select 
	dich_vu.ma_dich_vu,
	dich_vu.ten_dich_vu,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
from dich_vu
left join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
where (year(hop_dong.ngay_lam_hop_dong) = 2020 and count_service_in_2021(dich_vu.ma_dich_vu)=0)
group by dich_vu.ma_dich_vu;
