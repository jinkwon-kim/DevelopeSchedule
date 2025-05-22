package com.spring.schedule.schedule.user.service;

import com.spring.schedule.schedule.user.dto.*;
import com.spring.schedule.schedule.user.entity.User;
import com.spring.schedule.schedule.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository= userRepository;
    }

    public CreateUserResposeDto saveUser(CreateUserRequestDto requestDto) {

        User user = new User(requestDto.getUserName(), requestDto.getEmail());
        User saveUser = userRepository.save(user);

        return new CreateUserResposeDto(saveUser);
    }
    @Override
    public FindUserResponseDto findUserById(Long id) {
        User user = userRepository.findByIdOrElseThrow(id);

        return new FindUserResponseDto(user);
    }
    @Override
    public UpdateUserResponseDto updateUser(Long id, UpdateUserRequestDto requestDto) {
        User user = userRepository.findByIdOrElseThrow(id);
        if (requestDto.getUserName() != null) {
            user.updateUserName(requestDto.getUserName());
        }
        if (requestDto.getEmail() != null) {
            user.updateEmail(requestDto.getEmail());
        }

        return new UpdateUserResponseDto(user);
    }
}
