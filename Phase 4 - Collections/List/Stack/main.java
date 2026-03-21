import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // peek (top element)
        System.out.println("Top: " + stack.peek());

        // pop (remove top)
        System.out.println("Removed: " + stack.pop());

        // after pop
        System.out.println("Top after pop: " + stack.peek());
    }
}