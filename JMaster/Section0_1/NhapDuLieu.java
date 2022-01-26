package Section0_1;

import java.util.Scanner;

public class NhapDuLieu {

	public static void main(String[] args) {

		// Hinh vuong
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap gia tri canh hinh vuong a :");

		int a = scan.nextInt();

		System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuViHinhVuong(a));
		System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTichHinhVuong(a));

		// Hinh chu nhat
		System.out.println("Nhap gia tri chieu dai x:");

		int x = scan.nextInt();

		System.out.println("Nhap gia tri chieu rong y:");

		int y = scan.nextInt();

		System.out.println("Chu vi hinh chu nhat: " + HinhChuNhat.chuViHinhChuNhat(x, y));
		System.out.println("Dien tich hinh chu nhat: " + HinhChuNhat.dienTichHinhChuNhat(x, y));

		// Hinh tron
		System.out.println("Nhap ban kinh hinh tron:");

		int banKinh = scan.nextInt();

		System.out.println("Chu vi hinh tron la:" + HinhTron.chuViHinhTron(banKinh));
		System.out.println("Dien tich hinh tron la: " + HinhTron.dienTichHinhTron(banKinh));

		// Tam giac vuong
		System.out.println("Nhap hai canh goc vuong cv1, cv2 va duong cao h ");

		int cv1 = scan.nextInt();
		int cv2 = scan.nextInt();
		int h = scan.nextInt();

		System.out.println("Chu vi tam giac vuong la: " + TamGiacVuong.chuViTamGiacVuong(cv1, cv2, h));
		System.out.println("Dien tich tam giac vuong la: " + TamGiacVuong.dienTichTamGiacVuong(cv2, h));

		// Tong hai so
		System.out.println("Nhap gia tri a1 va b1");

		int a1 = scan.nextInt();
		int b1 = scan.nextInt();

		System.out.println("Tong hai so a1 va b1 la:" + TinhToan.Tong(a1, b1));

		// Hieu hai so
		System.out.println("Nhap gia tri a2 va b2");

		int a2 = scan.nextInt();
		int b2 = scan.nextInt();

		System.out.println("Hieu hai so a2 va b2 la:" + TinhToan.Hieu(a2, b2));

		// Thuong hai so
		System.out.println("Nhap hai so a3 va b3");

		int a3 = scan.nextInt();
		int b3 = scan.nextInt();

		System.out.println("Thuong hai so a3 va b3 la: " + TinhToan.Thuong(a3, b3));

		// Tich hai so
		System.out.println("Nhap gia tri a4 va b4");

		int a4 = scan.nextInt();
		int b4 = scan.nextInt();

		System.out.println("Tich hai so a4 va b4 la:" + TinhToan.Tich(a4, b4));

	}

}
