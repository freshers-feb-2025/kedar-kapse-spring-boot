package com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.SpringBootDataJPA;

import com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.CourseJPA.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunnerSpringBootJpa implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJPARepo springDataJPARepo;

    @Override
    public void run(String... args) throws Exception {
        //courseJpaRepository.insert(new Course(4,"Cricket","Dhoni"));
       // System.out.println(courseJpaRepository.findById(4));

        springDataJPARepo.save(new CourseSBJPA(1,"Spring Boot","Mr KK"));
        springDataJPARepo.save(new CourseSBJPA(2,"Python","Mr VM"));
        springDataJPARepo.save(new CourseSBJPA(3,"Dot Boot","Mr KK"));

        System.out.println(springDataJPARepo.findAll());
    }
}
