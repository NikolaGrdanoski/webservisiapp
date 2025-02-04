package com.example.webservisiapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.webservisiapp.Model.Sesija;
import com.example.webservisiapp.Repo.SesijaRepo;

@Service
public class SesijaService {
    
    @Autowired
    private SesijaRepo repo;

    public List<Sesija> listAll() {
        return (List<Sesija>) this.repo.findAll();
    }

    public List<Sesija> getCurrentSesija() {
        LocalDate datum = LocalDate.now();
        List<Sesija> siteSesii = new ArrayList<>();
        repo.findAll().forEach(siteSesii::add);

        int segasnaGodina = datum.getYear();
    
        return siteSesii.stream()
                .filter(ispitna -> {
                    String brSesija = "";

                    if (datum.getMonthValue() == 1 || datum.getMonthValue() == 2) {
                        brSesija = "1va";
                    }
                    else if (datum.getMonthValue() == 6 || datum.getMonthValue() == 7) {
                        brSesija = "2ra";
                    }
                    else if (datum.getMonthValue() == 8 && datum.getMonthValue() == 9) {
                        brSesija = "3ra";
                    }

                    String[] years = ispitna.getStudiska().split("/");
                    int sessionYear = Integer.parseInt(years[1]);
                    return brSesija.equalsIgnoreCase(ispitna.getBrSesija()) 
                            && sessionYear == segasnaGodina;
                })
                .collect(Collectors.toList());
    }

    public Sesija getIspitById(int id) {
        return repo.findById(id).get();
    }

    public Sesija get(int id) {
        return repo.findById(id).get(); 
    }

    public void saveOrUpdate(Sesija isp) {
        repo.save(isp);
    }

    public void update (Sesija isp, int id) {
        repo.save(isp);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

}
