package com.myFirstApp.SpringBoot.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PersonalData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Company company;
    @OneToOne
    private School school;
    
    @Basic
    private String name;
    private String backImage;
    private String image;
    private String position;
    private String facebook;
    private String twitter;
    private String instagram;
    private String ubication;
    private String about;

    public PersonalData() {
    }

    public PersonalData(Long id, Company company, School school, String name, String backImage, String image, String position, String facebook, String twitter, String instagram, String ubication, String about) {
        this.id = id;
        this.company = company;
        this.school = school;
        this.name = name;
        this.backImage = backImage;
        this.image = image;
        this.position = position;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.ubication = ubication;
        this.about = about;
    }

    @Override
    public String toString() {
        return "PersonalData{" + "id=" + id + ", company=" + company + ", school=" + school + ", name=" + name + ", backImage=" + backImage + ", image=" + image + ", position=" + position + ", facebook=" + facebook + ", twitter=" + twitter + ", instagram=" + instagram + ", ubication=" + ubication + ", about=" + about + '}';
    }

}
