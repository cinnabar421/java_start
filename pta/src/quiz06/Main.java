package quiz06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(isLegal(str));
		}
	}
	
	public static boolean isLegal(String str) {
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				if (!Character.isJavaIdentifierStart(str.charAt(i))) {
					flag = false;
				}
			} else {
				if (!Character.isJavaIdentifierPart(str.charAt(i))) {
					flag = false;
				}
			}
		}
		return flag;
	}

}
