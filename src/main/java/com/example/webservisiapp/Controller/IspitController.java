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

import com.example.webservisiapp.Model.Ispit;
import com.example.webservisiapp.Service.IspitService;

@RestController
public class IspitController {
    @Autowired
    private IspitService service;

    @GetMapping("/getIspit")
    public List<Ispit>getExam() {
        return service.listAll();
    }

    @RequestMapping("/Ispit/{id}")
    private Ispit getIsp(@PathVariable(name="id") int id) {
        return service.getIspitById(id);
    }

    @GetMapping("/GetAllIspiti/{isp}")
    public List<Ispit> getIspits(@PathVariable int isp) {
        return service.listAllExam(isp);
    }

    @GetMapping("/allIspiti/{studiska}")
    public List<Ispit> allIspiti(@PathVariable String studiska) { 
        studiska = studiska.replace("-", "/");
        return service.allIspiti(studiska);
    }

    @PostMapping(value = "/AddIspit")
    private int saveIsp(@RequestBody Ispit ex) {
        service.saveOrUpdate(ex);
        return ex.getId();
    }

    @PutMapping("/EditIspit/{id}")
    private Ispit update(@RequestBody Ispit ex, @PathVariable int id) {
        ex.setId(id);
        service.saveOrUpdate(ex);
        return ex;
    }

    @DeleteMapping("/DeleteIspit/{id}")
    private void delete(@PathVariable int id) {
        service.delete(id);
    }

}
