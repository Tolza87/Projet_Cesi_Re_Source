package com.pcesire.controlleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping("/ma-page")
    public String AfficheMaPage() {
        return "index";
    }
}
