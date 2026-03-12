// taking array input through user

import java.util.*;
class Ex1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
}