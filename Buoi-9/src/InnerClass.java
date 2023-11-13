
public class InnerClass {
	int id;
	
	public void eat1() {
		System.out.println("Eat....1");
	}
	
	public class InnerClass2 {
		int id;

		public void eat2() {
			System.out.println("Eat....2");
		}
	}
		
	public static void main(String[] args) {
		InnerClass InnerClass = new InnerClass();
		InnerClass.InnerClass2 Inner2 = InnerClass.new InnerClass2();
		Inner2.eat2();
		
	}
}
