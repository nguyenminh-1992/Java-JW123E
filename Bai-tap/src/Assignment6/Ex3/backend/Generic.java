package Assignment6.Ex3.backend;

import java.util.ArrayList;
import java.util.List;

import Assignment6.Ex3.entity.Employee;
import Assignment6.Ex3.entity.Student;

public class Generic <E extends Number> {
	public void Question1() {
		System.out.println("-------Question 1-------");
		Student<Integer> student1 = new Student<>(1, "Nguyen Thanh Luan");
		Student<Float> student2 = new Student<>(2f, "Nguyen The An");
		Student<Double> student3 = new Student<>(3d, "Le Thi Lich");
	}
	public void Question2() {
		System.out.println("-------Question 2-------");
		Student<Integer> student1 = new Student<>(1, "Nguyen Thanh Luan");
		student1.print(1, 2);
		student1.print("Testing generic for methods", "Testing generic for methods...");
	}
	
	public void Question3() {
		System.out.println("-------Question 5-------");
		List<Integer> salariesOfEmp1 = new ArrayList<>();
		salariesOfEmp1.add(2348);
		salariesOfEmp1.add(6782);
		salariesOfEmp1.add(6728);
		salariesOfEmp1.add(2372);
		salariesOfEmp1.add(4546);
		Employee<Integer> emp1 = new Employee<>("Nguyen Thanh Luan", salariesOfEmp1);
		
		List<Float> salariesOfEmp2 = new ArrayList<>();
		salariesOfEmp2.add(9345f);
		salariesOfEmp2.add(4599f);
		salariesOfEmp2.add(9237f);
		salariesOfEmp2.add(1634f);
		Employee<Float> emp2 = new Employee<>("Nguyen The An", salariesOfEmp2);
		
		List<Double> salariesOfEmp3 = new ArrayList<>();
		salariesOfEmp3.add(8293d);
		salariesOfEmp3.add(6386d);
		salariesOfEmp3.add(2385d);
		salariesOfEmp3.add(5923d);
		salariesOfEmp3.add(2662d);
		Employee<Double> emp3 = new Employee<>("Le Thi Lich", salariesOfEmp3);
		
		Employee[] employees = { emp1, emp2, emp3 };
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Information of employee" + (i + 1) + ": ");
			System.out.println(employees[i].toString());
			System.out.println("Last salary is:");
			System.out.println(employees[i].getLastSalary() +"\n");
		}
	
	}
}
