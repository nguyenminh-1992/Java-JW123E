package entity;

public class staticdemo {
	static int dem = 0;

	//Constructor
	public staticdemo() {
		dem ++;
		System.out.println(dem);
	}
	
	public static void main(String[] args) {
		staticdemo doituong1 = new staticdemo(); //1
		staticdemo doituong2 = new staticdemo(); //2
		staticdemo doituong3 = new staticdemo(); //3
	}
	
}
