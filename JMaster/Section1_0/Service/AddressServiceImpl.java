package service.Section10;

import java.util.Scanner;

import bt1.model.Section10.Address;

public class AddressServiceImpl implements AddressService {

	@Override
	public void input(Address ad) {

		System.out.println("Nhap ID Street: ");
		Scanner scanID = new Scanner(System.in);
		ad.setId(scanID.nextInt());
		System.out.println("Nhap Street:");
		Scanner scanStreet = new Scanner(System.in);
		ad.setStreet(scanStreet.nextLine());
		System.out.println("Nhap City: ");
		Scanner scanCity = new Scanner(System.in);
		ad.setCity(scanCity.nextLine());

	}

	@Override
	public void info(Address ad) {
		System.out.println("ID Address: " + ad.getId());
		System.out.println("Street: " + ad.getStreet());
		System.out.println("City: " + ad.getCity());
	}
}