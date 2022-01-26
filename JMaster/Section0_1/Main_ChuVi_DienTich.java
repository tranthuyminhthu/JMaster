package Section0_1;

public class Main_ChuVi_DienTich {

	public static void main(String[] args) {

		// Hinh vuong

		double a = 9; // canh hinh vuong

		System.out.print("Chu vi hinh vuong la:");
		System.out.println(HinhVuong.chuViHinhVuong(a));

		System.out.print("Dien tich hinh vuong la:");
		System.out.println(HinhVuong.dienTichHinhVuong(a));

		// Hinh chu nhat

		double x = 6;
		double y = 10;

		System.out.print("Chu vi hinh chu nhat la:");
		System.out.println(HinhChuNhat.chuViHinhChuNhat(x, y));

		System.out.print("Dien tich hinh chu nhat la:");
		System.out.println(HinhChuNhat.dienTichHinhChuNhat(x, y));

		// Hinh tron

		double r = 7;

		System.out.print("Chu vi hinh tron la: ");
		System.out.println(HinhTron.chuViHinhTron(r));

		System.out.print("Dien tich hinh tron la: ");
		System.out.println(HinhTron.dienTichHinhTron(r));

		// Tam giac vuong

		double e = 3;
		double f = 4;
		double g = 5;

		System.out.print("Chu vi tam giac vuong la: ");
		System.out.println(TamGiacVuong.chuViTamGiacVuong(e, f, g));

		System.out.print("Dien tich tam giac vuong la: ");
		System.out.println(TamGiacVuong.dienTichTamGiacVuong(e, f));
	}

}
