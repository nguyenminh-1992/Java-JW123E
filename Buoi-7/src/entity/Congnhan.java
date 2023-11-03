package entity;

import java.util.Scanner;

public class Congnhan extends Canbo {
	private int capBac;
	
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
