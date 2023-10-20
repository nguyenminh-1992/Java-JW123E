package entity;

public class IT1 implements IStudy{
	public int id;
	public String name;
	public String email;
	public String clazz;
	
	public void lamduan() {
		System.out.println("Phai lam du an");
	}
	
	@Override
	public void hoc() {
		System.out.println("Hoc java");
	}
	
	@Override
	public void lambaitap() {
		System.out.println("Lam bai tap tren may");
	}
	@Override
	public void thi() {
		System.out.println("Thi lap trinh");
	}
}
