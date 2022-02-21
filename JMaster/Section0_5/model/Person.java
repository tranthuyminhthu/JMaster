package com.trungtamjava.model;

public class Person {

	public String name;
	public int age;
	public int yearOfBirth;
	public String placeOfBirth;

	public Person(String name, int age, int yearOfBirth, String placeOfBirth) {

		this.name = name;
		this.age = age;
		this.yearOfBirth = yearOfBirth;
		this.placeOfBirth = placeOfBirth;
	}

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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

}
