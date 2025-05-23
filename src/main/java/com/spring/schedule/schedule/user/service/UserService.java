package com.spring.schedule.schedule.user.service;

import com.spring.schedule.schedule.user.dto.*;

import java.util.List;

public interface UserService {
    CreateUserResposeDto saveUser(CreateUserRequestDto requestDto);
    FindUserResponseDto findUserById(Long userid);
    List<FindUserResponseDto> findAllUsers();
    UpdateUserResponseDto updateUser(Long userid, UpdateUserRequestDto requestDto);
    void deleteUser (Long userid);
}

