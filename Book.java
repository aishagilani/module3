class Book {
    String title;
    String author;
    double price;
    Book() {
        title = "";
        author = "";
        price = 0;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James");
        Book b3 = new Book("Python", "Guido", 499);

        System.out.println(b2.title + " " + b2.author);
        System.out.println(b3.title + " " + b3.author + " " + b3.price);
    }
}
