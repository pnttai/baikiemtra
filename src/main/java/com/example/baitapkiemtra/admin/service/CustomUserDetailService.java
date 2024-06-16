//package com.example.baitapkiemtra.admin.service;
//
//import com.example.baitapkiemtra.admin.models.Account;
//import com.example.baitapkiemtra.admin.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Account account = accountRepository.findByUsername(username);
//        if (account == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return User.withUsername(account.getUsername())
//                .password(account.getPassword())
//                .authorities(account.getRole())
//                .build();
//    }
//}
