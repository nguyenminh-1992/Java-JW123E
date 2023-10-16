import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
// Input
		Scanner nhap = new Scanner(System.in);
		
		System.out.println("Nhap vao 1 so: ");
		int so = nhap.nextInt();
		System.out.println(so);
		
		System.out.println("Nhap vao 1 so thap phan: ");
		float sothapphan = nhap.nextFloat();
		System.out.println(sothapphan);
		
		System.out.println("Nhap vao 1 chuoi: ");
		String chuoi = nhap.next();
		System.out.println(chuoi);
		
		nhap.close();
	}

}
