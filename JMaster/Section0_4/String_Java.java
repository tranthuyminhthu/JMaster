package Section0_4;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class String_Java {

	public static void main(String[] args) {

		// string1
		System.out.println("Nhap string1: ");
		Scanner scan = new Scanner(System.in);
		String string1 = scan.nextLine();

		// in do dai string1
		System.out.println(string1.length());
		// string
		System.out.println("Nhap string: ");
		String string = scan.nextLine();

		// kiem tra string co trong string 1
		int index = string1.indexOf(string);
		System.out.println(index);

		int count = 0;
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) == 'A') {
				count++;
			}
		}
		System.out.println("Chuoi string co: " + count + " ki tu 'A'");

		// tach chuoi string dung split
		String[] str = string1.split("\\s+");
		for (String x : str) {

			System.out.println("tach chuoi string1: " + x);
		}
	}
}