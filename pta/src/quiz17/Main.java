package quiz17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double weight = sc.nextDouble();
            double height = sc.nextDouble();
            if (weight < 0 || weight > 727 || height < 0 || height > 2.72) {
                System.out.println("input out of range");
                continue;
            }
            double bmi = weight / Math.pow(height, 2);
            if (bmi < 18.5) {
                System.out.println("thin");
            } else if (bmi < 24) {
                System.out.println("fit");
            } else if (bmi < 28) {
                System.out.println("overweight");
            } else {
                System.out.println("fat");
            }
        }
    }
}
