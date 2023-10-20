package inheritance;

public class Person {
	public String name;
	public int CCCD;
	public String email;
	public String address;
	
// Constructor	
	public Person(String name,int CCCD){
		this.name = name;
		this.CCCD = CCCD;
	}
	
// Method	
	public void eat() {
		System.out.println("An");
	}
	
	public void sleep() {
		System.out.println("Ngu");
	}
}
