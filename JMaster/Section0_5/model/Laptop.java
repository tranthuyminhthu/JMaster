package com.trungtamjava.model;

public class Laptop {

	public String model;
	public int yearOfPublication;
	public String color;
	public double size;

	public Laptop(String model, int yearOfPublication, String color, double size) {

		this.model = model;
		this.yearOfPublication = yearOfPublication;
		this.color = color;
		this.size = size;
	}

	public Laptop() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
}
