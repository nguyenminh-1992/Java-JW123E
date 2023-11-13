
public class Student<T> {
	private T id;
	String name;
	private T score;
	public Student(T id, String name) {
		this.id = id;
		this.name = name;
	
	}

	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Student std1 = new Student("3","Van A");
		Student<Integer> sdt2 = new Student<Integer>(1, "Quang");
		Student<String> std3 = new Student<String>("1", "Hai");
	}
}





