package com.example.baitapkiemtra.admin.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "phongBan")
public class PhongBan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "ten_phong", length = 50)
    private String tenPhong;

    @OneToMany(mappedBy = "phongBan")
    private Set<Users> users;

    public PhongBan() {}

    public PhongBan(String id, String tenPhong, Set<Users> users) {
        this.id = id;
        this.tenPhong = tenPhong;
        this.users = users;
    }
}
