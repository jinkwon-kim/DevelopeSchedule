package com.spring.schedule.schedule.user.dto;

public class UpdateUserRequestDto {
    private  String userName;
    private  String email;

    public UpdateUserRequestDto(String userName, String email) {
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
