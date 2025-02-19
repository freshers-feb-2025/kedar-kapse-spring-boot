package com.kedarthink.simplecrud.Controller;

import com.kedarthink.simplecrud.Entity.CrudEntity;
import com.kedarthink.simplecrud.Repository.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CrudController {

    @Autowired
    private CrudRepo crudRepo;
    CrudController(CrudRepo crudRepo){
        this.crudRepo=crudRepo;
    }

    @PostMapping("/add")
    public CrudEntity saveData(@RequestBody CrudEntity crudEntity){
       return crudRepo.save(crudEntity);
    }

    @GetMapping("/getAll")
    public List<CrudEntity> getAllData(){
        List<CrudEntity> data = crudRepo.findAll();
        data.forEach(System.out::println);
        return data;
    }

    @PutMapping("/update/{id}")
    public CrudEntity updateData(@PathVariable long id, @RequestBody CrudEntity updatedEntity) {
        if (crudRepo.existsById(id)) {
            updatedEntity.setId(id);
            return crudRepo.save(updatedEntity);
        } else {
            System.out.println("Data is not present");
            throw new ArithmeticException("hey");
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        crudRepo.deleteById(id);
        System.out.println("Data Deleted...");
    }

}
