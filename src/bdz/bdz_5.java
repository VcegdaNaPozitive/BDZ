package bdz;
import java.util.Scanner;

public class bdz_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";
        int b;
        for (int i = 0; i < n; i++) {
            b = sc.nextInt();
            while (b >= 10)
                b /= 10;
            a += b;
        }
        System.out.println(a);
    }
}