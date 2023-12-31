import java.util.*;

public class Problem17 {
    static Scanner sc = new Scanner(System.in);

    static void printMultiplication(int n, int multiplier) {
        // base case
        if (multiplier == 10) {
            System.out.println(multiplier * n);
            return;
        }

        // tail recursion to print multiplication table
        System.out.println(multiplier++ * n);
        printMultiplication(n, multiplier);
    }

    public static void main(String[] args) {
        int num;

        System.out.println("enter the number: ");
        num = sc.nextInt();

        printMultiplication(num, 1);

    }
}
