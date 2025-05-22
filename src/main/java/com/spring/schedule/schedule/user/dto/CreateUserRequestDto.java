package com.spring.schedule.schedule.user.dto;

import com.spring.schedule.schedule.user.entity.User;

public class CreateUserRequestDto {
    private String userName;
    private String email;

    public CreateUserRequestDto (User user) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
