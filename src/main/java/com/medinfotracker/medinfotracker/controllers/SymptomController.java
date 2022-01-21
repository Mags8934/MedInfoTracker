package com.medinfotracker.medinfotracker.controllers;


import com.medinfotracker.medinfotracker.models.data.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("symptom")
public class SymptomController {

    /**
<<<<<<< HEAD
     *
     *
     *
=======
     *h
>>>>>>> d0589d51a27d883dda0a380a190769b3a4e5bc77
     */
    @Autowired
    private SymptomRepository symptomRepository;


    @GetMapping("")
    public String index(Model model){
        model.addAttribute("Symptom Name", "sxName");
        model.addAttribute("Symptom Description", "sxDescribe");

        return "/index";
    }


}
