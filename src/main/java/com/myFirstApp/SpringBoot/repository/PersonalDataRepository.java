package com.myFirstApp.SpringBoot.repository;

import com.myFirstApp.SpringBoot.model.PersonalData;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDataRepository extends JpaRepository<PersonalData, Long>{
}
