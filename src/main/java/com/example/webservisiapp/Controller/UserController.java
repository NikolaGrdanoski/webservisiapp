package com.example.webservisiapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.webservisiapp.Dto.SignInDTO;
import com.example.webservisiapp.Dto.UserDTO;
import com.example.webservisiapp.Service.UserService;
import com.example.webservisiapp.response.SignInResponse;


@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

   
    @PostMapping(path = "/SignIn")
    public ResponseEntity<?> signInEmployee(@RequestBody SignInDTO loginDTO)
    {
        SignInResponse signInResponse = userService.signInUser(loginDTO);
        return ResponseEntity.ok(signInResponse);
    }

    @PostMapping(path = "/Register")
    public String saveUser(@RequestBody UserDTO userDTO) {
        String id = userService.addUser(userDTO);
        return id;
    }
    
}
