import java.util.Scanner;

public class Problem2 {
    public static float calculateCGPA(float a, float b, float c) {
        return (a + b + c) * 10 / 300;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sub1, sub2, sub3;

            System.out.print("Enter Marks of Three Subjects out of 100: ");
            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();

            System.out.println(calculateCGPA(sub1, sub2, sub3));
        }
    }
}
