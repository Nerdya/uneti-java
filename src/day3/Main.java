package day3;

import java.util.Scanner;

public class Main extends HinhChuNhat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Nhap chieu dai: ");
//		double dai = scanner.nextDouble();
//		System.out.println("Nhap chieu rong: ");
//		double rong = scanner.nextDouble();

//		HinhChuNhat HCN = new HinhChuNhat();
//		HCN.setDai(dai);
//		HCN.setRong(rong);
//		System.out.println("Chu vi = " + HCN.ChuVi());
//		System.out.println("Dien tich = " + HCN.DienTich());

		double a;
		do {
			System.out.println("Canh a: ");
			a = scanner.nextDouble();
		} while (a <= 0);
		double b;
		do {
			System.out.println("Canh b: ");
			b = scanner.nextDouble();
		} while (b <= 0);

		HinhChuNhat hcn = new HinhChuNhat(a, b);
		System.out.println("Chu vi = " + hcn.ChuVi());
		System.out.println("Dien tich = " + hcn.DienTich());
	}
}