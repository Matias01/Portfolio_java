package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> obtenerProyecto();
    public Proyecto crearProyecto(Proyecto proyecto);
    public void borrarProyecto(Long id);
    public Proyecto obtenerProyecto(Long id);
    public void modificarProyecto(Proyecto proyecto);
}
