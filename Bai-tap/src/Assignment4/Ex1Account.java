package Assignment4;

public class Ex1Account {
	public int id;
	public String email;
	public String name;
	
	//Question1
	public Ex1Account() {
		
	}
	//Question2

	public Ex1Account(int id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	//Question3
	public Ex1Account(int id, String name) {
		this.id = id;
		this.email = null;
		this.name = name;
	}
	
	
	
	
}
