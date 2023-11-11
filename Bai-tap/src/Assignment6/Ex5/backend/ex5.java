package Assignment6.Ex5.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assignment6.Ex5.entity.Person;
import Assignment6.Ex5.entity.Student;


public class ex5 {
	public void demoStudent() {
		Student st = new Student();
		st.inputInfor();
		System.out.println("Thông tin Student vừa nhập vào: ");
		System.out.println(st.toString());
		if (st.kiemtraDiem()) {
		System.out.println("Sinh viên này đạt học bổng");
		}else {
		System.out.println("Sinh viên này không đạt học bổng");
		}
		}
	public void demoPerson() {
		Person person = new Person();
		person.inputInfor();
		System.out.println("Thông tin person vừa nhập vào: ");
		System.out.println(person.toString());
		}
}
