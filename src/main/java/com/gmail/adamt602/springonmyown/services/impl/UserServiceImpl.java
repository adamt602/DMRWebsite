package com.gmail.adamt602.springonmyown.services.impl;


import com.gmail.adamt602.springonmyown.domain.UserEntity;
import com.gmail.adamt602.springonmyown.repositories.UserRepository;
import com.gmail.adamt602.springonmyown.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
