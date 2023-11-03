package entity;

import java.util.Scanner;

public class Canbo {
	private String hoTen;
	private int tuoi;
	private gioiTinh gioiTinh;
	private String diaChi;
	
	
	public Canbo(String hoTen, int tuoi, entity.gioiTinh gioiTinh, String diaChi) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	public void themcanbo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten cong nhan: ");
		String name = sc.nextLine();
		
		System.out.println("Nhap tuoi: ");
		int tuoi = sc.nextInt();
		
		System.out.println("Nhap gioi tinh:  (1.Nam, 2.Nu, 3.Khac) ");
		setGioiTinh(sc.nextInt());
		
		System.out.println("Nhap dia chi: ");
		String diachi = sc.nextLine();
		
		System.out.println("Nhap cap bac: ");
		int capbac = sc.nextInt();
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public gioiTinh getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		if(gioiTinh == 1) {
			this.gioiTinh = entity.gioiTinh.NAM;
		}
		else if(gioiTinh == 2) {
			this.gioiTinh = entity.gioiTinh.NU;
		}
		else {
			this.gioiTinh = entity.gioiTinh.KHAC;
		}
			
	}

	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
