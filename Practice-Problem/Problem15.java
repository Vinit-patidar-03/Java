import java.util.*;

public class Problem15 {
    static Scanner sc = new Scanner(System.in);

    static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int elem : arr) {
            if (min > elem) {
                min = elem;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int size;

        System.out.println("enter size of an array: ");
        size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("min of array is: " + minOfArray(arr));
    }
}
