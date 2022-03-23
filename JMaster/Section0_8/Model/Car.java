package model_Section08;

import java.util.Scanner;

public class Car {
	private String color;
	private String madeIn;
	private Person person;
	public Car(String color, String madeIn, Person person) {
		super();
		this.color = color;
		this.madeIn = madeIn;
		this.person = person;
	}
	public Car() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
    public void  input () {
    System.out.println("Xe: ");
	Scanner scanColor = new Scanner (System.in);	
	System.out.println("Mau sac: ");
	color = scanColor.nextLine();
	Scanner scanMade = new Scanner (System.in);	
	System.out.println("San xuat tai: ");
	madeIn= scanMade.nextLine();
    }
    public void info() {
    	System.out.println("Thong tin xe" + "\n" +  "Mau sac: "+ color + "\n" + "San xuat tai: " +madeIn);
    }
}
