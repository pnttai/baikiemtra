package com.example.baitapkiemtra.admin.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "password")
    private String password;
    @Column(name = "username",length = 50)
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "role")
    private String role;
    @Column(name = "fullName")
    private String fullName;
public Account(){}
    public Account(Long id, String password, String username, String email, String role, String fullName) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.email = email;
        this.role = role;
        this.fullName = fullName;
    }
}
