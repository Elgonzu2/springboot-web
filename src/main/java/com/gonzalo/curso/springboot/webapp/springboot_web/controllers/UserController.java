package com.gonzalo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.gonzalo.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        
        User user = new User("Gonza", "Fernandez");

        user.setEmail("gonza@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        User user = new User("Gonza", "Fernandez");
        User user2 = new User("Joni", "Trava");
        User user3 = new User("Bora", "Tusa");

        model.addAttribute("users", new User[]{user, user2, user3});
        model.addAttribute("title", "Listado de usuarios");
        
        return "list";
    }
}
