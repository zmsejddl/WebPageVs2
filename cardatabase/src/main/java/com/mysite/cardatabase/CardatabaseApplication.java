package com.mysite.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysite.cardatabase.domain.Car;
import com.mysite.cardatabase.domain.CarRepository;

@SpringBootApplication
public class CardatabaseApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	

}
