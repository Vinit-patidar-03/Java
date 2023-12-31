import java.util.*;

class Square {
    private int side;

    Square(int side) {
        this.side = side;
    }

    public void getArea() {
        System.out.println("Area of Square: " + side * side);
    }

    public void getPerimeter() {
        System.out.println("Perimeter of Square: " + 4 * side);
    }
}

public class Problem24 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int side;

        System.out.println("enter the value of side:");
        side = sc.nextInt();

        Square s = new Square(side);

        s.getArea();
        s.getPerimeter();
    }
}
