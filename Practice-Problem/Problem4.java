import java.util.Scanner;

public class Problem4 {
    public static float kiloMeterToMiles(float km) {
        return 0.621371f * km;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float km;
            System.out.print("enter value in kms: ");
            km = sc.nextFloat();
            System.out.println("value in Miles is: " + kiloMeterToMiles(km));
        }
    }
}
