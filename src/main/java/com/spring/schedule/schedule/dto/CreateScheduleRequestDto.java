package com.spring.schedule.schedule.dto;


public class CreateScheduleRequestDto {

    private long userId;
    private String title;
    private String password;

    public CreateScheduleRequestDto() {

    }

    public long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getPassword() {
        return password;
    }
}

