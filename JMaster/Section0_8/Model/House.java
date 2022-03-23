package model_Section08;

import java.util.Scanner;

public class House {
	private double area;
	private Person person;
	
	public House () {
	
	}
	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	public void input() {
		Scanner scanArea = new Scanner (System.in);	
		System.out.println("Nhap dien tich: ");
		area = scanArea.nextInt();
		
	}
	public void info () {
		System.out.println("Dien tich can nha: "+ area);
	}
	

}
