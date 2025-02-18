package com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.CourseJPA;

import com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.CourseJDBC.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunnerJPA implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        //courseJpaRepository.insert(new Course(4,"Cricket","Dhoni"));
        System.out.println(courseJpaRepository.findById(4));
    }
}
