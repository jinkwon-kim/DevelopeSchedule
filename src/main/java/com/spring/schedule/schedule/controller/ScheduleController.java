package com.spring.schedule.schedule.controller;

import com.spring.schedule.schedule.dto.*;
import com.spring.schedule.schedule.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController (ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping
    public ResponseEntity<CreateScheduleResponseDto> createSchedule (@RequestBody CreateScheduleRequestDto requestDto) {
        return new ResponseEntity<>(scheduleService.saveSchedule(requestDto), HttpStatus.CREATED);
    }
    @GetMapping("/{ScheduleId}")
    public ResponseEntity<FindScheduleResponseDto> findSchedule(@PathVariable Long ScheduleId){
        return new ResponseEntity<>(scheduleService.findSchedule(ScheduleId), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<FindScheduleResponseDto>> findAllSchedules() {
        List<FindScheduleResponseDto> responseDtoList = scheduleService.findAllSchedules();
        return new ResponseEntity<>(responseDtoList, HttpStatus.OK);
    }
    @PatchMapping("/{ScheduleId}")
    public ResponseEntity<UpdateScheduleResponseDto> updateSchedule(
            @PathVariable Long ScheduleId,
            @RequestBody UpdateScheduleRequestDto dto
            ){
        UpdateScheduleResponseDto updateScheduleResponseDto = scheduleService.updateSchedule(ScheduleId, dto);
        return new ResponseEntity<>(updateScheduleResponseDto, HttpStatus.OK);
    }
    @DeleteMapping("/{ScheduleId}")
    public ResponseEntity<Void> deleteSchedule(
            @PathVariable Long ScheduleId
    ) {
        scheduleService.deleteSchedule(ScheduleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
