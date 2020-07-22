package com.projetjee.infrastructure.controller.User;

import com.projetjee.domain.model.User;
import com.projetjee.useCases.User.EditUser;
import com.projetjee.useCases.User.GetUser;
import com.projetjee.useCases.User.RegisterUser;
import com.projetjee.useCases.User.RemoveUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final GetUser getUser;
    private final RemoveUser removeUser;
    private final EditUser updateUser;
    private final RegisterUser registerUser;

    public UserController(GetUser getUser, RemoveUser removeUser, EditUser updateUser, RegisterUser registerUser) {
        this.getUser = getUser;
        this.removeUser = removeUser;
        this.updateUser = updateUser;
        this.registerUser = registerUser;
    }

    @PostMapping("/user/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto) {
        registerUser.signUp(new User(null, userDto.getUsername(), userDto.getEmail(), null, userDto.getUserType(), userDto.getProfilePic()));

        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }

    @RequestMapping("/user/update")
    public ResponseEntity<String> updateUser(@RequestBody UserDto userDto) {
        updateUser.editUser(new User(null, userDto.getUsername(), userDto.getEmail(), null, userDto.getUserType(), userDto.getProfilePic()));
        return new ResponseEntity<>("Test user updated", HttpStatus.OK);
    }
}
