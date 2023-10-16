
public class tinhtoan {

	public static void main(String[] args) {
// Tinh tong 2 so
		// Khai bao bien
		int so1;
		int so2;
		String so3;
		so3 = "5";
		so1 = 15;  //Bien
		so2 = 9;  //Bien
		int tong, tich, sodu;
		float thuong;
		tong = so1 + so2;
		tich = so1 * so2;  // Phep nhan
		thuong = (float)so1/so2;
		sodu = so1 % so2;
		//System.out.println(sodu);
		//System.out.println("tong cua 2 so");
		
		int a = 5, b = 10;
		a = a + 1; // = : Phep gan
		b += 1;
		//System.out.println(b);
		
// Kiem tra tinh chan le
		// 1 la so chan, 2 la so le
		int so4 = 5;
		
		if ((so4 % 2) == 0) {
			System.out.println("So chan");
		}	
		else 
		// (so4 % 2) != 0) 
		{
			System.out.println("So le");
		}
		//Cach viet 2
		System.out.println((so4 % 2) == 0?"So chan":"So le");
		
		int so5 = 15;
		// so1: 15
// So sanh 2 so
		if (so1 > so5) {
			System.out.println("So 1 lon hon so 5");
		}
		else if (so1 == so5){
			System.out.println("2 so bang nhau");
		}
		else {
			System.out.println("So 5 lon hon so 1");
		}
	
//Cho 3 so, hien thi ra so lon nhat trong 3 so
		int so6 = 5;
		int so7 = 9;
		int so8 = 8;
		if ((so6 >= so7) && (so6 >= so8)){
			System.out.println(so6);
		}
		else if ((so7 >= so6) && (so7 >= so8)) {
			System.out.println((so7));
		}
		else {
			System.out.println(so8);
		}
	}
}
