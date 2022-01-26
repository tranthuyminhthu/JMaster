package Section0_3;

import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {

		System.out.println("Vui long nhap so phan tu cua mang");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mang[];
		mang = new int[n];

		System.out.println("Vui long nhap cac phan tu cua mang: ");
		for (int i = 0; i < mang.length; i++) {
			mang[i] = scan.nextInt();

		}

		System.out.println("Mang duoc nhap vao la: ");
		for (int x : mang) {
			System.out.println(x);
		}
		
		// tinh tich cac phan tu trong mang
		int tich = 1;
		for (int i = 0; i < mang.length; i++) {
			tich *= mang[i];
		}
		
		// tinh tong cac phan tu trong mang
		int tong = 0;
		for (int i = 0; i < mang.length; i++) {
			tong += mang[i];

		}
		System.out.println("Tong gia tri trong mang la: " + tong);
		System.out.println("Tich gia tri trong mang la: " + tich);

		// sap xep tang dan
		for (int i = 0; i < mang.length - 1; i++) {
			int temp = mang[i];
			for (int j = i + 1; j < mang.length; j++) {
				if (temp > mang[j]) {
					mang[i] = mang[j];
					mang[j] = temp;
					temp = mang[i];
				}

			}

		}
		System.out.println("Mang duoc sap xep tang dan la: ");
		for (int x : mang) {
			System.out.println(x);
		}

		// sap xep giam dan
		for (int i = 0; i < mang.length - 1; i++) {
			int temp = mang[i];
			for (int j = i + 1; j < mang.length; j++) {
				if (temp < mang[j]) {
					mang[i] = mang[j];
					mang[j] = temp;
					temp = mang[i];

				}

			}
		}
		System.out.println("Mang duoc sap xep giam dan la: ");
		for (int x : mang) {
			System.out.println(x);
		}

		// tim max cua mang
		int max = 0;
		for (int i = 0; i < mang.length; i++) {
			if (i == 0) {
				max = mang[i];
			} else if (mang[i] > max) {
				max = mang[i];

			}
		}

		// tim min cua mang
		int min = 0;
		for (int i = 0; i < mang.length; i++) {
			if (i == 0) {
				min = mang[i];
			} else if (mang[i] < min) {
				min = mang[i];

			}
		}
		System.out.println("Gia tri max cua mang la: " + max);
		System.out.println("Gia tri min cua mang la: " + min);
	}

}
