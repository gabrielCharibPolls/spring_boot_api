package org.example.controleur;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class wello {
    @GetMapping("/hello")
    public String  hello() {
        return "hello";
    }

}