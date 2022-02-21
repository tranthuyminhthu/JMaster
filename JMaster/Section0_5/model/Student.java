package com.trungtamjava.model;

import java.util.Scanner;

public class Student {

	String id;
	double core;
	String address;
	String major;

	public Student(String id, double core, String address, String major) {
		super();
		this.id = id;
		this.core = core;
		this.address = address;
		this.major = major;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCore() {
		return core;
	}

	public void setCore(double core) {
		this.core = core;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void input() {
		System.out.println("Please enter information of student:");
		Scanner scanID = new Scanner(System.in);
		System.out.println("Enter ID:");
		id = scanID.nextLine();
		Scanner scanCore = new Scanner(System.in);
		System.out.println("Enter Core:");
		core = scanCore.nextDouble();
		Scanner scanAddress = new Scanner(System.in);
		System.out.println("Enter Address:");
		address = scanAddress.nextLine();
		Scanner scanMajor = new Scanner(System.in);
		System.out.println("Enter Major:");
		major = scanMajor.nextLine();

	}

	public void infor() {
		System.out.println("Information of student:");
		System.out.println(id);
		System.out.println(core);
		System.out.println(address);
		System.out.println(major);
	}

}
