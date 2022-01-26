package Section0_2;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap 3 so a, b, c:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a == 0) {
			System.out.println("Phuong trinh co nghiem la:" + (-c / b));

		} else {

			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");

			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem kep:");
				double x = -b / 2 * a;
				System.out.println("x= " + x);

			} else {
				double x1 = (-b - Math.sqrt(delta) / 2 * a);
				double x2 = (-b - Math.sqrt(delta) / 2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("x1= " + x1);
				System.out.println("x2= " + x2);

			}
		}

	}

}
