package com.xworkz.swiggy;

import com.xworkz.swiggy.constants.VendorType;
import com.xworkz.swiggy.entity.HotelVendorEntity;
import com.xworkz.swiggy.repository.HotelVendorRepository;
import com.xworkz.swiggy.repository.HotelVendorRepositoryImpl;
import com.xworkz.swiggy.service.HotelVendorService;
import com.xworkz.swiggy.service.HotelVendorServiceImpl;

public class HotelVendorTester {
	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Raj Grand", "bangalore", 5, 879247905l,
				VendorType.BIGBASKET, "rajajinagar", "raj@gmail.com");

		HotelVendorRepository repository = new HotelVendorRepositoryImpl();
		repository.save(entity);
		HotelVendorService vendorService = new HotelVendorServiceImpl(repository);
		vendorService.validateAndSave(entity);
	}

}
