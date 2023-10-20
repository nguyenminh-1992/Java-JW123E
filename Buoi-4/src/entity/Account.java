package entity;

public class Account {
	public int id;
	public String name;
	public String email;
	public String clazz;
	
	public Account(int id,String name){
		this.id = id;
		this.name = name;
		this.email = "a@gmail.com";
	}
	
	public Account(int id,String name,String email, String clazz){
		this.id = id;
		this.name = name;
		this.email = email;
		this.clazz = clazz;
	}
	
	public Account(){
		
	}
	

}
