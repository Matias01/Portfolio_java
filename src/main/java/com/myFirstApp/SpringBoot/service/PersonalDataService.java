package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.PersonalData;
import com.myFirstApp.SpringBoot.repository.PersonalDataRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDataService implements IPersonalDataService{
    
    @Autowired
    public PersonalDataRepository personalDataRepository;

    @Override
    public List<PersonalData> obtenerPersonalData() {
        return personalDataRepository.findAll();
    }

    @Override
    public PersonalData crearPersonalData(PersonalData personalData) {
        return personalDataRepository.save(personalData);
    }

    @Override
    public void borrarPersonalData(Long id) {
        personalDataRepository.deleteById(id);
    }

    @Override
    public PersonalData obtenerPersonalData(Long id) {
        return personalDataRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarPersonalData(PersonalData personalData) {
        personalDataRepository.save(personalData);
    }
}
