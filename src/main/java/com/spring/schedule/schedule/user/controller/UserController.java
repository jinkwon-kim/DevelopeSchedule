package com.spring.schedule.schedule.user.controller;

import com.spring.schedule.schedule.user.dto.CreateUserRequestDto;
import com.spring.schedule.schedule.user.dto.CreateUserResposeDto;
import com.spring.schedule.schedule.user.dto.FindUserResponseDto;
import com.spring.schedule.schedule.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<CreateUserResposeDto> createUser(@RequestBody CreateUserRequestDto requestDto){
        CreateUserResposeDto createUserResposeDto = userService.saveUser(requestDto);
        return new ResponseEntity<>(createUserResposeDto, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<FindUserResponseDto> findUser(@PathVariable Long id) {
        FindUserResponseDto userResponseDto = userService.findUserById(id);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);

    @PatchMapping("/{UserId}")
    public ResponseEntity<UpdateUserResponseDto> updateUser(
            @PathVariable Long id,
            @RequestBody UpdateUserRequestDto requestDto
                )        {
        UpdateUserResponseDto updateUserResponseDto = userService.updateUser(id, requestDto);

        return new ResponseEntity<>(updateUserResponseDto,HttpStatus.OK);
        }
    }
}
