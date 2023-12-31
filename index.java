import java.util.*;
// import java.util.Scanner;

public class index {
    // static methods can be used without object
    public static int Add(int x, int y, int z) {
        return x + y + z;
    }

    public static float Avg(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printString(char[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // constructor
    index(int x, int y) {
        this.num1 = x;
        this.num2 = y;
    }

    // this kind of methods can only be used with objects.
    private int sum() {
        return this.num1 + this.num2;
    }

    private int num1;
    int num2;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a, b, c;
            char ch;
            String str1;
            int[] marks = new int[5];
            char[] str = new char[100];

            // taking input in int variables
            System.out.println("Enter three numbers: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            // taking input for char
            ch = sc.next().charAt(0);
            str1 = sc.nextLine();

            int sum = Add(a, b, c);
            float avg = Avg(a, b, c);
            System.out.println(sum);
            System.out.println(avg);
            System.out.printf("%c\n", ch);
            System.out.println(str1);

            // taking input in an array
            System.out.println("Enter 5 elements to store: ");
            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
            }
            printArray(marks, 5);

            // taking input in char array
            System.out.println("Enter 5 length string: ");
            str = sc.next().toCharArray();
            printString(str, 5);

            // object creation
            index obj1 = new index(2, 3);
            int ans = obj1.sum();
            System.out.println(ans);
            System.out.println(obj1.num1);
            System.out.println(obj1.num2);
        }
    }
}
