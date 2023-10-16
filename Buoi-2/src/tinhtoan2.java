
public class tinhtoan2 {

	public static void main(String[] args) {
//Switch case
		int so1 = 2;
		switch (so1) {
		case 1:   //so1 == 1
			System.out.println("So mot");
			break;
		case 2: //so1 == 2
			System.out.println("So hai");
			break;
		case 3: //so1 == 3
			System.out.println("So ba");
			break;
		default:
			System.out.println("Khong co so nao");
			break;
		}
// In ra 10 so tu nhien lien tiep
		for (int n = 1; n <= 10 ; n ++ ) {
			System.out.println(n);
		}
		
		//while
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
//Ham in
		System.out.println("Xin chao");
		System.out.print("Xin chao\n");
		System.out.print("Xin chao\n");
		
		double so2 = 1.23445;
		System.out.println(so2);
		System.out.printf("'%.3f'%n", 5.1473);
	
	
	
	
	
	
	
	}
}
