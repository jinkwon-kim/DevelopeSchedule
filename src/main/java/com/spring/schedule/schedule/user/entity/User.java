package com.spring.schedule.schedule.user.entity;

import com.spring.schedule.BaseEntity;
import jakarta.persistence.*;

@Entity
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;

    public User () { }

    public User (String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
    public void updateUserName(String userName) {
        this.userName = userName;
    }
    public void updateEmail(String email) {
        this.email = email;
    }
}
