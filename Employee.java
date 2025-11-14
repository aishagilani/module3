class Employee {
    int salary;
    String name;
    int getSalary() {
        return salary;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary = 80000;
        e.setName("Aisha");
        System.out.println(e.getSalary());
        System.out.println(e.getName());
    }
}
