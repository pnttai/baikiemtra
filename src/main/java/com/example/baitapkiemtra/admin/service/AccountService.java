//package com.example.baitapkiemtra.admin.service;
//
//import com.example.baitapkiemtra.admin.models.Account;
//import com.example.baitapkiemtra.admin.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AccountService implements UserDetailsService {
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    // Đổi tên trường này sang accountService2 hoặc một tên khác không trùng với lớp
//    @Autowired
//    private AccountService accountService2;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Account account = accountRepository.findByUsername(username);
//        if (account == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return org.springframework.security.core.userdetails.User.withUsername(account.getUsername())
//                .password(account.getPassword())
//                .authorities(account.getRole())
//                .build();
//    }
//}
