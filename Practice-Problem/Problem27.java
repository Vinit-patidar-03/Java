import java.util.*;

class Cylinder {
    private int radius;
    private int height;

    Cylinder(int radius, int heigth) {
        this.height = heigth;
        this.radius = radius;
    }

    public void setDetails(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void getDetails() {
        System.out.println("Volume of cylinder is: " + Math.PI * radius * radius * height + " m^3");
        System.out.println("Surface area of Cylinder is: " + 2 * Math.PI * radius * height + " m^2");
    }
}

public class Problem27 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int radius, height;
        System.out.println("enter radius(in m) and heigth(in m) of Cylinder is:");
        radius = sc.nextInt();
        height = sc.nextInt();

        Cylinder cy = new Cylinder(radius, height);

        // cy.setDetails(radius, height);
        cy.getDetails();
    }
}
