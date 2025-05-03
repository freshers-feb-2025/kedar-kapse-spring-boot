package com.ThinkKK.RestAPIValidations.Controller;

import com.ThinkKK.RestAPIValidations.Entity.SomeBean;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Filter;

@RestController
public class FilterringController {

    @GetMapping("/static")
    public SomeBean filterring(){
        return new SomeBean("value1","value2","value3");
    }

    //Dynamic filterring
    @GetMapping("/dynamic")
    public MappingJacksonValue dynamicFilterring(){
        SomeBean someBean = new SomeBean("val1","val2","val3");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
        SimpleBeanPropertyFilter filterProvider = SimpleBeanPropertyFilter.filterOutAllExcept();
        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter",filterProvider);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
