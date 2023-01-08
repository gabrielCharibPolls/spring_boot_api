package org.example.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TempletControleur {
    @RequestMapping("/")
    public String accueil() {
        return "main";
    }
}
