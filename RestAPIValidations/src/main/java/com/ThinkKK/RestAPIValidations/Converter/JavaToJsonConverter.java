package com.ThinkKK.RestAPIValidations.Converter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaToJsonConverter {
    public static void main(String[] args) throws Exception{
        Book book = new Book();
        book.setId(101);
        book.setName("Java");
        book.setPrice(500.5);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("book.json"),book);
        System.out.println("Conversion Completed....");
    }
}
