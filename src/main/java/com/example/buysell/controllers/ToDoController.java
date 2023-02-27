package com.example.buysell.controllers;

import com.example.buysell.models.ToDo;
import com.example.buysell.services.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService productService;

    @GetMapping("/")
    public String products(Model model) {
        model.addAttribute("todo", productService.listProducts());
        return "todo";
    }

    @GetMapping("/task/{id}")
    public String productInfo(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "todo-info";
    }

    @PostMapping("/task/create")
    public String createProduct(ToDo product) {
        productService.saveProduct(product);
        return "redirect:/";
    }

    @PostMapping("/task/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }
}
