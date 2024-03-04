package com.example.springmvc.services.impl;

import com.example.springmvc.daos.ProductRepository;
import com.example.springmvc.model.Product;
import com.example.springmvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean update(Long id) {
        System.out.println("service "+id);
        Product proToUpdate = null;

        if (id != null) {
            proToUpdate = productRepository.findById(id).orElseThrow();
        }
        productRepository.save(proToUpdate);
        return true;
        }


}