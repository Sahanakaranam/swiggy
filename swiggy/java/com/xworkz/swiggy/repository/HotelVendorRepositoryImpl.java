package com.xworkz.swiggy.repository;

import com.xworkz.swiggy.entity.HotelVendorEntity;

public class  HotelVendorRepositoryImpl implements HotelVendorRepository{
	public HotelVendorRepositoryImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save" + entity );
		
	}

}
