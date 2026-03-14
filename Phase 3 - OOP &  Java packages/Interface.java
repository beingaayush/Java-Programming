// Abstraction in Java - Java me abstraction 2 ways se achieve hoti hai
// 1. Abstract class
// 2. Interface


// Abstract class VS Interface
// | Feature              | Abstract Class    | Interface           |
// | -------------------- | ----------------- | ------------------- |
// | Methods              | abstract + normal | mostly abstract     |
// | Variables            | normal            | public static final |
// | Inheritance          | `extends`         | `implements`        |
// | Multiple inheritance | no                | yes                 |
// -----------------------------------------------------------------------------------------------------

// Interface :- Interface = pure abstraction.
// Matlab: sirf method declaration implementation nahi

// rules:
// Interface ka object create nahi kar sakte
// Methods by default public abstract hote hain
// Variables by default public static final hote hain
// Class interface ko implements karti hai
// Interface methods implement karna mandatory hota hai
// Ek class multiple interfaces implement kar sakti hai
// Interface me constructor nahi hota
--------------------------------------------------------------------------------------------------

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}