package com.example.springmvc.controllers;


import com.example.springmvc.model.Complex;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComplexFormController {


    @RequestMapping("/complex")
    public String complexForm(){
        return "complex";
    }


    @RequestMapping(path="/complexprocess",  method=RequestMethod.POST)
    public String complexFormProcess(@ModelAttribute("complex") Complex complex, BindingResult result){
        if(result.hasErrors()) return "complex";
        System.out.println(complex);
        return "success";
    }
}
