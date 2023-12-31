import java.util.*;

public class Problem8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String str;

            System.out.println("enter string to detect: ");
            str = sc.nextLine();

            if (str.contains("  ") && str.contains("   ")) {
                System.out.println("double and triple spaces exist");
            } else {
                System.out.println("double and triple spaces don't exist");
            }

        }
    }
}
