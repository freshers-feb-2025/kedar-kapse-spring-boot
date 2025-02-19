package com.ThinkKK.SpringBootRestFolder8.Dao;

import com.ThinkKK.SpringBootRestFolder8.Entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {




    static int counter=0;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Kedar", LocalDate.now().minusYears(21)));
        users.add(new User(2,"Ankita", LocalDate.now().minusYears(20)));
        users.add(new User(3,"Dadu", LocalDate.now().minusYears(30)));
        users.add(new User(4,"Shyambho", LocalDate.now().minusYears(5)));
        users.add(new User(5,"Shiv", LocalDate.now().minusYears(3)));
    }
    public List<User> findAll(){
        return users;
    }

    public User getOne(int id){
        User value = users.stream().filter(tempid->tempid.getId().equals(id)).findFirst().get();
        return value;
    }

    public User addUser(User user){
        counter++;
        user.setId(counter);
        user.setId(counter);
        users.add(user);
        return user;
    }
}
