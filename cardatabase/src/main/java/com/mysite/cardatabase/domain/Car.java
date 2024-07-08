package com.mysite.cardatabase.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String brand, model, color, registerNumber;
	
	@Column(name="`year`")
	private int year;
	private int price;
	
	public Car() {
		
	}

	public Car(String brand, String model, String color, String registerNumber, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
	}
	
	
}
