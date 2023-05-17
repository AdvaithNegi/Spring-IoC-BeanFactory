package com.jsp.setter_injection;

public class Pen {

	private int price;
	private String brand;
	private String name;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Pen() {
		System.out.println("Pen Object is Created by spring");
	}

	public void wite() {
		System.out.println("Pen is working completely fine");
	}

}
