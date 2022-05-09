package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Company;
import com.myFirstApp.SpringBoot.service.CompanyService;
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
public class CompanyController {
    
    @Autowired
    public CompanyService companyService;
    
    @GetMapping("/company")
    @ResponseBody
    public List<Company> obtenerCompany() {
        return companyService.obtenerCompany();
    }
    
    @PostMapping("/company/create")
    @ResponseBody
    public Company crearCompany(@RequestBody Company company) {
        return companyService.crearCompany(company);
    }
    
    @DeleteMapping("/company/{id}")
    public void borrarCompany(@PathVariable Long id) {
        companyService.borrarCompany(id);
    }
    
    @GetMapping("/company/{id}")
    @ResponseBody
    public Company obtenerCompany(@PathVariable Long id) {
        return companyService.obtenerCompany(id);
    }
    
    @PutMapping("/company/update")
    public void modificarCompany(@RequestBody Company company) {
        companyService.modificarCompany(company);
    }
}
