package bdz;
import java.util.Scanner;

public class bdz_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, c;
        for (int i = 1; i <= n; i++) {
            c = sc.nextInt();
            if (c % 100 == 11 && c > max) {
                max = c;
            }
        }
        System.out.println(max);
    }
}