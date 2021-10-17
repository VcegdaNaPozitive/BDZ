package bdz;
import java.util.Scanner;

public class bdz_7 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        int i = 0, j = 0;
        for ( int k = 0; k < n * m; ++k, ++j ) {
            if ( k != 0 && k % m == 0 ) {
                ++i;
                j = 0;
                System.out.println();
            }
            arr[ i ][ j ] = i * j;
            System.out.format( "%3d", arr[ i ][ j ] );
        }
    }
}
