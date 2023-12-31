import java.util.*;

public class Problem16 {
    static Scanner sc = new Scanner(System.in);

    static boolean isSorted(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int size;

        System.out.println("enter size of an sorted array: ");
        size = sc.nextInt();

        System.out.println("enter elements to store in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr, size)) {
            System.out.println("array is sorted.");
        } else {
            System.out.println("array is not sorted.");
        }
    }
}
