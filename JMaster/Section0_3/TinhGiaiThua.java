package Section0_3;

import java.util.Scanner;

public class TinhGiaiThua {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap gia tri n: ");
		int n = scan.nextInt();
		giaiThua(n);
		int DQ = deQuy(n);
		System.out.println("De quy Java:" + DQ);
	}

// dung vong lap for yinh gia thua n!
	public static void giaiThua(int n) {
		int ketQua = 1;
		for (int i = 1; i <= n; i++) {
			ketQua = ketQua * i;
		}

		System.out.println("Giai thua la: " + ketQua);

	}

// dung de quy Java tinh giai thua n!
	public static int deQuy(int n) {
		if (n > 0) {
			return n * deQuy(n - 1);
		} else {
			return 1;
		}

	}
}
