package com.example.demo.Persistance.Repository;

import com.example.demo.Persistance.Model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {

}
