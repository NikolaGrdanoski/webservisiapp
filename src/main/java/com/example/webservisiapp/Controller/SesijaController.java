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

import com.example.webservisiapp.Model.Sesija;
import com.example.webservisiapp.Service.SesijaService;

@RestController
public class SesijaController {
    @Autowired
    private SesijaService service;

    @GetMapping("/getSesija")
    public List<Sesija>getSesija() {
        return service.listAll();
    }

    @GetMapping("/segasna")
    public List<Sesija> getCurrentSesija() {
        return service.getCurrentSesija();
    }

    @PostMapping(value = "/AddSesija")
    private int saveSesija(@RequestBody Sesija sesija) {
        service.saveOrUpdate(sesija);
        return sesija.getID();
    }

    @RequestMapping("/Sesija/{id}")
    private Sesija getSesija(@PathVariable(name="id") int id) {
        return service.getIspitById(id);
    }

    @PutMapping("/EditSesija/{id}")
    private Sesija update(@RequestBody Sesija sesija, @PathVariable int id) {
        sesija.setID(id);
        service.saveOrUpdate(sesija);
        return sesija;
    }

    @DeleteMapping("/DeleteSesija/{id}")
    private void delete(@PathVariable int id) {
        service.delete(id);
    }
}
