package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home/{id}")
    public String home2(@PathVariable("id") int id){
        System.out.println("id---"+id);
       return "home2";
    }

    @RequestMapping("/home")
    public String home(Model model){
        List<String> list = Arrays.asList("usa","london","self love");
        model.addAttribute("list",list);
        model.addAttribute("dob",1207);
        return "home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Arti No 1");
        modelAndView.addObject("time", LocalDateTime.now());
        List<Integer> list = Arrays.asList(1,2,3,5);
        modelAndView.addObject("list",list);
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
