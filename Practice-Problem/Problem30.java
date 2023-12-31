class Monkey {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("biting...");
    }
}

interface BasicAnimal {
    public void eat();

    public void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}

public class Problem30 {
    public static void main(String[] args) {
        Human h = new Human();

        h.bite();
        h.eat();
        h.jump();
        h.sleep();
    }
}
