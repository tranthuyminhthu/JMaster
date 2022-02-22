package com.trungtamjava.main.section6;

import java.util.Scanner;

import com.trungtamjava.model.section6.School;

public class MainSchool {

	public static void main(String[] args) {
		System.out.println("Enter the numnber of student");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		School[] schools = new School[n];
		for (int i = 0; i < schools.length; i++) {
			schools[i] = new School(null, null, null);
			schools[i].input();
		}
		for (School school : schools) {
			school.infor();
		}
		System.out.println("------");
		System.out.println("find");
		String checkSchool = new Scanner(System.in).nextLine();
		for (School school : schools) {
			if (school.getSchoolName().contains(checkSchool)) {
				school.infor();
			}
		}
	}
}