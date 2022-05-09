package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> obtenerSkill();
    public Skill crearSkill(Skill skill);
    public void borrarSkill(Long id);
    public Skill obtenerSkill(Long id);
    public void modificarSkill(Skill skill);
    
}
