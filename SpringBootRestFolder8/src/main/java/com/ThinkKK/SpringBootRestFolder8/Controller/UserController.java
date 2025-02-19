package com.ThinkKK.SpringBootRestFolder8.Controller;

import com.ThinkKK.SpringBootRestFolder8.Dao.UserDaoService;
import com.ThinkKK.SpringBootRestFolder8.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDaoService userDaoService;
    public UserController(UserDaoService userDaoService){
        this.userDaoService=userDaoService;
    }

    @GetMapping("/allusers")
    public List<User> retriveAllTheUsers(){
        return userDaoService.findAll();
    }

    @GetMapping("/getbyid/{id}")
    public User getOneUser(@PathVariable int id){
        return userDaoService.getOne(id);
    }

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return userDaoService.addUser(user);
    }

}
