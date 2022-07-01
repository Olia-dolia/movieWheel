package com.moviewheel.artifact.service.interfaces;

import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.payload.dto.UserDto;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    User updateUser(Long userId, UserDto userDto);

    void deleteUser(Long id);

    User getUserByUsername(String username);
}
