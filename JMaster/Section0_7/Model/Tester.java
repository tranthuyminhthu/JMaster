package model_Section07;

import java.util.Scanner;

public class Tester extends Person {
	private String testTool;

	public Tester(String id, String name, int age, String testTool) {
		super(id, name, age);
		this.testTool = testTool;
	}

	public Tester() {

	}

	public String getTestTool() {
		return testTool;
	}

	public void setTestTool(String testTool) {
		this.testTool = testTool;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Test Tool:");
		Scanner scanTool = new Scanner(System.in);
		testTool = scanTool.nextLine();
	}

	@Override
	public void info() {
		super.info();
		System.out.println(testTool);
	}

}
