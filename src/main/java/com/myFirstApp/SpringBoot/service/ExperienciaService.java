package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Experiencia;
import com.myFirstApp.SpringBoot.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> obtenerExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return experienciaRepository.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia obtenerExperiencia(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
    
}
