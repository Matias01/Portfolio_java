/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myFirstApp.SpringBoot.service;

import com.myFirstApp.SpringBoot.model.PersonalData;
import com.myFirstApp.SpringBoot.model.Usuario;
import com.myFirstApp.SpringBoot.model.dto.UserDto;
import com.myFirstApp.SpringBoot.repository.AuthRepository;
import com.myFirstApp.SpringBoot.repository.PersonalDataRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Federico
 */
@Service
public class AuthService {
    @Autowired
    AuthRepository repository;
    
    @Autowired
    PersonalDataRepository personalDataRepository;
    
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UserDto userDto) {
        boolean isUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            Usuario usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword()))
                isUserEnabled = true;
        }
        return isUserEnabled;
    }
    
    public void crearUsuario(Usuario usuario, Long id) throws Exception{
        List<Usuario> usuarios = repository.findByEmailAndIsEnabledTrue(usuario.getEmail());
        PersonalData personal;
        
        if (personalDataRepository.existsById(id)) {
            personal = personalDataRepository.getById(id);
        } else {
            personal = new PersonalData();
            personal.setId(id);
        }
        
        if (!usuarios.isEmpty()) {
            throw new Exception("El email ya está registrado.");
        } else {
            
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setEnabled(true);
            usuario.setPersonalData(personal);
            repository.save(usuario);
        }
    }
}
