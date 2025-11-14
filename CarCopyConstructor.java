class CarCopyConstructor {
    String model;
    int year;
    CarCopyConstructor(String m, int y) {
        model = m;
        year = y;
    }
    CarCopyConstructor(CarCopyConstructor c) {
        model = c.model;
        year = c.year;
    }
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args) {
        CarCopyConstructor c1 = new CarCopyConstructor("Honda", 2022);   
        CarCopyConstructor c2 = new CarCopyConstructor(c1);             
        System.out.println("Original Car:");
        c1.display();

        System.out.println("\nCopied Car:");
        c2.display();
    }
}

