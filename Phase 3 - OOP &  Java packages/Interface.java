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