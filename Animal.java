public class Animal {

    public String name;
    public int age;

    public void greet() {
        System.out.println("Welcome, Vinit Patidar");
    }

    public static void status() {
        System.out.println("Success");
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        // this way we can intialize an object
        Animal A = new Animal("Chimpu", 10);
        A.greet();

        status();
    }
}
