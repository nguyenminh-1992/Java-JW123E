package backend;

import entity.Student;

public class Studentobject {
	//Method
	public void Khoitao() {
		Student student1 = new Student("Minh","Ha Noi");
		Student student2 = new Student("Quang","Sai Gon");
		Student student3 = new Student("Thai","Nha Trang");
				
		student1.setMark(8);
		student2.setMark(4);
		student3.setMark(10);
		
		student2.diemthuong(2);
		
		Student[] mangstudents = {student1, student2, student3};
		for (Student i : mangstudents) {
			System.out.println(i);
		}
		
	}
	
}
