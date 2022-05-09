package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Proyecto;
import com.myFirstApp.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> obtenerProyecto() {
        return proyectoRepository.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto obtenerProyecto(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }
    
    
}
