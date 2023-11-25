package dele;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dechan.Student;
import dele.Input;
import dele.Activity;
import dele.Search;

public class Book implements Activity, Search {
	private int id;
	private String name;
	private String publishing;
	
	Scanner sc = new Scanner(System.in);
	
	static List<Book> books = new ArrayList<Book>();
	
	
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

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishing=" + publishing + "]";
	}
	
	Input input = new Input();
	@Override
	public void searchByName(String name) {
		boolean timkiem = false;
		for (Book i: books) {
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

	@Override
	public void add() {
		Book book = new Book();
		System.out.println("Nhap ma sach: ");
		book.id = input.inputScannerInt(sc);
		sc.nextLine();
		System.out.println("Nhap ten sach: ");
		book.name = input.inputScannerString(sc);
		System.out.println("Nhap ten NXB: ");
		book.publishing = input.inputScannerString(sc);
		books.add(book);
		
	}

	@Override
	public void remove(int id) {
		boolean timkiem = false;
		for (Book i: books) {
			if(i.getId() == id) {
				timkiem = true;
				books.remove(i);
				System.out.println("Da xoa");
			}
		}
		if(timkiem==false) {
			System.out.println("Khong tim thay");
		}
		
	}

	@Override
	public void edit(int id) {
		for (Book i: books) {
			if(i.getId() == id) {
				System.out.println("Nhap ten sach: ");
				String tensach = sc.nextLine();
				i.setName(tensach);
			}else {
				System.out.println("Khong trung ma");
			}
		}
		
	}
	
	public void indanhsach() {
		int length = books.size();
		for (int i = 0; i < length; i++) {
			System.out.println(books.get(i));
		}
	}

}
