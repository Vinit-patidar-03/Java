import java.util.*;

public class Problem10 {
    public static boolean isPresent(int[] arr, int size, int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[100];
            int size, num;

            System.out.println("enter the size of array: ");
            size = sc.nextInt();

            System.out.println("enter number to check: ");
            num = sc.nextInt();

            System.out.println("enter elements to store in array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            if (isPresent(arr, size, num)) {
                System.out.println("number present in array.");
            } else {
                System.out.println("number is not present in array.");
            }
        }
    }
}
