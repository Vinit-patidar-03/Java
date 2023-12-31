import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num;
            System.out.print("enter number to check: ");
            num = sc.nextDouble();

            if (Math.floor(num) == num) {
                System.out.println("number is a Integer");
            } else {
                System.out.println("number is not a Integer");
            }
        }
    }
}
