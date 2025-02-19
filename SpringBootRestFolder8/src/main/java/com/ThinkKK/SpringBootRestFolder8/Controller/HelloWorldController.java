package com.ThinkKK.SpringBootRestFolder8.Controller;

import com.ThinkKK.SpringBootRestFolder8.Entity.User;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class HelloWorldController {

//  @RequestMapping(method = RequestMethod.GET , path = "hello-world")
    public String helloWorld(){
        return "Hello World..";
    }

    //this is example of path variable
    @GetMapping("/path/{name}")
    public String pathVeriableExample(@PathVariable String name){
            return "The Name Is :- "+name;
    }
}
