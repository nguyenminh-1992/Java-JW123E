package entity;

public class Student extends Person{

	public Student(int id, String name) {
		super(id, name);
	}
	
	public void sleep() {
		System.out.println("Student sleep....");
	}

}
