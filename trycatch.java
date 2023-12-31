import java.util.Scanner;

public class trycatch {

    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("You are ready to get license");
        } else {
            throw new ArithmeticException("Your are not eligible for license");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Wrapper Classes is used to use Primitive Datatypes as Objects.
            Integer num;

            System.out.println("Enter Number: ");
            num = sc.nextInt();

            try {
                System.out.println(num);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("I will always run");
            }

            checkAge(10);
        }

    }
}
