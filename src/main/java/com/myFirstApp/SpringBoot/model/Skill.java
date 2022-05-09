package com.myFirstApp.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String name;
    private String progress;
    private String confirms;
    private String[] confirmsNames;

    public Skill() {
    }

    public Skill(Long id, String name, String progress, String confirms, String[] confirmsNames) {
        this.id = id;
        this.name = name;
        this.progress = progress;
        this.confirms = confirms;
        this.confirmsNames = confirmsNames;
    }

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", name=" + name + ", progress=" + progress + ", confirms=" + confirms + ", confirmsNames=" + confirmsNames + '}';
    }
    
}
