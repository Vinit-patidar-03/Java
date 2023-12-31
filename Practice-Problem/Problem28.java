import java.util.*;

class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float getCircumference() {
        return (float) (2 * Math.PI * radius);
    }
}

class Cylinder extends Circle {

    private int height;

    Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}

public class Problem28 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int height, radius;

        System.out.println("enter the radius and height:");
        radius = sc.nextInt();
        height = sc.nextInt();

        Cylinder cy = new Cylinder(radius, height);

        System.out.println("Volume of Cylinder is: " + Math.PI * radius * radius * cy.getHeight());
        System.out.println("Surface Area of Cylinder is: " + 2 * Math.PI * radius * cy.getHeight());
    }
}
