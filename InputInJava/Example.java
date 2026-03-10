// take input for a and b and return their sum
import java.util.*;
class Example{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a = ");
        int a = sc.nextInt();

        System.out.println("Enter b = ");
        int b = sc.nextInt();
       
        int sum = a+b;
        System.out.println("Sum = " + sum);
    }
}