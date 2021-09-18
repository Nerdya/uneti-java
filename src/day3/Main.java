package day3;

import java.util.Scanner;

public class Main extends HinhChuNhat {
	public static void main(String[] args) {
		HinhChuNhat HCN = new HinhChuNhat();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap chieu dai: ");
		int dai = scanner.nextInt();
		HCN.setDai(dai);
		System.out.println("Nhap chieu rong: ");
		int rong = scanner.nextInt();
		HCN.setRong(rong);
		
		System.out.println("Chu vi = " + HCN.ChuVi());
		System.out.println("Dien tich = " + HCN.DienTich());
	}
}