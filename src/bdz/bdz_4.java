package bdz;
import java.util.Scanner;

public class bdz_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5;
        int a = sc.nextInt();
        m1 = 0;
        m2 = 0;
        m3 = 0;
        m4 = 0;
        m5 = 0;
        while (a > 0) {
            if (a > m5) {
                m5 = a;
                if (a > m4) {
                    m5 = m4;
                    m4 = a;
                    if (a > m3) {
                        m4 = m3;
                        m3 = a;
                        if (a > m2) {
                            m3 = m2;
                            m2 = a;
                            if (a > m1) {
                                m2 = m1;
                                m1 = a;
                            }
                        }
                    }
                }
            }
            a = sc.nextInt();
        }
        System.out.print(m5 + " " + m4 + " " + m3 + " " + m2 + " " + m1);
    }
}
