//It is acting like a template for Human class. we have to implement method which we have declared abstract in Human class then only a concrete class will form.
abstract class Abstract {
    abstract public void greet();
}

class Human extends Abstract {
    public void greet() {
        System.out.println("bark");
    }
}

interface bike {
    public void speed();

    public void sound();
}

class bullet implements bike {
    public void speed() {
        System.out.println("Very Fast");
    }

    public void sound() {
        System.out.println("bud, bud, bud ....");
    }

    public static void main(String[] args) {

        bullet b = new bullet();

        b.speed();
        b.sound();

        Human H = new Human();
        H.greet();
    }
}