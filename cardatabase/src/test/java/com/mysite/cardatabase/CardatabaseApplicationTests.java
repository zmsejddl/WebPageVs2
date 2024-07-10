package com.mysite.cardatabase;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.cardatabase.domain.Car;
import com.mysite.cardatabase.domain.CarRepository;
import com.mysite.cardatabase.domain.Owner;
import com.mysite.cardatabase.domain.OwnerRepository;

@SpringBootTest
class CardatabaseApplicationTests {

	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Test
	void contextLoads() {
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1, owner2));
		
//		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
//		repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
//		repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));
		
		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner2);
		Car car3 = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2);
		repository.saveAll(Arrays.asList(car1, car2, car3));
		
		
	}

}
