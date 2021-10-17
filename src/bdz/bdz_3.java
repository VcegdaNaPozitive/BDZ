package bdz;
import java.util.Scanner;

public class bdz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        while (a != 0) {
            a = sc.nextInt();
            s += a;
        }
        for (int i = s; i > 0; i--) {
            if ((int) Math.pow(i, 2) <= s) {
                System.out.println(i);
                return;
            }
        }
    }
}