import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;

            System.out.print("enter your name: ");
            str = sc.nextLine();

            System.out.println("Hello " + str + ", have a good day");
        }
    }
}
