package entity;

public class Student {
// final cho class -> Khong the tao duoc class con
	int masv; // 1 2 3 4 5 (Tu dong tang dan)
	String namesv;
	
	final int namhoc = 2023; // Khong bao gio thay doi
	//static
	static String trungtam = "ITPlus";
	
	public Student(int masv, String namesv) {
		this.masv = masv;
		this.namesv = namesv;
	}
	
	final void Hoc() {
		System.out.println("Di hoc");
	}
	
	static void thaydoi() {
		trungtam = "PlusIT";
	}
	

	public static void main(String[] args) {
		Student.thaydoi();
		
		Student std1 = new Student(1, "Minh");
		Student std2 = new Student(2, "Minh");
		System.out.println(std1.trungtam);
		System.out.println(std2.trungtam);
		
	}
	
	
}
