package com.thinkkk.Demo_Welcome_API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("wel")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeMessage(){
        String msg = "Welcome to the thinkitive...";
        return msg;
    }
}
