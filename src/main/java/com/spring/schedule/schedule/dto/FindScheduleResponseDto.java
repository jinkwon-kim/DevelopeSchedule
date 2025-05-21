package com.spring.schedule.schedule.dto;

import com.spring.schedule.schedule.entity.Schedule;

import java.util.Date;

public class FindScheduleResponseDto {
    private long id;
    private String userId;
    private String title;
    private Date created_at;
    private Date updated_at;

    public FindScheduleResponseDto (Schedule schedule) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public long getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }
}
