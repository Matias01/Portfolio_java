package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Company;
import com.myFirstApp.SpringBoot.model.School;
import com.myFirstApp.SpringBoot.service.CompanyService;
import com.myFirstApp.SpringBoot.service.SchoolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {
    
    @Autowired
    public SchoolService schoolService;
    
    @GetMapping("/school")
    @ResponseBody
    public List<School> obtenerSchool() {
        return schoolService.obtenerSchool();
    }
    
    @PostMapping("/school/create")
    @ResponseBody
    public School crearSchool(@RequestBody School school) {
        return schoolService.crearSchool(school);
    }
    
    @DeleteMapping("/school/{id}")
    public void borrarSchool(@PathVariable Long id) {
        schoolService.borrarSchool(id);
    }
    
    @GetMapping("/school/{id}")
    @ResponseBody
    public School obtenerSchool(@PathVariable Long id) {
        return schoolService.obtenerSchool(id);
    }
    
    @PutMapping("/school/update")
    public void modificarSchool(@RequestBody School school) {
        schoolService.modificarSchool(school);
    }
}
