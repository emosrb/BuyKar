package com.BuyKar.BuyKar.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/HelloWorld")
    public String Hello(){
        return "hello";
    }
}
