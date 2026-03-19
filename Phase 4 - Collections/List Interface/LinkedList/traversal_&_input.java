// Simple linkedList traversal with user input
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        // Input lena
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }

        // Traversal (for-each)
        System.out.print("LinkedList elements: ");
        for (int val : list) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}