import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // add at rear (queue style)
        dq.offer(10);
        dq.offer(20);
        dq.offer(30);

        // add at front
        dq.offerFirst(5);

        System.out.println(dq); // [5, 10, 20, 30]

        // peek
        System.out.println("Front: " + dq.peekFirst());
        System.out.println("Rear: " + dq.peekLast());

        // remove
        dq.pollFirst(); // remove from front
        dq.pollLast();  // remove from rear

        System.out.println(dq);
    }
}