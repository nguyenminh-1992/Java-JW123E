public class Program {
	public static void main(String[] args) {
		//student1
		Student student1 = new Student();
		student1.id = 1;
		student1.name = "Nguyen Van";
		student1.country = "Ha Noi";
		student1.gioitinh = Gender.MALE;
		//student2
		//student3
		
		System.out.println(student1.name);
		System.out.println(student1.country);
	}

}
