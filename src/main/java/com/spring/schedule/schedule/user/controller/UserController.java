package com.spring.schedule.schedule.user.controller;
import java.util.List;
import com.spring.schedule.schedule.user.dto.*;
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

    @GetMapping("/userId")
    public ResponseEntity<FindUserResponseDto> findUser(@PathVariable Long userid) {
        FindUserResponseDto userResponseDto = userService.findUserById(userid);

        return new ResponseEntity<>(userResponseDto, HttpStatus.OK);


    }
    @GetMapping
    public ResponseEntity<List<FindUserResponseDto>> findAllUsers() {
        List<FindUserResponseDto> responseDtoList = userService.findAllUsers();
        return new ResponseEntity<>(responseDtoList, HttpStatus.OK);
    }
    @PatchMapping("/{userId}")
    public ResponseEntity<UpdateUserResponseDto> updateUser(
            @PathVariable Long userid,
            @RequestBody UpdateUserRequestDto requestDto
    )        {
        UpdateUserResponseDto updateUserResponseDto = userService.updateUser(userid, requestDto);

        return new ResponseEntity<>(updateUserResponseDto,HttpStatus.OK);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userid) {
        userService.deleteUser(userid);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
