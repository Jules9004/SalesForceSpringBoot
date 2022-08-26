package com.DEVS.SalesForce.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Mamá estoy triunfando; hice mi primera página web con Spring Boot";
    }
    @GetMapping("/about")
    public String presentar(){
        return "Hola! Me llamo Julieta Torres Roldán :)";
    }
}
