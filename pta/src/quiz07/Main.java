package quiz07;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (sc.hasNext()) {
			String choice = sc.next();
			System.out.println("choice=" + choice);
			switch (choice) {
				case "double":{
					doublePrint();
					break;
				}
				case "int":{
					intPrint();
					break;
				}
				case "str":{
					strPrint();
					break;
				}
				case "line":{
					linePrint();
					break;
				}
				default:{
					System.out.println("other");
					break;
				}
			}
		}
	}
	
	public static void doublePrint() {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		System.out.printf("%-5.2f,%5.2f,%.2f\n", a, b, c);
	}
	
	public static void intPrint() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a + b + c);
	}
	
	public static void strPrint() {
		sc.nextLine();
		String str = sc.nextLine();
		String[] arr = str.split("\\s+");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result += arr[i];
		}
		System.out.println(result);
	}
	
	public static void linePrint() {
		String str = sc.next();
		System.out.println(str.toUpperCase());
	}

}







