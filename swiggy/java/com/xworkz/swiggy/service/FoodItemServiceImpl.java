package com.xworkz.swiggy.service;

import com.xworkz.swiggy.entity.FoodItemEntity;
import com.xworkz.swiggy.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {
	private FoodItemRepository repository;

	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave " + entity);
		if (entity != null) {
			this.repository.save(entity);
			System.out.println("entity is valid");
			
		} else {
			System.out.println("entity is not valid");
		}
		return false;
	}

}
