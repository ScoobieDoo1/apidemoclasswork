package com.practice.apidemo.model;

public class Car {

    private String Color;
    private String Brand;
    private double Price;
    
    
	public Car() {
		
	}
	public Car(String color, String brand, double price) {
		
		Color = color;
		Brand = brand;
		Price = price;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
    
}
