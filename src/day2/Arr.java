package day2;

import java.util.Scanner;
import java.lang.Math;

public class Arr {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so phan tu trong mang: ");
		int n = scanner.nextInt();
		while (n <= 0) {
			System.out.println("So phan tu khong hop le. Nhap lai:");
			n = scanner.nextInt();
		}
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("arr[" + i + "] = ");
			arr[i] = scanner.nextInt();
		}
		
		int index = 0;
		System.out.println("Mang arr:");
		do {
			System.out.print(arr[index] + " ");
			index++;
		} while (index != n);
		System.out.println();
		
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
		System.out.println("Cac so nguyen to co trong mang:");
		for (int i = 0; i < n; i++) {
			boolean check = true;
			if (arr[i] < 2) {
				check = false;
			} else {				
				for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
					if (arr[i] % j == 0) {
						check = false;
						break;
					}
				}
			}
			if (check) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		for (int i = 0 ; i < n - 1 ; i++) {
			for (int j = i + 1; j < n ; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Mang da duoc sap xep tang dan:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}