package quiz12;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            BigDecimal x = new BigDecimal(a);
            BigDecimal y = new BigDecimal(b);
            System.out.println(x.add(y));
            System.out.println(x.multiply(y));
        }
    }
}
