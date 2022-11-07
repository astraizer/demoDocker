package com.example.demo.Controller;

import com.example.demo.Service.DrinkService;
import com.example.demo.dto.request.AddDrinkDTO;
import com.example.demo.dto.response.DrinkDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/drink")
@Slf4j
public class DrinkController {

    @Autowired
    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping()
    public ResponseEntity<List<DrinkDTO>> getDrink(){
        return ResponseEntity.ok().body(drinkService.getDrink());
    }

    @PostMapping
    public ResponseEntity<Void> createDrink(@RequestBody AddDrinkDTO dto){
        drinkService.addDrink(dto);
        return ResponseEntity.created(URI.create("/category")).build();
    }

}
