package com.example.springmvc.services;

import com.example.springmvc.model.Product;
import com.example.springmvc.model.User;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);
    public void deleteProduct(Long id);
    public Product getById(Long id);
    public List<Product> getAll();
    public boolean update(Long id);


}
