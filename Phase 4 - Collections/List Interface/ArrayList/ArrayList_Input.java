import java.util.ArrayList;
import java.util.Scanner;
class main {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        ArrayList<Integer> arr  = new ArrayList<>();

        System.out.println("Enter array Size: ");
        int n = sc.nextInt();

        //Taking elements as input
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        // Printing the ArrayList
        System.out.println("Elements are: ");
        for(int x : arr){
            System.out.println(x + " ");
        }
    }
}