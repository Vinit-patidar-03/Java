import java.util.*;

public class Problem21 {
    static Scanner sc = new Scanner(System.in);

    static int nthFib(int num) {
        // base case
        if (num == 1 || num == 0) {
            return num;
        }

        // recursive call
        return nthFib(num - 2) + nthFib(num - 1);
    }

    public static void main(String[] args) {
        int num;

        System.out.println("enter the number:");
        num = sc.nextInt();

        System.out.println("Nth term of fibonacci series: " + nthFib(num));
    }
}
