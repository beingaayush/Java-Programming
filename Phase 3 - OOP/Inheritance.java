// Inheritance in Java
// Inheritance = ek class dusri class ke properties aur methods inherit karti hai.

// Matlab:
// Parent class → Child class
// Child class parent ka code reuse kar sakti hai.
-----------------------------------------------------------------------------------
// Important Rule:
// Child class parent ke public / protected members use kar sakti hai.
// Private members inherit nahi hote.



class Animal {

    void eat(){
        System.out.println("Animal eats food");
    }

}

class Dog extends Animal {

    void bark(){
        System.out.println("Dog barks");
    }

}
public class Inheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // own method

    }
}


-------------------------------------------------------------------------------------------------------

//Multilevel Inheritance

class A {
    void showA(){
        System.out.println("Class A");
    }
}

class B extends A {
    void showB(){
        System.out.println("Class B");
    }
}

class C extends B {
    void showC(){
        System.out.println("Class C");
    }
}