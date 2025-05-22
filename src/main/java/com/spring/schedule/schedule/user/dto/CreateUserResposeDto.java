package com.spring.schedule.schedule.user.dto;

import com.spring.schedule.schedule.user.entity.User;

import java.util.Date;

public class CreateUserResposeDto {
    private  Long id;
    private  String userName;
    private  String email;
    private  Date createdAt;
    private  Date updatedAt;

    public CreateUserResposeDto(User user) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
