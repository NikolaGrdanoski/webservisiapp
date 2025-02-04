package com.example.webservisiapp.Service;


import com.example.webservisiapp.Dto.SignInDTO;
import com.example.webservisiapp.Dto.UserDTO;
import com.example.webservisiapp.response.SignInResponse;

public interface UserService {

    String addUser(UserDTO userDTO);
    SignInResponse signInUser(SignInDTO loginDTO);

}
