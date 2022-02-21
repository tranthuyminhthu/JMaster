package com.trungtamjava.model;

public class Table {
	
	public String kind;
	public String color;
	public double widght;
	public double high;
	
	public Table(String kind, String color, double widght, double high) {

		this.kind = kind;
		this.color = color;
		this.widght = widght;
		this.high = high;
	}
	public Table () {
		
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWidght() {
		return widght;
	}
	public void setWidght(double widght) {
		this.widght = widght;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	

}
