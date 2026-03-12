// Taking String Input
import java.util.Scanner;
class Ex2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name = sc.next();   //one word input only
        String fullName = sc.nextLine();  //full line input

        System.out.println(name);
        System.out.println(fullName);
    }
}