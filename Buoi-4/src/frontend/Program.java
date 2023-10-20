package frontend;

import entity.Account;
import entity.Department;
import entity.IT1;
import entity.IT2;
import entity.Position;

public class Program {

	public static void main(String[] args) {
		Account account1 = new Account(1, "Minh");
		account1.clazz = "IT";
		
		Account account2 = new Account(2, "Tuan");
		
		Account account3 = new Account(3, "Hai", "a@gmail.com", "ITJava");
		
		Account account4 = new Account();
		account4.id = 4;
		
		Department department1 = new Department(1,"IT");
		
		Position position1 = new Position();
		
		System.out.println(account1.name);
		System.out.println(account1.email);
		System.out.println(account1.clazz);
		
		IT1 student1 = new IT1();
			
		IT2 student2 = new IT2();
	//Method
		student1.lambaitap();
		student2.lambaitap();
		
		student1.lamduan();
		student2.lambaitaplon();
	}

}
