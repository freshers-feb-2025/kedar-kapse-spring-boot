package com.ThinkKK.RestAPIValidations.Service;

import com.ThinkKK.RestAPIValidations.Entity.User;
import com.ThinkKK.RestAPIValidations.Reposotory.UserRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import java.util.List;



@Service
public class UserService {

   // private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User saveData(User user){
        User savedUser = userRepository.save(user);
        //logger.info("User saved: {}", savedUser);
        return savedUser;
    }

    public List<User> findAll(){
        List<User> allUsers = userRepository.findAll();
       // logger.info("Retrieved {} users : ",allUsers.size());
        return allUsers;
    }

    public User getOne(Long id){
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("id not present "+id));
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(Long id , User updatedUser){
        return userRepository.findById(id).map(existingUser ->{
            existingUser.setName(updatedUser.getName());
            existingUser.setBirthDate(updatedUser.getBirthDate());
            return userRepository.save(existingUser);
        }).orElseThrow(null);
    }

}
