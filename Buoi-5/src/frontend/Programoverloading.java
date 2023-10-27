package frontend;


public class Programoverloading {
	public static int tinhtong(int a, int b) {
		return a+b;
	}
	
	public static double tinhtong(double a, double b) {
		return a-b;
	}
	
	public static void nhapso(int a) {
		System.out.println("So int");
	}
	
	public static void nhapso(double a) {
		System.out.println("So double");
	}
	
	public static void main(String[] args) {
		System.out.println(tinhtong(3.5,4.5));

		nhapso(5);
		nhapso(5.0);
	}
	

}
