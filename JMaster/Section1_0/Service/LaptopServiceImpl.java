package service.Section10;

import java.util.Scanner;

import bt1.model.Section10.Laptop;

public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop lt) {

		Scanner scanCPU = new Scanner(System.in);
		System.out.println("Vui long nhap CPU: ");
		lt.setCPU(scanCPU.nextLine());
		Scanner scanRam = new Scanner(System.in);
		System.out.println("Vui long nhap Ram: ");
		lt.setRam(scanRam.nextLine());
		Scanner scanVGA = new Scanner(System.in);
		System.out.println("Vui long nhap VGA: ");
		lt.setVGA(scanVGA.nextLine());
	}

	@Override
	public void info(Laptop lt) {
		System.out.println("CPU: " + lt.getCPU());
		System.out.println("Ram: " + lt.getRam());
		System.out.println("VGA: " + lt.getVGA());

	}

}
