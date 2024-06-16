package com.example.baitapkiemtra.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "sex")
    private String sex;
    @Column(name = "maNhanVien")
    private String maNhanVien;
    @Column(name = "noi_sinh")
    private String noiSinh;

    @Column(name = "ma_phong")
    private String maPhong;

    @Column(name = "luong")
    private Integer luong;

    @ManyToOne
    @JoinColumn(name = "phong_ban_id", referencedColumnName = "id")
    private PhongBan phongBan;

    public Users() {}

    public Users(String id, String username, String sex, String noiSinh, String maPhong, Integer luong, PhongBan phongBan,  String maNhanVien ) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.noiSinh = noiSinh;
        this.maPhong = maPhong;
        this.luong = luong;
        this.phongBan = phongBan;
        this.maNhanVien=maNhanVien;
    }
}
