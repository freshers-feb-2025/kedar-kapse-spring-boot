package com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private  CoursejdbcRepository repository;

//    @Override
//    public void run(String... args) throws Exception {
//        repository.insert();
//    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(4,"Cricket","Dhoni"));
        System.out.println(repository.findById(4));
    }
}
