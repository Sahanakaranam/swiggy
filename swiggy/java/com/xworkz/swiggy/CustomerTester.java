package com.xworkz.swiggy;

import com.xworkz.swiggy.entity.CustomerEntity;
import com.xworkz.swiggy.repository.CustomerRepository;
import com.xworkz.swiggy.repository.CustomerRepositoryImpl;
import com.xworkz.swiggy.service.CustomerService;
import com.xworkz.swiggy.service.CustomerServiceImpl;

public class CustomerTester {
	public static void main(String[] args) {

		CustomerEntity entity = new CustomerEntity("sahana", "Rajajinagar", 87924790, 5, 30, "sahana@gmail.com");
		CustomerEntity entity2 = new CustomerEntity("nikitha", "Rajajinagar", 96636681, 5, 17,
				"niki@gmail.com");

		CustomerRepository repository = new CustomerRepositoryImpl();
		repository.save(entity);
	

		CustomerService service = new CustomerServiceImpl(repository);
		service.validateAndSave(entity);
		service.validateAndSave(entity2);
		
	}

}
