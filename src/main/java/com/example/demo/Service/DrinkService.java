package com.example.demo.Service;

import com.example.demo.Persistance.Model.Drink;
import com.example.demo.dto.request.AddDrinkDTO;
import com.example.demo.dto.response.DrinkDTO;

import java.util.List;

public interface DrinkService {

    void addDrink(AddDrinkDTO dto);
    void deleteDrink(Long id);
    void updateDrink(Long id,AddDrinkDTO dto);
    List<DrinkDTO> getDrink();
}
