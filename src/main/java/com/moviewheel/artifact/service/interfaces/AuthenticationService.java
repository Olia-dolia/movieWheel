package com.moviewheel.artifact.service.interfaces;

import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.payload.dto.UserDto;

public interface AuthenticationService {

    User registerUser(UserDto user);

    void login(UserDto userDto);

}
