package main_Section08;

import java.util.Scanner;

import model.BT2.Section08.Category;
import model.BT2.Section08.Product;

public class MainCategory {
	public static void main(String[] args) {
		Category c1 = new Category();
		c1.input();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap n:");
		int n = scan.nextInt();
		Product[] p1 = new Product[n];

		for (int i = 0; i < p1.length; i++) {
			p1[i] = new Product();
			p1[i].input();
			p1[i].setCategory(c1);
		}
		
		for (Product p : p1) {
			p.getCategory().info();
			p.info();
		}

	}
}
