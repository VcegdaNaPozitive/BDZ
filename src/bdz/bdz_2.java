package bdz;
import java.util.Scanner;

public class bdz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = m, b = m, s = m;
        for (int i = 0; i < n - 1; i++) {
            m = sc.nextInt();
            if (m > a) {
                a = m;
            }
            if (m < b) {
                b = m;
            }
            s += m;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println((double) s / n);
    }
}
