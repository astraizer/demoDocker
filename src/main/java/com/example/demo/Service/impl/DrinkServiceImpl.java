package com.example.demo.Service.impl;

import com.example.demo.Persistance.Model.Drink;
import com.example.demo.Persistance.Repository.DrinkRepository;
import com.example.demo.Service.DrinkService;
import com.example.demo.dto.request.AddDrinkDTO;
import com.example.demo.dto.response.DrinkDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DrinkServiceImpl implements DrinkService {

    @Autowired
    private Environment env;
    @Autowired
    private final DrinkRepository drinkRepository;

    public DrinkServiceImpl(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @Override
    public void addDrink(AddDrinkDTO dto) {
        Drink drink = new Drink(dto);
        drinkRepository.save(drink);

    }

    @Override
    public void deleteDrink(Long id) {
        drinkRepository.findById(id).ifPresent(drinkRepository::delete);
    }

    @Override
    public void updateDrink(Long id, AddDrinkDTO dto) {
        Drink drink = drinkRepository.findById(id).orElse(null);
        if(drink != null){
            drink.setName(dto.getName());
            drink.setPrice(dto.getPrice());
            drinkRepository.save(drink);
        }
    }

    @Override
    public List<DrinkDTO> getDrink() {
        log.info("port: {}",env.getProperty("server.port"));
        List<Drink> drinks = drinkRepository.findAll();
        List<DrinkDTO> dtos = new ArrayList<>();
        drinks.forEach(drink -> {
            DrinkDTO dto = new DrinkDTO(drink.getId(),drink.getName(), drink.getPrice());
            dtos.add(dto);
        });
        return dtos;
    }
}
