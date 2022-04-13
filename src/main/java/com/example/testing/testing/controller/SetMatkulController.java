package com.example.testing.testing.controller;

import com.example.testing.testing.dto.JoinDapatBanyakAmbil;
import com.example.testing.testing.dto.JoinDapatMatkul;
import com.example.testing.testing.dto.JoinDapatSiswa;
import com.example.testing.testing.entities.SetMatkulEntity;
import com.example.testing.testing.repositories.SetmatkulRepository;
import com.example.testing.testing.response.CommonResponse;
import com.example.testing.testing.response.ResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/setmatkul")

public class SetMatkulController {

    @Autowired
    SetmatkulRepository mahasiswaRepository;

    @GetMapping(value = "setmatkul")
    public String check(){
        return "Hellow World";
    }

    @PostMapping(value = "addmatkul")
    public CommonResponse<SetMatkulEntity> addmatkul(@RequestBody SetMatkulEntity param){
        mahasiswaRepository.save(param);
        return ResponseGenerator.responseberhasil(param,"Data berhasil dimasukkan.");
    }

    @GetMapping(value = "getmhs")
    public List<SetMatkulEntity> getmhs(){
        return mahasiswaRepository.findAll();
    }

    @GetMapping(value = "getmhsid")
    public SetMatkulEntity getmatkulid(@RequestParam int id){
        return mahasiswaRepository.findById(id).get();
    }

    @PostMapping(value = "updatemhs")
    public SetMatkulEntity updatematkul(@RequestBody SetMatkulEntity param){
        return mahasiswaRepository.save(param);
    }

    @GetMapping(value = "deletemhs")
    public CommonResponse<String> deletematkul(@RequestParam int id){
        mahasiswaRepository.deleteById(id);
        return ResponseGenerator.responseberhasil("Nothing","Data berhasil dimasukkan.");
    }

    @GetMapping(value = "dapatkuliah")
    public ResponseEntity<List<JoinDapatMatkul>> dapatkuliah(){
        return ResponseEntity.ok(mahasiswaRepository.getsetmatkul());
    }

    @GetMapping(value = "dapatbanyakambil")
    public ResponseEntity<List<JoinDapatBanyakAmbil>> dapatbanyakambil(){
        return ResponseEntity.ok(mahasiswaRepository.getbanyakambil());
    }

    @RequestMapping(path="dapatsiswa", method=RequestMethod.GET)
    public ResponseEntity<List<JoinDapatSiswa>> dapatsiswa(){
        return ResponseEntity.ok(mahasiswaRepository.getsiswa());
    }
}
