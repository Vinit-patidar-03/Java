import java.util.*;

class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea() {
        System.out.println("Area of Rectangle is: " + length * width);
    }

    public void getPerimeter() {
        System.out.println("Perimeter of Rectangle is: " + 2 * (length + width));
    }
}

public class Problem25 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length, width;
        System.out.println("enter length and width of rectangle:");
        length = sc.nextInt();
        width = sc.nextInt();
        Rectangle r = new Rectangle(length, width);

        r.getArea();
        r.getPerimeter();
    }
}
