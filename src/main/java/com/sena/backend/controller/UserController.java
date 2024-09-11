package com.sena.backend.controller;


import com.sena.backend.models.UserDto;
import com.sena.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    /*@Autowired
    private UserService userService;*/

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        try {
            List<UserDto> users = userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

/*    @PostMapping("/create")
    public ResponseEntity<UserModels> createUser(@RequestBody UserModels user) {
        try {
            UserModels createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<UserModels> updateUser(@PathVariable Long userId, @RequestBody UserModels newUser) {
        try {
            UserModels updatedUser = userService.updateUser(userId, newUser);
            if (updatedUser != null) {
                return new ResponseEntity<>(updatedUser, HttpStatus.OK);
            }
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<HashMap<String, String>> deleteUser(@PathVariable Long userId) {
        try {
            HashMap<String, String> response = userService.deleteUser(userId);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}

