package frontend;

import java.util.Iterator;

import entity.Person;
import entity.Student;
import entity.Teacher;

public class Program {
	public static void main(String[] args) {
			Person[] persons = new Person[10];
			persons[0] = new Student(1,"A");
			persons[1] = new Student(2,"B");
			persons[2] = new Student(3,"C");
			persons[3] = new Student(4,"D");
			persons[4] = new Student(5,"E");
			
			persons[5] = new Teacher(6,"F");
			persons[6] = new Teacher(7,"G");
			persons[7] = new Teacher(8,"H");
			persons[8] = new Teacher(9,"I");
			persons[9] = new Teacher(10,"J");
			
			for (Person person:persons) {
				person.sleep();
			}
			System.out.println("----------------------");
			// Chi print sleep cua Student thoi
			for (Person person:persons) {
				if (person instanceof Student) {
					Student student = (Student) person;
					student.sleep();
				}
			}

	}

}
