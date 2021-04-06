package com.xworkz.swiggy.repository;

import com.xworkz.swiggy.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	public CustomerRepositoryImpl() {
		System.out.println("created" + this.getClass().getName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" + entity);
	}

}
