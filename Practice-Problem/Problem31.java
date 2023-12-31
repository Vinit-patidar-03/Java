abstract class TelePhone {
    public abstract void ring();

    public abstract void lift();

    public abstract void disconnect();
}

class SmartTelePhone extends TelePhone {
    public void ring() {
        System.out.println("ringing...");
    }

    public void ring(String str) {
        // function overloading
        System.out.println(str + " Your phone is ringing...");
    }

    public void lift() {
        System.out.println("lifting...");
    }

    public void disconnect() {
        System.out.println("disconnecting...");
    }
}

public class Problem31 {
    public static void main(String[] args) {
        SmartTelePhone sp = new SmartTelePhone();

        sp.disconnect();
        sp.lift();
        sp.ring("vinit");
        sp.ring();
    }
}
