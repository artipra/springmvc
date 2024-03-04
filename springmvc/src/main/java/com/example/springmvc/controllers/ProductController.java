package com.example.springmvc.controllers;

import com.example.springmvc.model.Product;
import com.example.springmvc.services.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.jsp.PageContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ProductController {

@Autowired
private ProductService productService;


    @RequestMapping("/")
    public String home(Model m)
    {   List<Product> products = productService.getAll();
        m.addAttribute("products",products);
        return "producthome";

    }

    @RequestMapping("/add-product")
    public String addProduct(Model m){
      m.addAttribute("title", "Add Product");
      return "add_product";
    }

    @RequestMapping(value="/handle-product", method= RequestMethod.POST)
    public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request){
        System.out.println(product);
        RedirectView view = new RedirectView();
        view.setUrl(request.getContextPath()+ "/");
        productService.saveProduct(product);
        return view;
    }

    @RequestMapping("/delete/{productId}")
    public RedirectView delete(@PathVariable("productId") long id, HttpServletRequest request){
        productService.deleteProduct(id);
        RedirectView view = new RedirectView();
        view.setUrl(request.getContextPath()+ "/");
        return view;
    }

    @RequestMapping("/update/{productId}")
    public String update(@PathVariable("productId") long id, Model m){
        Product product = productService.getById(id);
        m.addAttribute("product",product);
        return "update_product";
    }
//
//    @RequestMapping("/delete")
//    public String delete(){
//
//    }

}
