package com.trungtamjava.main;

import com.trungtamjava.model.Chair;
import com.trungtamjava.model.Laptop;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Table;

public class Main {
	public static void main(String[] args) {
	// Chair
		Chair c1 = new Chair();
		Chair c2 = new Chair("G2S", "Red", "Viet Nam:");

		System.out.println(c1.color);
		System.out.println(c1.getColor());
		c1.color = "Black";
		c1.setColor("Green");
		System.out.println(c1.getColor());

	// Table
	   Table t1 = new Table ();
	   Table t2 = new Table ("Ghe van phong", "Black", 100, 60);
	   t1.color = "White";
	   t1.setColor("Black");
	   System.out.println(t1.color);
	   System.out.println(t1.getColor());
	   
	// Laptop
	   Laptop l1 = new Laptop ();
	   Laptop l2 = new Laptop ("Acer", 2018, "Silver", 21);
	   l1.model = "HP";
	   l1.setModel("Asus");
	   System.out.println(l1.model);
	   System.out.println(l1.getModel());
	 
	// Person
	   Person p1 = new Person ();
	   Person p2 = new Person ("Peter", 40, 1970, "TP Ho Chi Minh");
	   p1.placeOfBirth = "Ben Tre";
	   p1.setPlaceOfBirth("Tien Giang");
	   System.out.println(p1.placeOfBirth);
	   System.out.println(p1.getPlaceOfBirth());
}
}