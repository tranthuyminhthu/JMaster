package main_Section08;

import java.util.Scanner;

import model.BT2.Section08.National;
import model.BT2.Section08.Person;

public class MainNational {
	public static void main(String[] args) {
		National n1 = new National();
		n1.input();

		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap n: ");
		int n = scan.nextInt();

		Person[] p1 = new Person[n];

		for (int i = 0; i < p1.length; i++) {
			p1[i] = new Person();
			p1[i].input();
			p1[i].setNational(n1);
			;
		}
		for (Person p : p1) {
			p.info();
			p.getNational().info();

		}
	}

}
