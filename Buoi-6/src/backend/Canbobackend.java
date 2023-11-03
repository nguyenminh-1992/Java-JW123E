package backend;

import java.util.Scanner;

public class Canbobackend {
	public void Themcanbo() {
		
		System.out.println("Chon loai can bo");
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky su");
		System.out.println("3. Nhanvien");
		Scanner sc = new Scanner(System.in);
		int nhap = sc.nextInt();
		// Array List
		switch (nhap) {
		case 1:
			System.out.println("Nhap thong tin Cong nhan");
			break;
		case 2:
			System.out.println("Nhap thong tin Ky su");
			break;
		case 3:
			System.out.println("Nhap thong tin Nhan vien");
			break;
		}
	}
	
	public void Xoacanbo() {
		
	}
	
	public void Hienthicanbo() {
		
	}
	
	public void Timkiemcanbo() {
		
	}

}
