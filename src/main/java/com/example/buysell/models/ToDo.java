package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ToDo {
    private Long id;
    private String title;
    private String description;
}
