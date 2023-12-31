class threads1 extends Thread {
    public void run() {
        System.out.println("good morning");
    }
}

class threads2 extends Thread {
    public void run() {
        System.out.println("welcome");
    }
}

public class Problem34 {
    public static void main(String[] args) {
        threads1 t1 = new threads1();
        threads2 t2 = new threads2();

        t1.start();
        t2.start();
    }
}
