package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.mapper.UserMapper;
import com.moviewheel.artifact.payload.dto.UserDto;
import com.moviewheel.artifact.repository.UserRepository;
import com.moviewheel.artifact.service.interfaces.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found by id - " + id));
    }

    @Override
    public User updateUser(Long userId, UserDto userDto) {
        User userFromDb = getUserById(userId);
        userMapper.updateUser(userFromDb, userDto);
        return userRepository.save(userFromDb);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findUserByUsername(username).orElseThrow(() -> new RuntimeException("User not found by username - " + username));
    }
}
