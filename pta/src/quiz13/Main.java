package quiz13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        int n = sc.nextInt();
        double plus = m * Math.pow(1 + p, n);
        double plus2 = m + m * p * n;
        System.out.print(Math.round(plus) + " ");
        System.out.print(Math.round(plus2) + " ");
        System.out.println(Math.round(plus - plus2));
    }
}
