package quiz03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (Math.abs(a) > 1000) {
				System.out.println("|a|>1000");
			} else {
				System.out.println(a + b);
			}
		}
		
	}

}
