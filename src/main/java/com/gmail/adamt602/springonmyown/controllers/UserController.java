package com.gmail.adamt602.springonmyown.controllers;

import com.gmail.adamt602.springonmyown.domain.UserEntity;
import com.gmail.adamt602.springonmyown.domain.dto.UserDto;
import com.gmail.adamt602.springonmyown.mappers.Mapper;
import com.gmail.adamt602.springonmyown.services.UserService;
import com.gmail.adamt602.springonmyown.services.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //This object hosts all the methods for CRUDing to the database
    private UserService userService;

    //This object hosts all the methods for converting to and from user entities to user DTO's
    private Mapper<UserEntity, UserDto> userMapper;

    public UserController(UserService userService, Mapper<UserEntity, UserDto> userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping(path = "/users")
    public UserDto createUser(@RequestBody UserDto user) {
        UserEntity userEntity = userMapper.mapFrom(user);
        UserEntity savedUserEntity = userService.createUser(userEntity);
        return userMapper.mapTo(savedUserEntity);
    }



}
