class Cellphone {
    void ringing() {
        System.out.println("ringing");
    }
    void vibrating() {
        System.out.println("vibrating");
    }
}
public class Main {
    public static void main(String[] args) {
        Cellphone c = new Cellphone();
        c.ringing();
        c.vibrating();
    }
}
