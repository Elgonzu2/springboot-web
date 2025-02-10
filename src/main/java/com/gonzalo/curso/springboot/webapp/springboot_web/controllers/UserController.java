package com.gonzalo.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
        // List<User> users = Arrays.asList(
        //     new User("Gonza", "Fernandez", "gonzafer@gmail.com"), 
        //     new User("Joni", "Trava", "joniTra@gmail.com"), 
        //     new User("Bora", "Tusa", "boraTu@gmail.com"));

        // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("Gonza", "Fernandez", "gonzafer@gmail.com"), 
            new User("Joni", "Trava", "joniTra@gmail.com"), 
            new User("Bora", "Tusa", "boraTu@gmail.com"));
        
        
    }
}