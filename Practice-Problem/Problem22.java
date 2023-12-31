class Employee {
    String name;
    int salary;

    Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }

    public void getSalary() {
        System.out.println(this.salary);
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Problem22 {

    public static void main(String[] args) {
        Employee user1 = new Employee(100, "Pappu");
        user1.getSalary();
        user1.getName();
        user1.setName("Ram");
        user1.getName();
        user1.getDetails();
    }
}
