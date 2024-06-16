package com.example.baitapkiemtra.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/logon")
    public String login() {
        return "logon";  // Trả về tên view của trang đăng nhập
    }
}
