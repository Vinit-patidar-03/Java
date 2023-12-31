class Monkey {
    public void speak() {
        System.out.println("speaking...");
    }
}

class Human extends Monkey {
    @Override
    public void speak() {
        // method overriding
        System.out.println("Polymorphism: Human Speaking...");
    }
}

public class Problem32 {
    public static void main(String[] args) {
        Human h = new Human();
        h.speak();
    }
}
