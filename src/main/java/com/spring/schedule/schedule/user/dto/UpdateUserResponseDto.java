package com.spring.schedule.schedule.user.dto;

import com.spring.schedule.schedule.user.entity.User;

public class UpdateUserResponseDto {
    private  Long id;
    private  String name;
    private  String email;

    public UpdateUserResponseDto (User user) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
