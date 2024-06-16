package com.example.baitapkiemtra.admin.controller;

import com.example.baitapkiemtra.admin.models.Users;
import com.example.baitapkiemtra.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String index(Model model, @RequestParam(name="pageNo", defaultValue = "1") Integer pageNo) {
        Page<Users> list = this.userService.getAll(pageNo);
        model.addAttribute("totalPage", list.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("users", list.getContent()); // Sử dụng tên thuộc tính là 'users'
        return "admin/user/index";
    }

    @GetMapping("/add-user")
    public String add(Model model) {
        Users users = new Users();
        model.addAttribute("users", users);
        return "admin/user/add";
    }

    @PostMapping("/add-user")
    public String save(@ModelAttribute("users") Users users) {
        if (this.userService.create(users)) {
            return "redirect:/admin/user";
        } else {
            return "admin/user/add";
        }
    }

    @GetMapping("/edit-user/{id}")
    public String edit(Model model, @PathVariable("id") String id) {
        Users users = this.userService.findById(id);
        model.addAttribute("users", users);
        return "admin/user/edit";
    }

    @PostMapping("/edit-user")
    public String update(@ModelAttribute("users") Users users) {
        if (this.userService.create(users)) {
            return "redirect:/admin/user";
        } else {
            return "admin/user/add";
        }
    }

    @GetMapping("/delete-user/{id}")
    public String delete(@PathVariable("id") String id) { // Sửa đường dẫn từ 'delete-category' thành 'delete-user'
        if (this.userService.delete(id)) {
            return "redirect:/admin/user";
        } else {
            return "redirect:/admin/user";
        }
    }
}
