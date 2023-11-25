package dechan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentBackend {
	Scanner sc = new Scanner(System.in);
	List<Student> students = new ArrayList<Student>();
	Student studentobj = new Student();
	Input input = new Input();
	public void menu() {
		int nhap;
		do {
			System.out.println("1. Them");
			System.out.println("2. Sua");
			System.out.println("3. Xoa");
			System.out.println("4. Tim kiem");
			System.out.println("5. Thoat");	
			System.out.println("Nhap chuc nang tuong ung: ");
			nhap = input.inputScannerInt(sc);
			switch(nhap) {
			case 1:
				studentobj.add();
				studentobj.indanhsach();
				break;
			case 2:
				System.out.println("Nhap ID muon sua: ");
				int idsua = sc.nextInt();
				studentobj.edit(idsua);
				studentobj.indanhsach();
				break;
			case 3:
				System.out.println("Nhap ID muon xoa: ");
				int idxoa = sc.nextInt();
				studentobj.remove(idxoa);
				studentobj.indanhsach();
				break;
			case 4:
				System.out.println("Nhap ten muon tim kiem");
				String name = sc.next();
				studentobj.searchByName(name);
				break;
			case 5:
				System.out.println("Byebye");
				break;
			default:
				System.out.println("Vui long nhap lai");
			}
		} while (nhap != 5);
		sc.close();
	}
}

