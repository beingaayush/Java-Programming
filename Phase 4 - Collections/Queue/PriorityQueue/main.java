import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add elements
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        // print queue
        System.out.println(pq); // unordered internally

        // peek (smallest element)
        System.out.println("Top: " + pq.peek());

        // remove (smallest element)
        System.out.println("Removed: " + pq.poll());

        // after removal
        System.out.println(pq);
    }
}


// Output behavior
// Inserted: 30, 10, 20

// PriorityQueue:
// Top → 10  (smallest)

// After poll:
// Top → 20