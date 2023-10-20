package itplus;

public class Account {
	int id;
	String email;
	String userName;
	Gender gender;
	Department departmentid;
	Position positionid;
	
	@Override
	public String toString() {
		String hienthi = "";
		hienthi += id + "/" + email + "/" + userName + "/"; 
		return hienthi;
		
	}
}
