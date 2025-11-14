import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        t top = stack.pop();
        System.out.println("Popped element: " + top);
        System.out.println("Stack after pop: " + stack);
        int peek = stack.peek();
        System.out.println("Top element using peek: " + peek);
        int search = stack.search(10);
        System.out.println("Position of 10 in stack: " + search);
    }
}
