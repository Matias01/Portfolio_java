package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Company;
import com.myFirstApp.SpringBoot.repository.CompanyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService implements ICompanyService{

    @Autowired
    public CompanyRepository companyRepository;
    
    @Override
    public List<Company> obtenerCompany() {
        return companyRepository.findAll();
    }

    @Override
    public Company crearCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public void borrarCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Company obtenerCompany(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarCompany(Company company) {
        companyRepository.save(company);
    }
    
}
