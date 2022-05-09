/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myFirstApp.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Federico
 */
@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String school;
    private String title;
    private int score;
    private String img;
    private String career;
    private int start;
    private int end;

    public Educacion() {
    }

    public Educacion(Long id, String school, String title, int score, String img, String career, int start, int end) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.score = score;
        this.img = img;
        this.career = career;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Educacion{" + "id=" + id + ", school=" + school + ", title=" + title + ", score=" + score + ", img=" + img + ", career=" + career + ", start=" + start + ", end=" + end + '}';
    }
    
}
