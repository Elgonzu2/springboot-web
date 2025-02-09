package com.gonzalo.curso.springboot.webapp.springboot_web.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.curso.springboot.webapp.springboot_web.models.User;
import com.gonzalo.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Gonza", "Fernandez");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        
        return userDto;
    }

    @GetMapping("/list")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<User> list(){
        User user = new User("Gonza", "Fernandez");
        User user2 = new User("Joni", "Trava");
        User user3 = new User("Bora", "Tusa");

        List<User> users = Arrays.asList(user, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        User user = new User("Gonza", "Fernandez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        
        return body;
    }
}
