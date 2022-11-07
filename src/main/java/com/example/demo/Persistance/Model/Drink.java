package com.example.demo.Persistance.Model;

import com.example.demo.dto.request.AddDrinkDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    public Drink(AddDrinkDTO dto) {
        this.name = dto.getName();
        this.price = dto.getPrice();
    }

    public Drink() {
    }
}
