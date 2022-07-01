package com.moviewheel.artifact.controller;


import com.moviewheel.artifact.payload.dto.UserDto;
import com.moviewheel.artifact.service.interfaces.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class UserController {


    private final AuthenticationService authenticationService;

    @GetMapping("/userpage")
    public String userPage(){
        return "userpage";
    }

    @PostMapping("/register")
    public String registerUser(@Valid UserDto userDto){
        authenticationService.registerUser(userDto);
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(UserDto userDto){
        authenticationService.login(userDto);
        return "redirect:/userpage";
    }
}
