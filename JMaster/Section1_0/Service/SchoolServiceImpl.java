package service.Section10;

import java.util.Scanner;

import bt1.model.Section10.School;

public class SchoolServiceImpl implements SchoolService {

	@Override
	public void input(School sch) {
		System.out.println("Nhap ID School: ");
		Scanner scanID = new Scanner(System.in);
		sch.setId(scanID.nextInt());
		System.out.println("Nhap School: ");
		Scanner scanName = new Scanner(System.in);
		sch.setName(scanName.nextLine());
	}

	@Override
	public void info(School sch) {
		System.out.println("ID School: " + sch.getId());
		System.out.println("Ten School: " + sch.getName());
	}

}
