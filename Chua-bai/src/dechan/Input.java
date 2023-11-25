package dechan;

import java.util.Scanner;

public class Input {
	public int inputScannerInt(Scanner scanner) {
		int result = 0;
        boolean validInput = false;

        do {
            if (scanner.hasNextInt()) {
                result = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Bạn đã nhập không phải là số nguyên. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        } while (!validInput);
        return result;
	}
	
	public String inputScannerString(Scanner scanner) {
		String result = null;
        boolean validInput = false;

        do {
            if (scanner.hasNextLine()) {
                result = scanner.nextLine();
                validInput = true;
            } else {
                System.out.println("Bạn đã nhập không phải là chuỗi. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        } while (!validInput);
        return result;
	}
}
