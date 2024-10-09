package com.compassuol.course.services;

import com.compassuol.course.entities.Product;
import com.compassuol.course.entities.User;
import com.compassuol.course.repositories.ProductRepository;
import com.compassuol.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> user = productRepository.findById(id);
        return user.get();
    }
}
