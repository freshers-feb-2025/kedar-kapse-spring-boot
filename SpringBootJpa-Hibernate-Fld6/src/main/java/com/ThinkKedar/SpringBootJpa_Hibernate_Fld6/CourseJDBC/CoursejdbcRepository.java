package com.ThinkKedar.SpringBootJpa_Hibernate_Fld6.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoursejdbcRepository {

    @Autowired
    private  JdbcTemplate springJdbcTemplate;

//    private static String INSERT_QUERY = """
//            insert into course(id,name,author)
//            values(1,'Ramayan','Shyam');
//            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }


    private static String INSERT_QUERY = """
            insert into course(id,name,author)
            values(?,?,?);
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),
                course.getName(),course.getAuthor());
    }

    private static String SELECT_QUERY = """
    
        select * from course where id = ?
    """;

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);

    }

}
