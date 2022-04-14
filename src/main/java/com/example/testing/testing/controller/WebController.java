package com.example.testing.testing.controller;

import com.example.testing.testing.repositories.JurusanRepository;
import com.example.testing.testing.repositories.MahasiswaRepository;
import com.example.testing.testing.repositories.MatkulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    JurusanRepository jurusanRepository;

    @Autowired
    MahasiswaRepository mahasiswaRepository;

    @Autowired
    MatkulRepository matkulRepository;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/addmhsform")
    public String addmhsform(Model model){
        model.addAttribute("jurusan", jurusanRepository.findAll());
        return "formaddmhs";
    }

    @RequestMapping(value = "/dataku")
    public String dataku(){
        return "dataku";
    }

    @RequestMapping(value = "/setmatkul")
    public String setmatkul(Model model, int id){
        model.addAttribute("mhs", mahasiswaRepository.findById(id).get());
        return "setmatkul";
    }

    @RequestMapping(value = "/addmatkulform")
    public String addmatkulform(Model model){
        model.addAttribute("jurusan", jurusanRepository.findAll());
        model.addAttribute("matkul", matkulRepository.findAll());
        return "addmatkulform";
    }
}
