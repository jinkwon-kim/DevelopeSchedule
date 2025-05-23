package com.spring.schedule.schedule.user.service;

import com.spring.schedule.schedule.user.dto.*;
import com.spring.schedule.schedule.user.entity.User;
import com.spring.schedule.schedule.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public FindUserResponseDto findUserById(Long userid) {
        User user = userRepository.findByIdOrElseThrow(userid);

        return new FindUserResponseDto(user);
    }
    @Override
    public List<FindUserResponseDto> findAllUsers() {
        List<FindUserResponseDto> responseDtoList = new ArrayList<>();
        List<User> userList = userRepository.findAll();
        for(User user : userList) {
            responseDtoList.add(new FindUserResponseDto(user));
        }
        return responseDtoList;
    }
    @Override
    public UpdateUserResponseDto updateUser(Long userid, UpdateUserRequestDto requestDto) {
        User user = userRepository.findByIdOrElseThrow(userid);
        if (requestDto.getUserName() != null) {
            user.updateUserName(requestDto.getUserName());
        }
        if (requestDto.getEmail() != null) {
            user.updateEmail(requestDto.getEmail());
        }

        return new UpdateUserResponseDto(user);
    }
    @Override
    public void deleteUser(Long userid) {
        User user = userRepository.findByIdOrElseThrow(userid);

        userRepository.delete(user);
    }
}
