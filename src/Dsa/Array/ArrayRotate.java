package Dsa.Array;

import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while (t > 0) {
            int n;
            n = scanner.nextInt();
            int i, temp;
            int[] a = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            temp = a[n - 1];
            for (i = n - 2; i >= 0; i--) {
                a[i + 1] = a[i];
            }
            a[0] = temp;
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            t--;
            System.out.println();
        }

    }
}
