//package com.example.baitapkiemtra;
//
//import com.example.baitapkiemtra.admin.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    private AccountService accountService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests((auth) -> auth
//                        .requestMatchers("/admin/**").hasAuthority("ADMIN")
//                        .requestMatchers("/admin/add-user").hasAuthority("ADMIN")
//                        .requestMatchers("/admin/edit-user/**").hasAuthority("ADMIN")
//                        .requestMatchers("/admin/delete-user/**").hasAuthority("ADMIN")
//                        .requestMatchers("/*").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin(login -> login
//                        .loginPage("/logon")
//                        .loginProcessingUrl("/logon")
//                        .usernameParameter("username")
//                        .passwordParameter("password")
//                        .defaultSuccessUrl("/admin", true)
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/admin-logout")
//                        .logoutSuccessUrl("/logon")
//                );
//        return http.build();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(accountService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return web -> web.ignoring()
//                .requestMatchers("/static/**", "/user/**", "/admin/**");
//    }
//}
