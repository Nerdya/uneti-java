package day3;

import java.util.Scanner;

public class Main extends HinhChuNhat {
	public static void main(String[] args) {
//		HinhChuNhat HCN = new HinhChuNhat();
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Nhap chieu dai: ");
//		double dai = scanner.nextDouble();
//		HCN.setDai(dai);
//		System.out.println("Nhap chieu rong: ");
//		double rong = scanner.nextDouble();
//		HCN.setRong(rong);
//		
//		System.out.println("Chu vi = " + HCN.ChuVi());
//		System.out.println("Dien tich = " + HCN.DienTich());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh a: ");
		double a = scanner.nextDouble();
		System.out.println("Nhap canh b: ");
		double b = scanner.nextDouble();
		
		HinhChuNhat hcn = new HinhChuNhat(a, b);
		System.out.println("Chu vi = " + hcn.ChuVi());
		System.out.println("Dien tich = " + hcn.DienTich());
	}
}