package model_Section07;

import java.util.Scanner;

public class Developer extends Person {
	private String language;

	public Developer(String id, String name, int age, String language) {
		super(id, name, age);
		this.language = language;
	}

	public Developer() {

	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;

	}

	public void input() {
		super.input();
		System.out.println("Nhap ngon ngu lap trinh : ");
		language = new Scanner(System.in).next();
	}

	public void info() {
		super.info();
		System.out.println("Ngon ngu lap trinh: " + this.language);

	}
}