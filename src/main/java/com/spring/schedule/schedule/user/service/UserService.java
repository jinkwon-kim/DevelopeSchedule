package com.spring.schedule.schedule.user.service;

import com.spring.schedule.schedule.user.dto.*;

public interface UserService {
    CreateUserResposeDto saveUser(CreateUserRequestDto requestDto);
    FindUserResponseDto findUserById(Long id);
    UpdateUserResponseDto updateUser(Long id, UpdateUserRequestDto requestDto);
}

