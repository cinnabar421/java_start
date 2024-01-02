package quiz11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOld = sc.nextLine();
        String pwd = sc.nextLine();
        StringBuilder strNew = new StringBuilder();
        for (int i = 0; i < strOld.length(); i++) {
            int x = pwd.charAt(i % 5) - 48;
            strNew.append((char) (strOld.charAt(i) + x));
        }
        System.out.println(strNew);
    }
}
