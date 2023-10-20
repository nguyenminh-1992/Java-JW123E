package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Mang {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "b";
		
		// Array
		String[] Mang1 = {"a", "b", "c"};
		
		String[] Mang2 = new String[] {"1","2","3"};
		
		String[] Mang3 = new String[3];
		Mang3[0] = "1";
		Mang3[1] = "2";
		Mang3[2] = "3";
		
		System.out.println(s1);
		System.out.println(Mang1[2]);
		
		// Array List
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
		System.out.println(numbers.get(2));
		
		numbers.remove(1);
		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		//System.out.println(numbers.contains(10));
		
	}

}
