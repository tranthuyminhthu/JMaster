package com.trungtamjava.main.section6;

import java.util.Scanner;

import com.trungtamjava.model.section6.Student;

public class MainStudent {

	public static void main(String[] args) {
		System.out.println("Enter the numer of student:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Student[] students = new Student[n];

		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i + 1));
			students[i] = new Student(i, null, i);
			students[i].input();
		}
		System.out.println("Sap xep tang dan theo tuoi3 : ");
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i].getAge() > students[j].getAge()) {
					Student temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
		for (Student student : students) {
			student.infor();
		}
		System.out.println("Sinh vien tuoi lon nhat : ");

		for (int i = 0; i <= students.length; i++) {
			if (students[i].getAge() == students[students.length - 1].getAge()) {
				students[i].infor();
			}
		}
	}
}
