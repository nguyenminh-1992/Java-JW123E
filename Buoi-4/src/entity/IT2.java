package entity;

public class IT2 implements IStudy, IPlay {
	public int id;
	public String name;
	public String email;
	public String clazz;
	
	public void lambaitaplon() {
		System.out.println("Phai lam bai tap lon");
	}
	@Override
	public void game() {
		System.out.println("Choi game");
	}
	
	@Override
	public void sport() {
		System.out.println("Choi the thao");
	}
	
	@Override
	public void hoc() {
		System.out.println("Hoc Web");
	}
	@Override
	public void lambaitap() {
		System.out.println("Lam bai tap tren giay");
	}
	@Override
	public void thi() {
		System.out.println("Thi van dap");
	}
}
