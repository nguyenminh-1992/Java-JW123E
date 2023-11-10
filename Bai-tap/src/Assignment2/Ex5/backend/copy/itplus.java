package Assignment2.Ex5.backend.copy;

import Assignment2.Ex5.entity.Account;
import Assignment2.Ex5.entity.Clazz;
import Assignment2.Ex5.entity.Department;
import Assignment2.Ex5.entity.Gender;
import Assignment2.Ex5.entity.Position;

public class itplus {
	public void khoitao() {
		Department dep1 = new Department();
		Department dep2 = new Department();
		Department dep3 = new Department();
		Department dep4 = new Department();
		Department dep5 = new Department();
		
		dep1.ID = 1;
		dep1.name = "IT1";
		
		dep2.ID = 2;
		dep2.name = "IT2";

		dep3.ID = 3;
		dep3.name = "IT3";
		
		dep4.ID = 4;
		dep4.name = "IT4";
		
		dep5.ID = 5;
		dep5.name = "IT5";
		
		Position pos1 = new Position();
		Position pos2 = new Position();
		Position pos3 = new Position();
		Position pos4 = new Position();
		Position pos5 = new Position();
		
		pos1.ID = 1;
		pos1.name = "Dev1";
		
		pos2.ID = 2;
		pos2.name = "Dev2";
		
		pos3.ID = 3;
		pos3.name = "Dev3";
		
		pos4.ID = 4;
		pos4.name = "Dev4";
		
		pos5.ID = 5;
		pos5.name = "Dev5";
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		Account acc4 = new Account();
		Account acc5 = new Account();
		
		acc1.ID = 1;
		acc1.email = "Email1";
		acc1.gender= Gender.MALE;
		acc1.name = "name1";
		acc1.departmentid = dep1;
		acc1.positionid = pos1;
		
		acc2.ID = 2;
		acc2.email = "Email2";
		acc2.gender= Gender.MALE;
		acc2.name = "name2";
		acc2.departmentid = dep2;
		acc2.positionid = pos2;
		
		acc3.ID = 3;
		acc3.email = "Email3";
		acc3.gender= Gender.MALE;
		acc3.name = "name3";
		acc3.departmentid = dep3;
		acc3.positionid = pos3;
		
		Clazz clazz1 = new Clazz();
		Clazz clazz2 = new Clazz();
		Clazz clazz3 = new Clazz();
		
		clazz1.id = 1;
		clazz1.name = "Java1";
		clazz1.creatorid = acc1;
		
		clazz2.id = 2;
		clazz2.name = "Java2";
		clazz2.creatorid = acc2;
		
		System.out.println(acc1.name);
		System.out.println(acc2.name);
		System.out.println(acc3.name);

	}	
}
