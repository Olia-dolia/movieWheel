package com.moviewheel.artifact.service;

import com.moviewheel.artifact.entity.User;
import com.moviewheel.artifact.mapper.UserMapper;
import com.moviewheel.artifact.payload.dto.UserDto;
import com.moviewheel.artifact.service.interfaces.*;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserService userService;
    private final RoleService roleService;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    @Override
    public User registerUser(UserDto userDto) {
        User user = userMapper.fromDto(userDto);
        user.setUserPassword(passwordEncoder.encode(userDto.getUserPassword()));
        user.setRole(roleService.getRoleByName("customer"));
        return userService.createUser(user);
    }

    @Override
    public void login(UserDto userDto) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userDto.getUsername(),
                userDto.getUserPassword()
        ));
        SecurityContextHolder.getContext().setAuthentication(authenticate);

    }
}
