import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList that stores Integer values
        ArrayList<Integer> list = new ArrayList<>();           //list is variable name here

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding elements: " + list);

        // Accessing element using index
        System.out.println("Element at index 1: " + list.get(1));

        // Updating element at a specific index
        list.set(1, 50);   // replaces 20 with 50
        System.out.println("After update: " + list);

        // Removing element by index
        list.remove(0);    // removes element at index 0
        System.out.println("After removal: " + list);

        // Getting size of the ArrayList
        System.out.println("Size of list: " + list.size());

        // Traversing using for loop
        System.out.println("Traversal using for loop:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // Traversing using for-each loop
        System.out.println("Traversal using for-each loop:");
        for(int x : list){
            System.out.println(x);
        }

        // Checking if element exists
        System.out.println("Contains 30? " + list.contains(30));

        // Clearing the entire list
        list.clear();
        System.out.println("After clearing list: " + list);
    }
}