class CellPhone {
    public void phoneRinging() {
        System.out.println("Phone Ringing...");
    }

    public void phoneVibrating() {
        System.out.println("Phone Vibrating...");
    }
}

public class Problem23 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();

        phone.phoneRinging();
        phone.phoneVibrating();

    }
}
