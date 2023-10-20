package itplus;

public class Program {

	public static void main(String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "IT";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "English";
		
		Department department3 = new Department();
		department1.id = 3;
		department1.name = "Graphics";
		
		Position position1 = new Position();
		position1.id  = 1;
		position1.name = "Mentor";
		
		Position position2 = new Position();
		position2.id  = 2;
		position2.name = "Student";
		
		
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "a@gmail.com";
		account1.userName = "Nguyen Van A";
		account1.gender = Gender.MALE;
		account1.positionid = position2;
		account1.departmentid = department1;
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "b@gmail.com";
		account2.userName = "Nguyen Van B";
		account2.gender = Gender.MALE;
		account2.positionid = position1;
		account2.departmentid = department1;
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "c@gmail.com";
		account3.userName = "Nguyen Van C";
		account3.gender = Gender.MALE;
		account3.positionid = position1;
		account3.departmentid = department1;
		
		Account[] IT1 = {account1, account2, account3};
		Account[] IT2 = {account1, account3};
		
		Clazz class1 = new Clazz();
		class1.id = 1;
		class1.name = "IT1";
		class1.study = IT1;
		
		Clazz class2 = new Clazz();
		class2.id = 2;
		class2.name = "IT2";
		class2.study = IT2;
		
		Clazz class3 = new Clazz();
		class3.id = 3;
		class3.name = "IT3";
		// In thong tin cac account cua lop class1
		
		System.out.println(account1);
		System.out.println(account2);
		
	}

}
