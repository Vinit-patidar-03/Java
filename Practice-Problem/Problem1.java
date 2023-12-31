import java.util.Scanner;

public class Problem1 {

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;

            System.out.print("Enter three numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            System.out.println(sum(a, b, c));
        }
    }
}
