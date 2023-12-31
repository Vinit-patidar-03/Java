import java.util.*;

public class Problem18 {
    static Scanner sc = new Scanner(System.in);

    static void printPattern(int startRow, int rows) {
        // base case
        if (startRow == rows) {
            return;
        }

        // processing
        for (int i = 0; i < startRow + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // recursive call
        printPattern(startRow + 1, rows);
    }

    public static void main(String[] args) {
        int rows;

        System.out.println("enter the number of rows: ");
        rows = sc.nextInt();

        printPattern(0, rows);
    }
}
