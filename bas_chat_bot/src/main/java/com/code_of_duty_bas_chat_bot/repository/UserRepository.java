package com.code_of_duty_bas_chat_bot.repository;

import com.code_of_duty_bas_chat_bot.domain.User;
import com.code_of_duty_bas_chat_bot.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity save(UserEntity user);
    UserEntity findByEmail(String email);

    boolean existsByEmail(String email);
}
