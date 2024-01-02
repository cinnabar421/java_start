package quiz16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a + b <= c) {
                System.out.println("Input Error!");
                continue;
            }
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("%.2f\n", s);
        }
    }
}
