public class Monkey extends Animal {

    public static void greetings() {
        System.out.println("Good Afternoon" + " Everybody");
    }

    Monkey(String name, int age) {
        // super keyword is used to call constructor of the immidiate parent class
        super(name, age);
    }

    public static void main(String[] args) {

        Monkey M = new Monkey("Pappu", 9);
        M.greet();

        System.out.println(M.name);
        System.out.println(M.age);

        status();
        greetings();
    }
}
