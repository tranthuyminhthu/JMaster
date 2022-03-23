package model_Section08;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String country;
	private House [] house;
	private Car [] car;

	
	public Person() {

	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public House[] getHouse() {
		return house;
	}


	public void setHouse(House[] house) {
		this.house = house;
	}


	public Car[] getCar() {
		return car;
	}


	public void setCar(Car[] car) {
		this.car = car;
	}


	public void input () {
		System.out.println("Nhap thong tin: ");
		System.out.println("Nhap ten: ");
		Scanner scanName = new Scanner (System.in);
		name = scanName.nextLine();
		System.out.println("Nhap tuoi: ");
		Scanner scanAge = new Scanner (System.in);
		age = scanAge.nextInt();
		System.out.println("Nhap quoc tich: ");
		Scanner scanCountry = new Scanner (System.in);
		country = scanCountry.nextLine();
		
	}
	public void info() {
		 System.out.println(this.getName());
		 System.out.println(this.age);
		 System.out.println(this.country);
	}

}
