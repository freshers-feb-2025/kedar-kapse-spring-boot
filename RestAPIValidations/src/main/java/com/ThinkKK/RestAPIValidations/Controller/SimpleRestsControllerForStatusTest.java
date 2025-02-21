package com.ThinkKK.RestAPIValidations.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestsControllerForStatusTest {
(
    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(){
        String message = "Hey Kedar Kapse...";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @GetMapping("/greet")
    public String greet(){
        String message = "Good Evening Sir...";
        return message;
    }

    @GetMapping("/course")
    public ResponseEntity<String> getCourse(@RequestParam("cname") String cname , @RequestParam("tname") String tname){
        String respBody = cname+" By "+tname+" Fees = 120000";
        return new ResponseEntity<>(respBody,HttpStatus.OK);
    }


}
