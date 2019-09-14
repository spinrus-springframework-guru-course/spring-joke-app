package com.spinrus.jokeapp.controllers;

import com.spinrus.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.randomJoke());
        return "chucknorris";
    }
}
