package com.myFirstApp.SpringBoot.controller;

import com.myFirstApp.SpringBoot.model.Skill;
import com.myFirstApp.SpringBoot.service.SkillService;
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
public class SkillController {
    
    @Autowired
    public SkillService skillService;
    
    @GetMapping("/skill")
    @ResponseBody
    public List<Skill> obtenerSkill() {
        return skillService.obtenerSkill();
    }
    
    @PostMapping("/skill/create")
    @ResponseBody
    public Skill crearSkill(@RequestBody Skill skill) {
        return skillService.crearSkill(skill);
    }
    
    @DeleteMapping("/skill/{id}")
    public void borrarSkill(@PathVariable Long id) {
        skillService.borrarSkill(id);
    }
    
    @GetMapping("/skill/{id}")
    @ResponseBody
    public Skill obtenerSkill(@PathVariable Long id) {
        return skillService.obtenerSkill(id);
    }
    
    @PutMapping("/skill/update")
    public void modificarSkill(@RequestBody Skill skill) {
        System.out.println(skill);
        skillService.modificarSkill(skill);
    }
}
