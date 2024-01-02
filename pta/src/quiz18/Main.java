package quiz18;

public class Main {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            if (ge == shi && bai == qian && shi * 10 + ge != qian * 10 + bai && Math.sqrt(i) % 1 == 0) {
                System.out.println("³µÅÆºÅÂëÊÇ" + i);
            }
        }
    }
}
