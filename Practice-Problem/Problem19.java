import java.util.*;

public class Problem19 {
    static Scanner sc = new Scanner(System.in);

    static int sumNatural(int startNum, int num) {
        // base case
        if (startNum == num) {
            return num;
        }

        // recursive call
        return startNum + sumNatural(startNum + 1, num);
    }

    public static void main(String[] args) {
        int num;

        System.out.println("enter number: ");
        num = sc.nextInt();

        System.out.println("sum of natural numbers is: " + sumNatural(0, num));
    }
}
