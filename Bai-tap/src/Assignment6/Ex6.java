package Assignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6 {
	private static void inputAge() {
		Scanner scanner = new Scanner(System.in);
		boolean isCorrect = true;
		while (isCorrect) {
			System.out.print("Please input your age: ");
			try {
				int age = scanner.nextInt();
				if (age > 0) {
					System.out.println("Your age is: " + age);
					isCorrect = false;
				} else {
					System.err.println("Wrong inputing! The age must be greater than 0, please try again.");
				}
			} catch (InputMismatchException e) {
				System.err.println("Wrong inputing! Please input your age as an integer.");
			} finally {
				scanner.nextLine();
			}
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		inputAge();
	}
}
