package com.ThinkKedar.SpringBootFirst.Course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(new Course(1,"Java","Kedar Kapse"),
                new Course(2,"Cricket" , "Sachin Ten"),
                new Course(3,"Movie","Akshay Kumar"));
    }

}
