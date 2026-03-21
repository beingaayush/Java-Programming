import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // enqueue using offer()
        q.offer(10);
        q.offer(20);
        q.offer(30);

        // print queue
        System.out.println(q);

        // peek (front)
        System.out.println("Front: " + q.peek());

        // dequeue
        System.out.println("Removed: " + q.poll());

        // after removal
        System.out.println(q);
    }
}