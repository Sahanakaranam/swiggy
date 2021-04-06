package com.xworkz.swiggy;

import com.xworkz.swiggy.constants.FoodType;
import com.xworkz.swiggy.entity.FoodItemEntity;
import com.xworkz.swiggy.repository.FoodItemRepository;
import com.xworkz.swiggy.repository.FoodItemRepositoryImpl;
import com.xworkz.swiggy.service.FoodItemService;
import com.xworkz.swiggy.service.FoodItemServiceImpl;

public class FoodDeliveryTester {
	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("curdRice", 70.0, 2, FoodType.CHINEESE, 5, true, "NA", 1, 1, "white");

		FoodItemRepository repository = new FoodItemRepositoryImpl();
		repository.save(entity);
		FoodItemService service = new FoodItemServiceImpl(repository);
		service.validateAndSave(entity);
	
	}

}
