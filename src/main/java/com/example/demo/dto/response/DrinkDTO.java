package com.example.demo.dto.response;

import lombok.Data;

@Data
public class DrinkDTO {
    private Long id;
    private String name;
    private Double price;

    public DrinkDTO(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
