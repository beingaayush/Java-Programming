import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Enqueue
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            q.add(x);   // enqueue
        }

        // Display queue
        System.out.println("Queue: " + q);

        // Peek (front element)
        if (!q.isEmpty()) {
            System.out.println("Front (peek): " + q.peek());
        }

        // Dequeue
        if (!q.isEmpty()) {
            System.out.println("Removed (dequeue): " + q.poll());
        }

        // After dequeue
        System.out.println("Queue after removal: " + q);

        // Traversal
        System.out.println("Traversing queue:");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }

        sc.close();
    }
}