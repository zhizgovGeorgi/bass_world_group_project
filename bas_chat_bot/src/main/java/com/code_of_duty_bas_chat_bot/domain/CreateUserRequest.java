package com.code_of_duty_bas_chat_bot.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String CompanyName;
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}