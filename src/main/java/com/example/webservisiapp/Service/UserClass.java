package com.example.webservisiapp.Service;

import com.example.webservisiapp.Dto.SignInDTO;
import com.example.webservisiapp.Dto.UserDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservisiapp.Model.Users;
import com.example.webservisiapp.Repo.UserRepo;
import com.example.webservisiapp.response.SignInResponse;

import java.util.Optional;

@Service
public class UserClass implements UserService {

    @Autowired
    private UserRepo userRepo;
    
    UserDTO userDTO;


    @Override
    public String addUser(UserDTO userDTO) {
            Users user = new Users(
            userDTO.getUserID(),
            userDTO.getName(),
            userDTO.getEmail(),
            userDTO.getPassword()
        );

        userRepo.save(user);
        return user.getName();
    }

    @Override
    public SignInResponse signInUser(SignInDTO signInDTO) {
        Users user1 = userRepo.findByEmail(signInDTO.getEmail());
        if (user1 != null) {
            String password = signInDTO.getPassword();
            String userPassword = user1.getPassword();

            if (password.equals(userPassword)) {
                Optional<Users> user = userRepo.findOneByEmailAndPassword(signInDTO.getEmail(), userPassword);
                
                if (user.isPresent()) {
                    return new SignInResponse("Signed in succesfully.", true);
                } else {
                    return new SignInResponse("Sign in unsuccesful", false);
                }
            } else {
                return new SignInResponse("Incorrect password.", false);
            }
        } else {
            return new SignInResponse("Email does not exist.", false);
        }
    }
}
