package com.trungtamjava.model.section6;

import java.util.Scanner;

public class Student {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void input() {
		Scanner scanID = new Scanner(System.in);
		System.out.println("Enter ID:");
		setId(scanID.nextInt());

		Scanner scanName = new Scanner(System.in);
		System.out.println("Enter Name:");
		setName(scanName.nextLine());

		Scanner scanAge = new Scanner(System.in);
		System.out.println("Enter Age:");
		setAge(scanAge.nextInt());
	}

	public void infor() {
		System.out.println("Information of student: ");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age:" + age);
	}

}
