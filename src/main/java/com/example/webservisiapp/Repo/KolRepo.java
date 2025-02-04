package com.example.webservisiapp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webservisiapp.Model.Kol;

import java.util.List;

@Repository
public interface KolRepo extends CrudRepository<Kol, Integer> {
    List<Kol> findAll();
    List<Kol> findByStudiska(String studiska);
}
