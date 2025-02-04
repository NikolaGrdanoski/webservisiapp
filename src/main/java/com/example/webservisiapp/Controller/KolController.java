package com.example.webservisiapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservisiapp.Model.Kol;
import com.example.webservisiapp.Service.KolService;

@RestController
public class KolController {
    @Autowired
    private KolService service;

    @GetMapping("/getKol")
    public List<Kol>getExam() {
        return service.listAll();
    }

    @RequestMapping("/Kol/{id}")
    private Kol getIsp(@PathVariable(name="id") int id) {
        return service.getKolById(id);
    }

    /*@GetMapping("/GetAllKoli/{isp}")
    public List<Kol> getKols(@PathVariable int isp) {
        return service.listAllExam(isp);
    }*/

    /*@GetMapping("/allKoli/{studiska}")
    public List<Kol> allKoli(@PathVariable String studiska) { 
        studiska = studiska.replace("-", "/");
        return service.allKoli(studiska);
    }*/

    @PostMapping(value = "/AddKol")
    private int saveIsp(@RequestBody Kol ex) {
        service.saveOrUpdate(ex);
        return ex.getId();
    }

    @PutMapping("/EditKol/{id}")
    private Kol update(@RequestBody Kol ex, @PathVariable int id) {
        ex.setId(id);
        service.saveOrUpdate(ex);
        return ex;
    }

    @DeleteMapping("/DeleteKol/{id}")
    private void delete(@PathVariable int id) {
        service.delete(id);
    }
}
