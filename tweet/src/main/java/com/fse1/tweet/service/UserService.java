package com.fse1.tweet.service;

import org.springframework.stereotype.Service;

import com.fse1.tweet.dto.UserDto;

@Service
public interface UserService {

	String createUser(UserDto userDto);

}
