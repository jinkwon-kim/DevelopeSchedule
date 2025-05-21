package com.spring.schedule.schedule.controller;

import com.spring.schedule.schedule.dto.CreateScheduleRequestDto;
import com.spring.schedule.schedule.dto.CreateScheduleResponseDto;
import com.spring.schedule.schedule.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController (ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ResponseEntity<CreateScheduleResponseDto> createSchedule (@RequestBody) {

    }
}
