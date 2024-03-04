package com.example.springmvc.controllers;


import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String uploadForm(){
      return "uploadform";
    }

    @RequestMapping(value="/filehandler",method= RequestMethod.POST)
    public String fileHandler(@RequestParam("file1") MultipartFile file, HttpSession session, Model model){
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(session.getServletContext().getRealPath("/"));
        String path = "C:\\Users\\Arti\\Desktop\\ARTI\\job";
        String error =null;

        try {
            byte[] data = file.getBytes();
            FileOutputStream out = new FileOutputStream(path);
            out.write(data);
            out.close();
        }
        catch(IOException e){
            error = e.getMessage();
        }
        model.addAttribute("error",error);
        System.out.println("uploaded successfully returning to success page..");
        return "fileUploadSuccess";
    }
}
