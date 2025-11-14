class MethodOverloading {
    void show(String message) {
        System.out.println("String: " + message);
    }
    void show(int number) {
        System.out.println("Integer: " + number);
    }
    void show(double value) {
        System.out.println("Double: " + value);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading ();

        m.show("Hello Java");
        m.show(100);
        m.show(3.14);
    }
}
