package com.example.demo.Persistance.Repository;

import com.example.demo.Persistance.Model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink,Long> {

}
