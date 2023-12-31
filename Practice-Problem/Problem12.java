import java.util.*;

public class Problem12 {

    static Scanner sc = new Scanner(System.in);

    public static void matrixInput(int[][] mtr, int row, int col) {
        System.out.println("enter elements to store in matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] mtr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mtr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addMatrices(int[][] mtr1, int[][] mtr2, int[][] mtr3, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mtr3[i][j] = mtr1[i][j] + mtr2[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] mtr1 = new int[100][100];
        int[][] mtr2 = new int[100][100];
        int[][] mtr3 = new int[100][100];
        int row, col;

        System.out.println("enter number of rows & cols: ");
        row = sc.nextInt();
        col = sc.nextInt();

        matrixInput(mtr1, row, col);
        matrixInput(mtr2, row, col);

        printMatrix(mtr1, row, col);
        printMatrix(mtr2, row, col);

        addMatrices(mtr1, mtr2, mtr3, row, col);
        printMatrix(mtr3, row, col);
    }
}
