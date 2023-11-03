package entity;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private int capBac;
	
	public Congnhan(String hoTen, int tuoi, entity.gioiTinh gioiTinh, String diaChi, int capBac) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.capBac = capBac;
	}
	
	@Override
	public void themcanbo() {
		super.themcanbo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap cap bac: ");
		int capbac = sc.nextInt();
		
	}

	

	public int getCapBac() {
		return capBac;
	}

	public void setCapBac(int capBac) {
		this.capBac = capBac;
	}
}
