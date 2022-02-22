package com.trungtamjava.model.section6;

import java.util.Scanner;

public class School {
	private String id;
	private String schoolName;
	private String address;

	public School(String id, String schoolName, String address) {

		this.id = id;
		this.schoolName = schoolName;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void input() {
		Scanner scanID = new Scanner(System.in);
		System.out.println("Enter ID:");
		setId(scanID.nextLine());

		Scanner scanSchoolName = new Scanner(System.in);
		System.out.println("Enter School Name:");
		setSchoolName(scanSchoolName.nextLine());

		Scanner scanAddress = new Scanner(System.in);
		System.out.println("Enter Address:");
		setAddress(scanAddress.nextLine());
	}

	public void infor() {
		System.out.println(id);
		System.out.println(schoolName);
		System.out.println(address);
	}

}
