//by extending Thread class
// public class threads extends Thread {
//     public static void main(String[] args) {
//         threads thread1 = new threads();

//         thread1.start();

//         System.out.println("code is running outside the thread.");
//     }

//     public void run() {
//         System.out.println("code is running in a thread.");
//     }
// }

// by implementing Runnable interface
public class threads implements Runnable {
    public static void main(String[] args) {
        threads obj = new threads();
        Thread thread2 = new Thread(obj);
        thread2.start();
    }

    public void run() {
        System.out.println("code running inside threads");
    }
}
