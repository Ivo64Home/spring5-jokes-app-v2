package ivo.springframework.spring5jokesappv2.controllers;

import ivo.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired          // is obsolete, Spring will do it any way
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", "", "index"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}
