package model_Section07;

import java.util.Scanner;

public class Leader extends Person {
	private int teamSize;

	public Leader(String id, String name, int age, int teamSize) {
		super(id, name, age);
		this.teamSize = teamSize;
	}

	public Leader() {

	}

	public int getteamSize() {
		return teamSize;
	}

	public void setYearsOfExperience(int teamSize) {
		this.teamSize = teamSize;

	}

	@Override
	public void input() {
		super.input();
		System.out.println("Team Size:");
		Scanner scanYear = new Scanner(System.in);
		teamSize = scanYear.nextInt();
	}

	public static final double luongCoBan = 10000000;
		
	@Override
	public void info() {
		super.info();
		System.out.println("So thanh vien: " + this.teamSize);
		if (this.getteamSize() > 10) {
			System.out.println("Luong co ban: " + luongCoBan * 0.5);
		} else {
			System.out.printf("Luong co ban: "+ luongCoBan * 0,1);;
		}
	}
}
