package com.api_spring_postgresql_docker.services;

import com.api_spring_postgresql_docker.entities.User;
import com.api_spring_postgresql_docker.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<User> getUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getById(Long id){         //El tipo optional puede devolver un tipo o devolver null
        return userRepository.findById(id);
    }

    public User updateById(User request, Long id){
        // Buscar usuario, o lanzar excepción si no existe
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Actualizar campos (por ahora solo el nombre)
        user.setName(request.getName());

        // Guardar cambios en la BD
        return userRepository.save(user);
    }

    public Boolean deleteUser(Long id){
        try{
            userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
