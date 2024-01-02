package quiz09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			if (str.equals("end")) {
				System.exit(0);
			}
			int result = 0;
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					result += Character.getNumericValue(str.charAt(i));
				}
			}
			System.out.println(result);
		}
	}

}
