import java.util.*;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Push elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }

        // Display stack
        System.out.println("Stack: " + stack);

        // Peek (top element)
        if (!stack.isEmpty()) {
            System.out.println("Top element (peek): " + stack.peek());
        }

        // Pop element
        if (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Traverse stack (LIFO order)
        System.out.println("Traversing stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
}