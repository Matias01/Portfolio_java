package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Proyecto;
import com.myFirstApp.SpringBoot.service.ProyectoService;
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
public class ProyectoController {
    
    @Autowired
    public ProyectoService proyectoService;
    
    @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto> obtenerEducacion() {
        return proyectoService.obtenerProyecto();
    }
    
    @PostMapping("/proyecto/create")
    @ResponseBody
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proyectoService.borrarProyecto(id);
    }
    
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto obtenerProyecto(@PathVariable Long id) {
        return proyectoService.obtenerProyecto(id);
    }
    
    @PutMapping("/proyecto/update")
    public void modificarProyecto(@RequestBody Proyecto proyecto) {
        System.out.println(proyecto);
        proyectoService.modificarProyecto(proyecto);
    }
    
}
