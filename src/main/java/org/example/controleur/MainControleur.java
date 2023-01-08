package org.example.controleur;


import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControleur {
    @GetMapping("/hola")
    public String main(@NotNull Model model) {
        model.addAttribute("message", "Bienvenue sur la page principale !");
        return "main";
    }
}
