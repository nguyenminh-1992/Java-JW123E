package Assignment4;

public class Ex5 {
	public int sum(int a, int b) {
		return a + b;
	}

	public float sum(int a, float b) {
		return a + b;
	}

	public float sum(float a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("-------Question 4-------");
		Ex5 pro = new Ex5();
		System.out.println(pro.sum(3.5f, 5));
		System.out.println(pro.sum(6, 2.2f));
		System.out.println(pro.sum(10, 4));
	}
}	
