package entity;

import java.util.Scanner;

public class Kysu extends Canbo {
	private String nganhDaoTao;
	
	
	@Override
	public void themcanbo() {
		super.themcanbo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nganh dao tao: ");
		String nganh = sc.nextLine();
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
}
