package com.spring.schedule.schedule.dto;

public class UpdateScheduleRequestDto {
    private long id;
    private String password;
    private String name;

    public UpdateScheduleRequestDto() {

    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
