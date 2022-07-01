package com.moviewheel.artifact.controller;

import com.moviewheel.artifact.repository.FilmSessionRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class FilmSessionController {

    private FilmSessionRepo filmSessionRepo;

    @GetMapping("/schedule")
    public String schedulePage(Model model){
        model.addAttribute("filmSessions", filmSessionRepo.findAll());
        return "schedule";
    }

    @GetMapping("filter")
    public String filter(@RequestParam String filter, Model model){
        if(filter != null && !filter.isEmpty()){
            model.addAttribute("filmSessions", filmSessionRepo.findByGenre(filter.toLowerCase()));
        } else {
            model.addAttribute("filmSessions", filmSessionRepo.findAll());
        }
        return "schedule";
    }
}
