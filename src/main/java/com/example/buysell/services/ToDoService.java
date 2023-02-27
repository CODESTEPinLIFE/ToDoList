package com.example.buysell.services;

import com.example.buysell.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private List<ToDo> products = new ArrayList<>();
    private long ID = 0;


    public List<ToDo> listProducts() { return products; }

    public void saveProduct(ToDo product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public ToDo getProductById(Long id) {
        for (ToDo product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
