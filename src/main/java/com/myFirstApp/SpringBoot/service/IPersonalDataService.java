package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.PersonalData;
import java.util.List;

public interface IPersonalDataService {
    public List<PersonalData> obtenerPersonalData();
    public PersonalData crearPersonalData(PersonalData personalData);
    public void borrarPersonalData(Long id);
    public PersonalData obtenerPersonalData(Long id);
    public void modificarPersonalData(PersonalData personalData);
}
