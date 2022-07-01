package com.moviewheel.artifact.controller;

import com.moviewheel.artifact.payload.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("user", new UserDto());
        return "home";
    }
}
