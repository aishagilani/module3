class CarParameterizedConstructor {
    String model;
    int year;
    CarParameterizedConstructor(String m, int y) {
        model = m;
        year = y;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        CarParameterizedConstructor c1 = new CarParameterizedConstructor("Honda", 2022);
        CarParameterizedConstructor c2 = new CarParameterizedConstructor("BMW", 2024);
        System.out.println("Car 1:");
        c1.display();
        System.out.println("\nCar 2:");
        c2.display();
    }
}
