class Rectangle {
    int length;
    int breadth;
    Rectangle() {
        length = 4;
        breadth = 5;
    }
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r1.length + " " + r1.breadth);
        System.out.println(r2.length + " " + r2.breadth);
    }
}
