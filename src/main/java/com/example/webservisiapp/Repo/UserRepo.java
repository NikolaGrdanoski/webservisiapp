package com.example.webservisiapp.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.webservisiapp.Model.Users;

import java.util.Optional;

@EnableJpaRepositories
@Repository

public interface UserRepo extends JpaRepository<Users, Integer> {

    Optional<Users> findOneByEmailAndPassword(String email, String password);

    Users findByEmail(String email);

}
