package com.gonzalo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.gonzalo.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;

        // localhost:8080/api/params/foo?message=Hola
    }
    
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){

        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;

        // localhost:8080/api/params/bar?text=Hola&code=200
    }
}
