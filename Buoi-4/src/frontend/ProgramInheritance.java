package frontend;

import inheritance.*;

public class ProgramInheritance {
	public static void main(String[] args) {
		Person person1 = new Person("Minh",123);
		
		ITPlus student1 = new ITPlus("Minh", 123);
		student1.email = "a@gmail.com";
		student1.address = "Ha Noi";
		
		student1.eat();
		
		ITJava student11 = new ITJava("Minh", 123);
		student11.eat();
		student11.study();
	}
}
