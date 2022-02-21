package com.trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
	private String id;
	private String name;
	private double score;

	public CourseScore(String id, String name, double score) {
		this.id = id;
		this.name = name;
		this.score = score;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void input() {
		System.out.println("Please enter id + name + score:");
		Scanner scanID = new Scanner(System.in);
		System.out.println("Enter ID:");
		id = scanID.nextLine();
		Scanner scanName = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = scanName.nextLine();
		Scanner scanScore = new Scanner(System.in);
		System.out.println("Enter Score:");
		score = scanScore.nextDouble();

	}

	public void info() {
		System.out.println("Information of Student:");
		System.out.println(id);
		System.out.println(name);
		if (score < 5) {
			System.out.println("Hoc sinh yeu");
		} else if (score >= 5 && score < 7) {
			System.out.println("Hoc sinh trung binh");
		} else if (score >= 7 && score < 8) {
			System.out.println("Hoc sinh kha");
		} else if (score >= 8 && score < 9) {
			System.out.println("Hoc sinh gioi");
		} else {
			System.out.println("Hoc sinh xuat sac");

		}
	}

}
