package Section0_3;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		System.out.println("Moi ban lua chon goi cau hoi");
		System.out.println("1.Tu nhien \t 2.Xa hoi");
		Scanner scan = new Scanner(System.in);
		String luaChon = scan.nextLine();

		while (true) {
			if (luaChon.equals("1")) {
				System.out.println("Pha ban dau cho phep xac dinh ?");
				System.out.println("\n A. Trang thai cua dao dong thoi diem ban dau \n B. Van toc cua dao dong o thoi diem t bat ki \n C. Li do cua dao dong o thoi diem t bat ki \n D. Gia toc cua dao dong o thoi diem t bat ki");
	
				String dapAn = scan.nextLine();
				switch (dapAn.charAt(0)) {
				case 'A':
					System.out.println("Ban tra loi dung");
					break;
				case 'B':
				case 'C':
				case 'D':
					System.out.println("Ban tra loi sai");
					break;
				default:
					System.out.println("Vui long nhap lai lua chon");
					break;
				}

			} else if (luaChon.equals("2")) {
				System.out.println("Nuoc nao duoi day khong thuoc khu vuc Dong Bac A ?");
				System.out.println("\n A. Nhat Ban \n B. Han Quoc \n C. Trung Quoc \n D. Singapore");
				
				String dapAn = scan.nextLine();
				switch (dapAn.charAt(0)) {
				case 'D':
					System.out.println("Ban tra loi dung");
					break;
				case 'B':
				case 'C':
				case 'A':
					System.out.println("Ban tra loi sai");
					break;
				default:
					System.out.println("Vui long nhap lai lua chon");
				}
			} else {
				System.out.println("Vui long chon goi cau hoi");
				break;

			}
			System.out.println("Ket thuc chuong trinh");

		}
	}
}
