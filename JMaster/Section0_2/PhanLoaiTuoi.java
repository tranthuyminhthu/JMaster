package Section0_2;

import java.util.Scanner;

public class PhanLoaiTuoi {

	public static void main(String[] args) {

		System.out.println("Nhap so tuoi ban muon phan loai:");

		Scanner scan = new Scanner(System.in);
		tuoi(scan.nextInt());
	}

	public static void tuoi(int tuoi) {

		if (tuoi < 1) {
			System.out.println("Tre so sinh");

		} else if (tuoi >= 1 && tuoi <= 3) {
			System.out.println("Em be");

		} else if (tuoi > 3 && tuoi < 18) {
			System.out.println("Tre em");

		} else if (tuoi >= 18 && tuoi <= 40) {
			System.out.println("Nguoi lon");

		} else if (tuoi > 40 && tuoi < 60) {
			System.out.println("Trung nien");

		} else if (tuoi == 60) {
			System.out.println("Nguoi gia");

		} else {
			System.out.println("Null");
			System.out.println("Chuong trinh ket thuc");

		}

	}

}
