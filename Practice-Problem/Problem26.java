import java.util.*;

class Circle {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Area of Circle is: " + Math.PI * radius * radius);
    }

    public void getPerimeter() {
        System.out.println("Perimeter of Circle is: " + 2 * Math.PI * radius);
    }
}

public class Problem26 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int radius;

        System.out.println("enter radius of circle:");
        radius = sc.nextInt();

        Circle c = new Circle(radius);

        c.getArea();
        c.getPerimeter();
    }
}
