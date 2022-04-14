package com.example.testing.testing.controller;

import com.example.testing.testing.entities.MahasiswaEntity;
import com.example.testing.testing.entities.MatkulEntity;
import com.example.testing.testing.repositories.MahasiswaRepository;
import com.example.testing.testing.repositories.MatkulRepository;
import com.example.testing.testing.response.CommonResponse;
import com.example.testing.testing.response.ResponseGenerator;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/mahasiswa")

public class Mahasiswa {

    @Autowired
    MahasiswaRepository mahasiswaRepository;

    @GetMapping(value = "check")
    public String check(){
        return "Hellow World";
    }

    @PostMapping(value = "addmhs")
    public CommonResponse<MahasiswaEntity> addmatkul(@RequestBody MahasiswaEntity param){
        mahasiswaRepository.save(param);
        return ResponseGenerator.responseberhasil(param,"Data berhasil dimasukkan.");
    }

    @GetMapping(value = "getmhs")
    public List<MahasiswaEntity> getmhs(){
        return mahasiswaRepository.findAll();
    }

    @GetMapping(value = "getmhsid")
    public MahasiswaEntity getmatkulid(@RequestParam int id){
        return mahasiswaRepository.findById(id).get();
    }

    @PostMapping(value = "updatemhs")
    public MahasiswaEntity updatematkul(@RequestBody MahasiswaEntity param){
        return mahasiswaRepository.save(param);
    }

    @GetMapping(value = "deletemhs")
    public CommonResponse<String> deletemhs(@RequestParam int id){
        mahasiswaRepository.deleteById(id);
        return ResponseGenerator.responseberhasil("Nothing","Data berhasil dimasukkan.");
    }
}
