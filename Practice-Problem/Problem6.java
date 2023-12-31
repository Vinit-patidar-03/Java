import java.util.*;

public class Problem6 {

    public static String UpperCase(String st) {
        String newStr = "";

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                char ch = (char) (st.charAt(i) - 'a' + 'A');
                newStr = newStr + ch;
            } else {
                newStr = newStr + st.charAt(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            System.out.print("Enter a String: ");
            str = sc.nextLine();

            System.out.println(str.toUpperCase());
            System.out.println(UpperCase(str));

        }
    }
}
