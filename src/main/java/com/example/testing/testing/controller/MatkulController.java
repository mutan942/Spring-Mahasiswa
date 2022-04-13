package com.example.testing.testing.controller;

import com.example.testing.testing.entities.MatkulEntity;
import com.example.testing.testing.repositories.MatkulRepository;
import com.example.testing.testing.response.CommonResponse;
import com.example.testing.testing.response.ResponseGenerator;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/matkul")

public class MatkulController {

    @Autowired
    MatkulRepository matkulRepository;

    @GetMapping(value = "check")
    public String check(){
        return "Hellow World";
    }

    @PostMapping(value = "addmatkul")
    public CommonResponse<MatkulEntity> addmatkul(@RequestBody MatkulEntity param){
        matkulRepository.save(param);
        return ResponseGenerator.responseberhasil(param,"Data berhasil dimasukkan.");
    }

    @GetMapping(value = "getmatkul")
    public List<MatkulEntity> getmatkul(){
        return matkulRepository.findAll();
    }

    @GetMapping(value = "getmatkulid")
    public MatkulEntity getmatkulid(@RequestParam int id){
        return matkulRepository.findById(id).get();
    }

    @PostMapping(value = "updatematkul")
    public MatkulEntity updatematkul(@RequestBody MatkulEntity param){
        return matkulRepository.save(param);
    }

    @GetMapping(value = "deletematkul")
    public String deletematkul(@RequestParam int id){
        matkulRepository.deleteById(id);

        return "Matkul berhasil dihapus.";
    }
}
