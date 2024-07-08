package com.mysite.cardatabase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.cardatabase.domain.Car;
import com.mysite.cardatabase.domain.CarRepository;

@SpringBootTest
class CardatabaseApplicationTests {

	@Autowired
	private CarRepository repository;
	
	@Test
	void contextLoads() {
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
		repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));
	}

}
