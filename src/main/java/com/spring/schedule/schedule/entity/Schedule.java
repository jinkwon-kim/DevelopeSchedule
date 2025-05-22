package com.spring.schedule.schedule.entity;

import com.spring.schedule.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schedule extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private long userId;

private String title;

private String password;

public Schedule () {}

    public Schedule (long userId, String title, String password) {
        this.userId = userId;
        this.title = title;
        this.password = password;
    }
    public void updateTitle(String title) {
        this.title = title;
    }

}



