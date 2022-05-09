package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.PersonalData;
import com.myFirstApp.SpringBoot.service.PersonalDataService;
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
public class PersonalDataController {
    
    @Autowired
    public PersonalDataService personalDataService;
    
    @GetMapping("/personalData")
    @ResponseBody
    public List<PersonalData> obtenerPersonalData() {
        return personalDataService.obtenerPersonalData();
    }
    
    @PostMapping("/personalData/create")
    @ResponseBody
    public PersonalData crearPersonalData(@RequestBody PersonalData personalData) {
        return personalDataService.crearPersonalData(personalData);
    }
    
    @DeleteMapping("/personalData/{id}")
    public void borrarPersonalData(@PathVariable Long id) {
        personalDataService.borrarPersonalData(id);
    }
    
    @GetMapping("/personalData/{id}")
    @ResponseBody
    public PersonalData obtenerPersonalData(@PathVariable Long id) {
        return personalDataService.obtenerPersonalData(id);
    }
    
    @PutMapping("/personalData/update")
    public void modificarPersonalData(@RequestBody PersonalData personalData) {
        personalDataService.modificarPersonalData(personalData);
    }
    
}
