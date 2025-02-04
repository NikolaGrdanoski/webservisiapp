package com.example.webservisiapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservisiapp.Model.Kol;
import com.example.webservisiapp.Repo.KolRepo;

@Service
public class KolService {
    @Autowired
    private KolRepo repo;

    public List<Kol> listAll() {
        return (List<Kol>) this.repo.findAll();
    }

    /*public List<Kol> allKoli(String studiska) {
        return StreamSupport.stream(repo.findAll().spliterator(), false)
            .filter(e -> e.getIsp().getStudiska().equals(studiska))
            .toList();
    }*/

    public void saveOrUpdate(Kol ex) {
        repo.save(ex);
    }

    public Kol getKolById(int id) {
        return repo.findById(id).get();
    }

    public Kol get(int id) {
        return repo.findById(id).get(); 
    }
    
    /*public List<Kol> listAllExam(int isp) {
        return (List<Kol>) this.repo.findByIsp_Id(isp); 
    }*/

    public void update (Kol ex, int id) {
        repo.save(ex);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
