package com.jsp.constructor_injection;

public class Car {

	int id;
	String name;
	String brand;

	Car(int id, String name, String brand) {
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public void print() {
		System.out.println("Car id    : " + id);
		System.out.println("Car name  : " + name);
		System.out.println("Car brand : " + brand);
	}

}
