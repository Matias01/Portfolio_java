package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.Skill;
import com.myFirstApp.SpringBoot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository skillRepository;
    
    @Override
    public List<Skill> obtenerSkill() {
        return skillRepository.findAll();
    }

    @Override
    public Skill crearSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill obtenerSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public void modificarSkill(Skill skill) {
        skillRepository.save(skill);
    }
    
}
