use furama_services;
select * from nhan_vien 
having( (ho_ten like "H%" or ho_ten like "T%" or ho_ten like "K%") and char_length(ho_ten) <= 15);
