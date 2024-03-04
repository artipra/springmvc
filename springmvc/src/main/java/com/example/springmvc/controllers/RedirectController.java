package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @RequestMapping(path="/redirectone")
    public RedirectView one(){
        System.out.println("one.....");
        RedirectView view = new RedirectView();
        view.setUrl("/redirecttwo");
        return view;
       // return "redirect:/redirecttwo";
    }

    @RequestMapping("/redirecttwo")
    public String two(){
        System.out.println("two.....");
        return "enjoy";
    }

}
