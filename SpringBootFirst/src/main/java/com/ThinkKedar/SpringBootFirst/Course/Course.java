package com.ThinkKedar.SpringBootFirst.Course;

public class Course {

    private Integer id;
    private String name;
    private String Author;

    public Course(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        Author = author;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", id=" + id +
                '}';
    }
}
