package entity;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {
	public static void main(String[] args) {
		System.out.println("Dong 1");
		System.out.println("Dong 2");
		System.out.println("Dong 3");
		try {
			System.out.println("Nhap vao 1 so");
			Scanner sc = new Scanner(System.in);
			int nhap = sc.nextInt();
			System.out.println(nhap);
		} catch (InputMismatchException e) {
			System.out.println("Bi loi");
		} finally {
			System.out.println("Kieu gi cung in ra");
		}
		
		System.out.println("Dong 4");
		System.out.println("Dong 5");
	}
}
