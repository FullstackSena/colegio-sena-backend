package com.sena.backend.repositories;

import com.sena.backend.models.UserDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;


public interface IUserRepository {

    List<UserDto> getAllUsers();

    UserDto createUser(UserDto user);

    UserDto updateUser(Long userId, UserDto newUser);

    HashMap<String, String> deleteUser(Long userId);

}
