// Polymorphism in Java
// Polymorphism = same method name, different behavior.
// Simple words: ek hi method alag-alag tarike se behave kare.

// Java me 2 types hote hain.
// 1. Compile-time polymorphism
// 2. Runtime polymorphism

-----------------------------------------------------------------------

// 1️⃣ Compile-Time Polymorphism (Method Overloading)
// Same method name but different parameters.
// Java decide karta hai compile time pe kaunsa method call hoga.

class MathUtil {

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

}
public class Polymorphism {
    public static void main(String[] args) {

        MathUtil m = new MathUtil();

        System.out.println(m.add(2,3));
        System.out.println(m.add(2,3,4));
    }
}

---------------------------------------------------------------------------

// 2️⃣ Runtime Polymorphism (Method Overriding)
// Parent class ke method ko child class override karta hai.
// Java decide karta hai runtime pe kaunsa method run hoga.

class Animal {

    void sound(){
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {

    void sound(){
        System.out.println("Dog barks");
    }

}
public class Polymorphism {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.sound();

    }
}

//output:- Dog barks