package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Canbo;
import entity.Congnhan;

public class Canbobackend {
		List<Canbo> listcanbo = new ArrayList<Canbo>();
		Scanner sc = new Scanner(System.in);
	
	public void Themcanbo() {
		
		System.out.println("Chon loai can bo");
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky su");
		System.out.println("3. Nhanvien");
		
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
