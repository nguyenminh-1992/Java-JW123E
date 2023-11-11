package Assignment6.Ex5.entity;

public class Student extends Person {
	private int maSinhVien;
	private float diem;
	private String email;
	public int getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public void inputInfor() {
		super.inputInfor();
		System.out.println("Nhap ma sinh vien: ");
		this.maSinhVien = sc.nextInt();
		System.out.println("Nhap diem: ");
		this.diem = sc.nextFloat();
		System.out.println("Nhap email: ");
		this.email = sc.nextLine();
	}
	
	public boolean kiemtraDiem() {
		return diem > 8.0 ? true :false;
	}
	@Override
	public String toString() {
		return super.toString() + "Student [maSinhVien=" + maSinhVien + ", diem=" + diem + ", email=" + email + "]";
	}
	
}
