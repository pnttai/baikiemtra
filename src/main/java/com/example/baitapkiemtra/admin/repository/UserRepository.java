package com.example.baitapkiemtra.admin.repository;

import com.example.baitapkiemtra.admin.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
