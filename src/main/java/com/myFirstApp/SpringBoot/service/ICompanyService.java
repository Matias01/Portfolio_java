package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Company;
import java.util.List;

public interface ICompanyService {
    public List<Company> obtenerCompany();
    public Company crearCompany(Company company);
    public void borrarCompany(Long id);
    public Company obtenerCompany(Long id);
    public void modificarCompany(Company company);
}
