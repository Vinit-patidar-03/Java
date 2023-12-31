import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String str;
            String letter = "Dear <name>, Thanks a lot";

            System.out.println("Enter Name: ");
            str = sc.nextLine();

            String str2 = str.replaceAll(" ", "_");

            System.out.println(str2);
            System.out.println(letter.replaceAll("<name>", str2));

        }
    }
}
