package com.example.springmvc.controllers;

import com.example.springmvc.model.User;
import com.example.springmvc.services.UserService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonHearder(Model m){
        System.out.println("model is common");
        m.addAttribute("h1","mvc");
    }

    @RequestMapping("/contactform")
    public String showForm() {
        return "contact";
    }

    @RequestMapping(path="/registeruser", method=RequestMethod.POST)
    public String registeruser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "success";
    }


}
