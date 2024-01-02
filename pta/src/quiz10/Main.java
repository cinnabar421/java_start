package quiz10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr1 = str.split(";");
		int price = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr1[i].trim();
			String[] arr2 = arr1[i].split(":");
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = arr2[j].trim();
			}
			System.out.println(arr2[0] + "--" + arr2[1]);
			price += Integer.parseInt(arr2[1]);
		}
		System.out.println("×Ü¼Û¸ñ--" + price);
	}

}
