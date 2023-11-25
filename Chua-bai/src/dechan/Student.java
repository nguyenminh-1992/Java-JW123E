package dechan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements Activity, Search {
	Scanner sc = new Scanner(System.in);
	
	static List<Student> students = new ArrayList<Student>();
	
	private int id;
	private String name;
	private String country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	Input input = new Input();
	@Override
	public void add() {
		Student std = new Student();
		System.out.println("Nhap ma sinh vien: ");
		std.id = input.inputScannerInt(sc);
		sc.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		std.name = input.inputScannerString(sc);
		System.out.println("Nhap que quan: ");
		std.country = input.inputScannerString(sc);
		students.add(std);
	}
	@Override
	public void edit(int id) {
		for (Student i: students) {
			if(i.getId() == id) {
				System.out.println("Nhap ten sinh vien: ");
				String tensinhvien = sc.nextLine();
				i.setName(tensinhvien);
			}else {
				System.out.println("Khong trung ma");
			}
		}
	}
	@Override
	public void remove(int id) {
		boolean timkiem = false;
		for (Student i: students) {
			if(i.getId() == id) {
				timkiem = true;
				students.remove(i);
				System.out.println("Da xoa");
			}
		}
		if(timkiem==false) {
			System.out.println("Khong tim thay");
		}
	}
	@Override
	public void searchByName(String name) {
		boolean timkiem = false;
		for (Student i: students) {
			if(i.getName().equals(name)) {
				timkiem = true;
				System.out.println("Da tim thay");
				System.out.println(i);
				break;
			}
		}
		if (timkiem==false) {
			System.out.println("Khong tim thay");
		}
	}
	public void indanhsach() {
		int length = students.size();
		for (int i = 0; i < length; i++) {
			System.out.println(students.get(i));
		}
	}
}
