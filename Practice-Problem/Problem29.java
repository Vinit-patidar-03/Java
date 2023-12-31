abstract class Pen {
    abstract public void write();

    abstract public void refill();
}

class newPen extends Pen {
    public void write() {
        System.out.println("writing...");
    }

    public void refill() {
        System.out.println("refill needed...");
    }

    public void changeNib() {
        System.out.println("changing Nib...");
    }
}

public class Problem29 {
    public static void main(String[] args) {
        newPen p = new newPen();

        p.write();
        p.refill();
        p.changeNib();
    }
}
