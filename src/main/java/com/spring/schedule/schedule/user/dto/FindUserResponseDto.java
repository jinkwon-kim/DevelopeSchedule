package com.spring.schedule.schedule.user.dto;

import com.spring.schedule.schedule.user.entity.User;

public class FindUserResponseDto {
    private  Long id;
    private  String userName;
    private  String email;

    public FindUserResponseDto(User user) {
        this.id = id;
        this.userName= userName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
