package bdz;
import java.util.Scanner;

public class bdz_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            if ((int) Math.pow(i, 2) <= n) {
                System.out.println(i);
                return;
            }
        }
    }
}

