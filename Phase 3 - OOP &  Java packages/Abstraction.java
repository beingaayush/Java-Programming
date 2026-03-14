// Abstraction in Java :-
// Abstraction = unnecessary details hide karna aur sirf important functionality dikhana.
// Example real world:- ATM machine
// Tum withdraw() use karte ho, lekin andar bank server kaise kaam kar raha hai wo nahi dekhte.
-----------------------------------------------------------------------
// Abstraction in Java - achieved through 2 ways
// 1. Abstract class   - NOT REAL ABSTRACTION
// 2. Interface        - REAL / PURE ABSTRACTION

// | Feature              | Abstract Class    | Interface           |
// | -------------------- | ----------------- | ------------------- |
// | Methods              | abstract + normal | mostly abstract     |
// | Variables            | normal            | public static final |
// | Inheritance          | `extends`         | `implements`        |
// | Multiple inheritance | no                | yes                 |

-----------------------------------------------------------------------

// Abstract Class :-   NOT REAL ABSTRACTION

// rules:
// must be declared with Abstarct keyword
// Object create nahi kar sakte
// Abstract method me body nahi hoti
// Child class ko abstract methods implement karne padte hain
// Normal (non-abstract) methods allowed
// Variables allowed
// Constructor allowed
// Abstract + non-abstract methods dono ho sakte hain

abstract class Animal {
    //normal method allowed here, user can also access it, NOT pure abstraction
    void eat() {
        System.out.println("Animal eats food");
    }

    abstract void sound();   // abstract method

}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }

}

public class Abstraction {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.sound();

        Cat c = new Cat();
        c.eat();
        c.sound();

    }

}