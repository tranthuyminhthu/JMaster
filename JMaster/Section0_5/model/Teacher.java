package com.trungtamjava.model;

import java.util.Scanner;

public class Teacher {

	String id;
	String name;
	String address;
	String facility;

	public Teacher(String id, String name, String address, String facility) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.facility = facility;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public void input() {
		System.out.println("Please enter information of student");
		Scanner scanID = new Scanner(System.in);
		System.out.println("Enter ID:");
		id = scanID.nextLine();
		Scanner scanName = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = scanName.nextLine();
		Scanner scanAddress = new Scanner(System.in);
		System.out.println("Enter Address:");
		address = scanAddress.nextLine();
		Scanner scanFacility = new Scanner(System.in);
		System.out.println("Enter Facility: ");
		facility = scanFacility.nextLine();

	}

	public void info() {
		System.out.println("Infomation of teacher");
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(facility);
	}

}
