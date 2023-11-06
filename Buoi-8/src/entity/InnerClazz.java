package entity;

public class InnerClazz {
	String name = "Minh";

	
	public class InnerClazz2 {
		void hienthi() {
			System.out.println("Xin chao" + name);
		}
	}
	public static void main(String[] args) {
		InnerClazz doituong1 = new InnerClazz();
		InnerClazz.InnerClazz2 doituong2 = doituong1.new InnerClazz2();
		doituong2.hienthi();
	}
	
	
}
