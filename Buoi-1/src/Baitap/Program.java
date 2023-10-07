package Baitap;

public class Program {

	public static void main(String[] args) {
		Chucvu chucvu1 = new Chucvu();
		chucvu1.tenchucvu = "Truong phong 1";
		chucvu1.machucvu = 1;
		
		Phongban phongban1 = new Phongban();
		phongban1.tenPhongBan = "Lab6";
		
		Nhanvien nhanvien1 = new Nhanvien();
		nhanvien1.chucvu = chucvu1;
		nhanvien1.phongcuanhanvien = phongban1;
		
		System.out.println(nhanvien1.chucvu.machucvu);
		System.out.println(nhanvien1.chucvu.tenchucvu);
		

	}

}
