package quiz04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
