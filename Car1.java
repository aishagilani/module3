class Car1{
    String model;
    int year;

    Car1(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car1 c = new Car1("Honda", 2022);
        c.display();
    }
}
