package com.trungtamjava.model;

public class Chair {
	
	public String model;
	public String color;
	public String madeIn;
	
	public Chair(String model, String color, String madeIn) {
		
		this.model = model;
		this.color = color;
		this.madeIn = madeIn;
	}
	public Chair () {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
}
