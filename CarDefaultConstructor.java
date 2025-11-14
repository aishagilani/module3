class CarDefaultConstructor {
    String model;
    int year;
    CarDefaultConstructor() {   
        model = "Unknown";
        year = 2020;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        CarDefaultConstructor c = new CarDefaultConstructor();  
        c.display();
    }
}
