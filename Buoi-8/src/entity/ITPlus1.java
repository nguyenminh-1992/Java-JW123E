package entity;

public class ITPlus1 extends Student {

	public ITPlus1(int masv, String namesv) {
		super(masv, namesv);
	}

	public static void main(String[] args) {
		ITPlus1 sv1 = new ITPlus1(0, "Quang");
		sv1.Hoc();
	}
}
