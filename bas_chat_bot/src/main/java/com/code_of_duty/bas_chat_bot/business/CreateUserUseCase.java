package com.code_of_duty.bas_chat_bot.business;

import com.code_of_duty.bas_chat_bot.domain.CreateUserRequest;
import com.code_of_duty.bas_chat_bot.domain.CreateUserResponse;
import com.code_of_duty.bas_chat_bot.repository.entity.UserEntity;

public interface CreateUserUseCase {
    CreateUserResponse createUser(CreateUserRequest request);
}