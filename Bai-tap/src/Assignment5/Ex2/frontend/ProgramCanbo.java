package Assignment5.Ex2.frontend;

import java.util.Scanner;

import Assignment5.Ex2.backend.Canbobackend;



public class ProgramCanbo {
	public static void main(String[] args) {
		Canbobackend cb = new Canbobackend();
		boolean isCorrect = true;
		while (isCorrect){
			System.out.println("--------------------------|");
			System.out.println("|1. Them can bo           |");
			System.out.println("|2. Tim kiem can bo       |");
			System.out.println("|3. Hien thi danh sach    |");
			System.out.println("|4. Xoa can bo            |");
			System.out.println("|5. Thoat chuong trinh    |");
			System.out.println("|-------------------------");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap chuc nang: ");
			int nhap = sc.nextInt();
			switch (nhap) {
			case 1:
				cb.Themcanbo();
				break;
			case 2:
				System.out.println("Nhap ten ng tim kiem: ");
				String nhaptentimkiem = sc.next();
				cb.Timkiemcanbo(nhaptentimkiem);
				break;
			case 3:
				cb.Hienthicanbo();
				break;
			case 4:
				System.out.println("Nhap ten ng muon xoa: ");
				String nhapten = sc.next();
				// Minh
				cb.Xoacanbo(nhapten);
				break;
			case 5:
				isCorrect = false;
			}		
		}		
	}

}
