package model_Section07;

import java.util.Scanner;

public class Person {
	private String id;
	private String name;
	private int age;

	public Person(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void input() {
		System.out.println("Nhap thong tin:");
		Scanner scanId = new Scanner(System.in);
		System.out.println("ID:");
		id = scanId.nextLine();
		Scanner scanName = new Scanner(System.in);
		System.out.println("Name:");
		name = scanName.nextLine();
		Scanner scanAge = new Scanner(System.in);
		System.out.println("Age:");
		age = scanAge.nextInt();
	}

	public void info() {
		System.out.println("ID: " +this.id);
		System.out.println("Name:" +this.name);
		System.out.println("Age: " +this.age);
	}

}
