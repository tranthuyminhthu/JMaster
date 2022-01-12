package Section0_1;

import java.util.Scanner;

/**
 * 
 * @author MINH THU-PC
 *
 */
public class Main_ThuVienMath {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("Nhap gia tri a");
		int a = scan.nextInt();
		
		// Can bac 2 
		System.out.println("Can bac hai cua a la:"+ ThuVienMath.CanBac2(a));
		
		// Binh phuong
		System.out.println("Binh phuong cua a la:"+ ThuVienMath.BinhPhuong(a));
		
		// Pi
		System.out.println("Pi nhan voi a la: "+ ThuVienMath.Pi(a));
		
	}

}
