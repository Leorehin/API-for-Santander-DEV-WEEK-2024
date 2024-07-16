package com.dio.me.santander_dev_week_2023.domain.respository;

import com.dio.me.santander_dev_week_2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String accountNumber);
}
