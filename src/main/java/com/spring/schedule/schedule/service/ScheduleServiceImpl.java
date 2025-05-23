package com.spring.schedule.schedule.service;

import com.spring.schedule.schedule.dto.*;
import com.spring.schedule.schedule.entity.Schedule;
import com.spring.schedule.schedule.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    //일정 생성
    public CreateScheduleResponseDto saveSchedule(CreateScheduleRequestDto requestDto) {
        Schedule schedule = new Schedule(requestDto.getUserId(), requestDto.getTitle(), requestDto.getPassword());
        Schedule savedSchedule = scheduleRepository.save(schedule);
        return new CreateScheduleResponseDto(savedSchedule);
    }

    //일정 단일 조회
    public FindScheduleResponseDto findSchedule(Long id) {
        Schedule schedule = scheduleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
        return new FindScheduleResponseDto(schedule);
    }

    //일정 전체 조회
    public List<FindScheduleResponseDto> findAllSchedules() {
        List<FindScheduleResponseDto> responseDtoList = new ArrayList<>();
        List<Schedule> scheduleList = scheduleRepository.findAll();
        for(Schedule schedule : scheduleList) {
            responseDtoList.add(new FindScheduleResponseDto(schedule));
        }
        return responseDtoList;



    }

    //일정 수정
    @Override
    public UpdateScheduleResponseDto updateSchedule(Long Scheduleid, UpdateScheduleRequestDto requestDto) {
        Schedule schedule = scheduleRepository.findById(Scheduleid)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
        schedule.updateTitle(requestDto.getName());

        Schedule savedSchedule = scheduleRepository.save(schedule);

        return new UpdateScheduleResponseDto(savedSchedule);
    }

    //일정 삭제
    @Override
    public void deleteSchedule(Long Scheduleid) {
        Schedule schedule = scheduleRepository.findById(Scheduleid)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
        scheduleRepository.delete(schedule);
    }
}