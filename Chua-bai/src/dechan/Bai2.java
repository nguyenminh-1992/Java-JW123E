package dechan;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Bai2 {
	static ArrayList<String> result = new ArrayList<>();
	static String filename = "D:\\\\5. ITPlus\\\\Java-JW1023E\\\\Chua-bai\\\\filetxt\\\\sinhvien.txt";
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("------------------ Cau 2a ---------------------");
		cau2a();
		System.out.println("------------------ Cau 2b ---------------------");
		cau2b();
		System.out.println("------------------ Cau 2c ---------------------");
		cau2c();
		}
	
	public static void cau2a() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
            	result.add(line);
            }
            System.out.println(result);
	}
	
	public static void cau2b() {
		int soluong = result.size();
		System.out.println("So luong sinh vien la: " + soluong);
		System.out.println("In chi tiet sinh vien -------");
		for (int i = 0; i < soluong; i++) {
			System.out.println(result.get(i));
		}
	}
	public static void cau2c() {
		String[] result2 = new String[result.size()];
		result2 = result.toArray(result2);

        String[] resultsapxep = new String[result2.length];

        for (int i = 0; i < result2.length; i++) {
            String[] parts = result2[i].split(";");
            resultsapxep[i] = parts[1];
        }
        Arrays.sort(resultsapxep);

        for (String i : resultsapxep) {
            System.out.println(i);
        }
    }		
}