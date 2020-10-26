package Dsa.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t > 0) {
            int n1, n2, i, cnt = 0;
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            int[] a = new int[n1 + n2 ];
            for (i = 0; i <= n1 + n2 - 1; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for (i = 0; i <= n1 + n2 - 2; i++) {
                if (a[i] != a[i + 1] ) {
                    cnt++;
                }
            }
            System.out.println(cnt + 1);
            t--;

        }
    }
}
