package com.moviewheel.artifact.controller;

import com.moviewheel.artifact.service.FilmSessionServiceImpl;
import com.moviewheel.artifact.service.TicketServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class TicketController {

    private final TicketServiceImpl ticketServiceImpl;
    private final FilmSessionServiceImpl fsServiceImpl;


    @GetMapping("/film/{id}")
    public String showForBooking(@PathVariable("id") Long id, Model model){
        model.addAttribute("filmSession", fsServiceImpl.findById(id).get());
        return "buy";
    }

    @PostMapping("/film/ticket")
    public String booking(@RequestParam Long filmsId, @RequestParam String username){
        ticketServiceImpl.createTicket(username, filmsId);
        return "redirect:/userpage";
    }
}
