package com.food.foodspringApp.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodspringApp.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer>{

}
