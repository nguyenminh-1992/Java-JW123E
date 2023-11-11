package Assignment6.Ex5.entity;

import java.util.Scanner;

public class Person {
	Scanner sc = new Scanner(System.in);
	
	private String ten;
	private String gioitinh;
	private String diachi;
	private String ngaysinh;
	
	public Person(String ten, String gioitinh, String diachi, String ngaysinh) {
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
	}
	
	public Person() {
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	@Override
	public String toString() {
		return "Person [ten=" + ten + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", ngaysinh=" + ngaysinh + "]";
	}
	
	public void inputInfor() {
		System.out.println("Nhap ten: ");
		this.ten = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gioitinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diachi = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.ngaysinh = sc.nextLine();
		Person person = new Person(ten, gioitinh, diachi, ngaysinh);
		
	}
	
	
	
	
}
