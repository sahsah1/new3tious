package com.new3tious.new3app.controllers;

import com.new3tious.new3app.model.User;
import com.new3tious.new3app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //TODO: return an appropriate error message if user not found.
    @GetMapping(path = "{id}")
    public User getUserById(@Valid @NonNull @PathVariable("id") UUID id){
        return userService.getUserById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") UUID id){
        userService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public void updateUserById(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody User user){
        userService.updateUser(id, user);
    }
}
