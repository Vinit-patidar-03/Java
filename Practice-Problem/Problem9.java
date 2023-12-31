import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float[] arr = new float[5];
            float sum = 0;
            int n = 5;
            System.out.println("Enter Numbers to store in array: ");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextFloat();
            }

            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            System.out.println(sum);

        }
    }
}
