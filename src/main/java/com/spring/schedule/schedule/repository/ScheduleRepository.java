package com.spring.schedule.schedule.repository;

import com.spring.schedule.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    }

