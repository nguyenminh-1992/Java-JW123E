package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Canbo;
import entity.Congnhan;
import entity.Kysu;
import entity.Nhanvien;

public class Canbobackend {
		List<Canbo> listcanbo = new ArrayList<Canbo>();
		Scanner sc = new Scanner(System.in);
	
	public void Themcanbo() {
		Canbo doituong = new Canbo();            // Class cha
		System.out.println("Chon loai can bo");
		System.out.println("1. Cong nhan");
		System.out.println("2. Ky su");
		System.out.println("3. Nhanvien");
		
		int nhap = sc.nextInt();
		// Array List
		switch (nhap) {
		case 1:
			doituong = new Congnhan();             //2 Class con
			break;
		case 2:
			doituong = new Kysu();
			break;
		case 3:
			doituong = new Nhanvien();
			break;
		}
		
		doituong.themcanbo();                     //3
		listcanbo.add(doituong);
		
		for (Canbo i : listcanbo) {
			System.out.println(i);
		}
	}
	
	
	public void Xoacanbo(String nhapten) {
		for (Canbo i : listcanbo) {
			if(i.getHoTen().equals(nhapten)) {
				System.out.println("Da tim thay");
				listcanbo.remove(i);
				System.out.println("Da xoa");
				Hienthicanbo();
			}
			else {
				System.out.println("Khong thay ten nay");
			}
		}
	}
	
	public void Hienthicanbo() {
		for (Canbo i : listcanbo) {
			System.out.println(i);
		}
	}
	
	public void Timkiemcanbo(String timkiem) {
		for (Canbo i : listcanbo) {
			if(i.getHoTen().equals(timkiem)) {
				System.out.println("Da tim thay can bo");
				System.out.println(i);
			}
		}
	}

}
