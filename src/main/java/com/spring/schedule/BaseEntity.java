package com.spring.schedule;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

    @MappedSuperclass
    @EntityListeners(AuditingEntityListener.class)
 public abstract class BaseEntity {

        @CreatedDate
        @Column(updatable = false)
        private Date createdAt;

        @LastModifiedDate
        private Date updatedAt;
  }


