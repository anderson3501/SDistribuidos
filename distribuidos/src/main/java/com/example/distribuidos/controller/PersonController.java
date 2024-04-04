package com.example.distribuidos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping()    
    public String Person() {
        return "Prueba proy 2";
    }
    
}
