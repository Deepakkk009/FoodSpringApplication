package com.food.foodspringApp.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.foodspringApp.dto.FoodOrder;
import com.food.foodspringApp.reposetory.FoodOrderRepo;
import com.food.foodspringApp.reposetory.IteamRepo;

@Repository
public class FoodOrderDao {
	@Autowired
	FoodOrderRepo foodOrderRepo;

	@Autowired
	IteamRepo iteamRepo;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
		 
	}

	public Optional<FoodOrder> getFoodOrderById(int id) {
		return foodOrderRepo.findById(id);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return foodOrderRepo.findAll();
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepo.save(foodOrder);
	}

	public void deleteFoodOrder(int id) {
		foodOrderRepo.deleteById(id);
	}

}

