package com.kedarthink.FirstWebProjectFolder7.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/say-hi")
    @ResponseBody
    public String sayHello(){
        return "hey..Hi what are you learning today..?";
    }

}
