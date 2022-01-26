package Section0_2;
import java.util.Scanner;

public class CauHoiTracNghiem {

	public static void main(String[] args) {

		System.out.println("OOP co may tinh chat ?");
		System.out.println("A. 3" + "\n" + "B. 5" + "\n" + "C. 4" + "\n" + "D. 7");
		Scanner scan = new Scanner(System.in);
		String luaChon = scan.nextLine();

		switch (luaChon.charAt(0)) {

		case 'A':
		case 'B':
		case 'D':
			System.out.println("Ban lua chon sai");
			break;
		case 'C':
			System.out.println("Ban lua chon dung");
			break;
		default:
			System.out.println("Lua chon cua ban khong phu hop");
			System.out.println("Chuong trinh ket thuc");
		}

	}

}
