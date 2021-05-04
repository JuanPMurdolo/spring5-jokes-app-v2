package guru.springframework.norris.chucknorris.controllers;

import guru.springframework.norris.chucknorris.services.ChuckNorrisQuote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {

    private final ChuckNorrisQuote chuckNorrisQuote;

    public ChuckNorrisController(ChuckNorrisQuote chuckNorrisQuote) {
        this.chuckNorrisQuote = chuckNorrisQuote;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", chuckNorrisQuote.getJoke());

        return "index";
    }
}
