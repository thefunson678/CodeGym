package com.example.ex8_1_register_form.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;


import java.time.LocalDate;

@Entity(name = "QADB")
public class QA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QAcode", columnDefinition = "INT")
    private Integer QAcode;
    @NotEmpty(message = "Tiêu đề không được để trống")
    @Column(name = "tieu_de", columnDefinition = "VARCHAR(100)")
    private String tieuDe;

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public QA(Integer QAcode, String tieuDe, String noidung, LocalDate ngayDang, Boolean daPhanHoi, LoaiCauHoi loaiCauHoi) {
        this.QAcode = QAcode;
        this.tieuDe = tieuDe;
        this.noidung = noidung;
        this.ngayDang = ngayDang;
        this.daPhanHoi = daPhanHoi;
        this.loaiCauHoi = loaiCauHoi;
    }

    @Column(name = "noi_dung", columnDefinition = "VARCHAR(500)")
    @NotEmpty(message = "Nội dung không được để trống")
    private String noidung;
    @Column(name = "ngay_dang")
    private LocalDate ngayDang;

    @Column(name = "da_phan_hoi")
    private Boolean daPhanHoi;
    @ManyToOne
    @JoinColumn(name = "loai_code")
    private LoaiCauHoi loaiCauHoi;

    public QA() {
    }

    public QA(Integer QAcode, String tieuDe, LocalDate ngayDang, Boolean daPhanHoi, LoaiCauHoi loaiCauHoi) {
        this.QAcode = QAcode;
        this.tieuDe = tieuDe;
        this.ngayDang = ngayDang;
        this.daPhanHoi = daPhanHoi;
        this.loaiCauHoi = loaiCauHoi;
    }

    public Integer getQAcode() {
        return QAcode;
    }

    public void setQAcode(Integer QAcode) {
        this.QAcode = QAcode;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getNgayDang() {
        return ngayDang;
    }

    public void setNgayDang(LocalDate ngayDang) {
        this.ngayDang = ngayDang;
    }

    public Boolean getDaPhanHoi() {
        return daPhanHoi;
    }

    public void setDaPhanHoi(Boolean daPhanHoi) {
        this.daPhanHoi = daPhanHoi;
    }

    public LoaiCauHoi getLoaiCauHoi() {
        return loaiCauHoi;
    }

    public void setLoaiCauHoi(LoaiCauHoi loaiCauHoi) {
        this.loaiCauHoi = loaiCauHoi;
    }
}
