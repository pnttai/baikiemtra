package com.example.baitapkiemtra.admin.repository;

import com.example.baitapkiemtra.admin.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
