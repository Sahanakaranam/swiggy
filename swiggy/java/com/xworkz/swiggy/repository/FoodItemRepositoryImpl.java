package com.xworkz.swiggy.repository;

import com.xworkz.swiggy.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	public FoodItemRepositoryImpl() {
		System.out.println("create " + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save" + entity);

	}

}
