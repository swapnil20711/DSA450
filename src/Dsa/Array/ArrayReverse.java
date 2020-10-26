package Dsa.Array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 45};
        int[] result;
        result = reverse(arr);
        for (int element : result) {
            System.out.print(element + " ");
        }

    }

    public static int[] reverse(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        while (start < end) {
            int temp;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;

    }
}
