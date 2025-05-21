package com.spring.schedule.schedule.service;

import com.spring.schedule.schedule.dto.*;

import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {

    CreateScheduleResponseDto saveSchedule (CreateScheduleRequestDto requestDto);
    FindScheduleResponseDto findSchedule (Long ScheduleId);
    List<FindScheduleResponseDto> findScheduleList(LocalDate updatedDate, Long userId);
    UpdateScheduleResponseDto updateSchedule(Long id, UpdateScheduleRequestDto requestDto);
    void deleteSchedule(Long id, DeleteScheduleRequestDto requestDto);
}
