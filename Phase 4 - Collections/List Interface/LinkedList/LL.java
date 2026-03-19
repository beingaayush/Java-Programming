import java.util.*;

public class LL {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at beginning and end
        list.addFirst(5);
        list.addLast(40);

        // Print list
        System.out.println("List: " + list);

        // Access elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // Remove elements
        list.removeFirst();
        list.removeLast();

        // Print after removal
        System.out.println("After removal: " + list);
    }
}