import java.util.*;

public class Problem13 {
    static Scanner sc = new Scanner(System.in);

    public static void reverse(int[] arr, int size) {
        int start = 0, end = size - 1, temp;

        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int size;

        System.out.println("enter size of an array: ");
        size = sc.nextInt();

        System.out.println("enter the elements to store in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, size);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}