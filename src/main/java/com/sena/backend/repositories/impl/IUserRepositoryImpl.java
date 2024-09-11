package com.sena.backend.repositories.impl;

import com.sena.backend.models.UserDto;
import com.sena.backend.repositories.IUserRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class IUserRepositoryImpl implements IUserRepository {

    public List<UserDto> getAllUsers() {
        UserDto user = new UserDto();
        user.setId(1);
        user.setEmail("user1@sena.com.co");
        user.setName("name1");
        user.setSurname("surename1");

        UserDto user2 = new UserDto();
        user2.setId(1);
        user2.setEmail("user1@sena.com.co");
        user2.setName("name1");
        user2.setSurname("surename1");

        return Arrays.asList(user, user2);
    }

    public UserDto createUser(UserDto user) {
        return null;
    }

    public UserDto updateUser(Long userId, UserDto newUser) {
        return null;
    }

    public HashMap<String, String> deleteUser(Long userId) {
        return null;
    }
}
