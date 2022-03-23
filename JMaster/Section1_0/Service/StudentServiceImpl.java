package service.Section10;

import java.util.Scanner;

import bt1.model.Section10.Address;
import bt1.model.Section10.School;
import bt1.model.Section10.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void input(Student st) {
		System.out.println("Nhap id:");
		Scanner scanID = new Scanner(System.in);
		st.setId(scanID.nextInt());
		System.out.println("Nhap ten:");
		Scanner scanName = new Scanner(System.in);
		st.setName(scanName.nextLine());
		System.out.println("Nhap tuoi:");
		Scanner scanAge = new Scanner(System.in);
		st.setAge(scanAge.nextInt());

		School sch = new School();
		SchoolServiceImpl schimpl = new SchoolServiceImpl();
		schimpl.input(sch);

		Address ad = new Address();
		AddressServiceImpl addimpl = new AddressServiceImpl();
		addimpl.input(ad);

		st.setSchool(sch);
		st.setAddress(ad);
	}

	@Override
	public void info(Student st) {
		System.out.println("ID: " + st.getId());
		System.out.println("Ten: " + st.getName());
		System.out.println("Tuoi: " + st.getAge());

		if (st.getSchool() != null) {
			SchoolServiceImpl a = new SchoolServiceImpl();
			a.info(st.getSchool());
		}
		if (st.getAddress() != null) {
			AddressServiceImpl a = new AddressServiceImpl();
			a.info(st.getAddress());
		}
	}

}
