package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.School;
import com.myFirstApp.SpringBoot.repository.SchoolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService implements ISchoolService{

    @Autowired
    public SchoolRepository schoolRepository;
    
    @Override
    public List<School> obtenerSchool() {
        return schoolRepository.findAll();
    }

    @Override
    public School crearSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public void borrarSchool(Long id) {
        schoolRepository.deleteById(id);
    }

    @Override
    public School obtenerSchool(Long id) {
        return schoolRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarSchool(School school) {
        schoolRepository.save(school);
    }
    
}
