package Section0_2;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap a, b, c");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double max = (b > a) ? b : a;
		max = (max > c) ? max : c;

		double min = (b < a) ? b : a;
		min = (min < c) ? min : c;

		System.out.println("Gia tri max:" + max);
		System.out.println("Gia tri min:" + min);

	}

		
	
}
