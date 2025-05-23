package com.spring.schedule.schedule.service;

import com.spring.schedule.schedule.dto.*;

import java.util.List;

public interface ScheduleService {

    CreateScheduleResponseDto saveSchedule (CreateScheduleRequestDto requestDto);
    FindScheduleResponseDto findSchedule (Long ScheduleId);
    List<FindScheduleResponseDto> findAllSchedules();
    UpdateScheduleResponseDto updateSchedule(Long Scheduleid, UpdateScheduleRequestDto requestDto);
    void deleteSchedule(Long Scheduelid);
}
