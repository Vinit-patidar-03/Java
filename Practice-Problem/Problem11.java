import java.util.*;

public class Problem11 {

    public static float averageMarks(int[] arr, int students) {
        float sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum / students;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] marks = new int[100];
            int students;

            System.out.println("enter number of students: ");
            students = sc.nextInt();

            System.out.println("enter marks of students: ");
            for (int i = 0; i < students; i++) {
                marks[i] = sc.nextInt();
            }

            System.out.println(averageMarks(marks, students));
        }
    }
}
