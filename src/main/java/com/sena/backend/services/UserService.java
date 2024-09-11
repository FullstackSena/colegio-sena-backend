package com.sena.backend.services;

import com.sena.backend.models.UserDto;
import com.sena.backend.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return userRepository.getAllUsers();
    }



    /*public List<UserModels> getAllUsers() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error");
        }
    }

    public UserModels createUser(UserModels user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            throw new RuntimeException("Error al crear el usuario");
        }
    }

    public UserModels updateUser(Long userId, UserModels newUser) {
        try {
            UserModels existingUser = userRepository.findById(userId).orElse(null);
            if (existingUser != null) {
                existingUser.setName(newUser.getName());
                existingUser.setSurname(newUser.getSurname());
                existingUser.setEmail(newUser.getEmail());

                return userRepository.save(existingUser);
            }
            throw new RuntimeException("Usuario no encontrado");
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar el usuario");
        }
    }

    public HashMap<String, String> deleteUser(Long userId) {
        try {
            HashMap<String, String> response = new HashMap<>();
            response.put("Mensaje", "Usuario eliminado exitosamente!");
            userRepository.deleteById(userId);
            return response;
        } catch (Exception e) {
            throw new RuntimeException("Error deleting user");
        }
    }*/
}
