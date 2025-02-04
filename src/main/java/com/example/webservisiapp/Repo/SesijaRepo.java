package com.example.webservisiapp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webservisiapp.Model.Sesija;

@Repository
public interface SesijaRepo extends CrudRepository<Sesija, Integer> {

}
