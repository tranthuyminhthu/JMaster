package main_Section08;

import model_Section08.Car;
import model_Section08.House;
import model_Section08.Person;

public class MainPerson {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.input();

		House[] h1 = new House[2];
		Car[] c1 = new Car[2];
		for (int i = 0; i < h1.length; i++) {
			h1[i] = new House();
			h1[i].input();
			h1[i].setPerson(p1);
		}
		
		for (int j = 0; j < c1.length; j++) {
			c1[j] = new Car();
			c1[j].input();
			c1[j].setPerson(p1);
		}
		for (House house : h1) {
			house.info();
			house.getPerson().info();
		}
		for (Car car : c1) {
			car.info();
			car.getPerson().info();
		}
	}

}
