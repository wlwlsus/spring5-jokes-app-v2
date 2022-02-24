package guru.springframework.spring5jokesapp.controller;

import guru.springframework.spring5jokesapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokeController {

  private final JokeService jokeService;

  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }


  @RequestMapping({"/", "jokeapps"})
  public String getJokes(Model model) {
    model.addAttribute("joke", jokeService.getJoke());

    return "index";
  }

}
