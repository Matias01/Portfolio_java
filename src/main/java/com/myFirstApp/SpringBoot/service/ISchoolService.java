package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.School;
import java.util.List;

public interface ISchoolService {
    public List<School> obtenerSchool();
    public School crearSchool(School school);
    public void borrarSchool(Long id);
    public School obtenerSchool(Long id);
    public void modificarSchool(School school);
}
