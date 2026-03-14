// Abstraction in Java - achieved through 2 ways
// 1. Abstract class   - NOT REAL ABSTRACTION
// 2. Interface        - REAL / PURE ABSTRACTION

// | Feature              | Abstract Class                         | Interface                                         |
// | -------------------- | -------------------------------------- | ------------------------------------------------- |
// | Keyword              | `abstract class`                       | `interface`                                       |
// | Methods              | Can have **abstract + normal methods** | Methods are **abstract by default**               |
// | Variables            | Can have **normal variables**          | Variables are **public static final (constants)** |
// | Constructors         | **Allowed**                            | **Not allowed**                                   |
// | Inheritance          | Class **extends** abstract class       | Class **implements** interface                    |
// | Multiple Inheritance | **Not allowed**                        | **Allowed** (multiple interfaces)                 |
// | Implementation       | Can contain **partial implementation** | Mostly **no implementation** (pure abstraction)   |

---------------------------------------------------------------------------------------------------

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

------------------------------------------------

// Multiple Inheritance example:-
interface Human {
    void live();
}
interface Engineer {
    void code();
}
class alex implements Human, Engineer {
    public void live{
        System.out.println("live life");
    }
    public void code{
        System.out.println("he codes");
    }
}