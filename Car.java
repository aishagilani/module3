class Car {
    String model;
    int year;
    Car() {
        model = "Toyota";
        year = 2023;
    }
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
