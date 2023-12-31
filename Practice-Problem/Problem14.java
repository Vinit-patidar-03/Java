import java.util.*;

public class Problem14 {
    static Scanner sc = new Scanner(System.in);

    static int findMaxOfArray(int[] arr, int size) {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int size;

        System.out.println("enter size of an array: ");
        size = sc.nextInt();

        System.out.println("enter elements to store in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("max of array is: " + findMaxOfArray(arr, size));
    }
}
