package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Experiencia;
import com.myFirstApp.SpringBoot.service.ExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    public ExperienciaService expService;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> obtenerExperiencia() {
        return expService.obtenerExperiencia();
    }
    
    @PostMapping("/experiencia/create")
    @ResponseBody
    public Experiencia crearExperiencia(@RequestBody Experiencia experiencia) {
        return expService.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expService.borrarExperiencia(id);
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia obtenerExperiencia(@PathVariable Long id) {
        return expService.obtenerExperiencia(id);
    }
    
    @PutMapping("/experiencia/update")
    public void modificarExperiencia(@RequestBody Experiencia experiencia) {
        System.out.println(experiencia);
        expService.modificarExperiencia(experiencia);
    }
}
