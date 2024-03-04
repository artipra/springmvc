package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

@RequestMapping("/search")
    public String search(){
    return "search";
    }

    @RequestMapping("/searchredirect")
    public RedirectView searchredirect(@RequestParam("querybox") String keyword){
       RedirectView view = new RedirectView();
       String url ="http://www.google.com/search?q="+keyword;
       view.setUrl(url);
        return view;
    }


}
