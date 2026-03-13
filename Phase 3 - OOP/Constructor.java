// Constructor = special method jo object create hote time automatically run hota hai.
// Iska main kaam: object ko initialize karna.
// Basic Rules:
// Constructor ka name class ke same hota hai
// Constructor ka return type nahi hota
// Object create hote hi automatically call ho jata hai

// Example 1 - Default constructor (Non - parameterized)
class Car {

    Car() {
        System.out.println("Car object created");
    }

}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
    }
}

//output:- Car object Created
//Jab object bana → constructor automatically run ho gaya.

// -------------------------------------------------------------------------------------------

// Example 2 -
class Car {

    String color;

    Car() {
        color = "Red";
    }

    void printColor() {
        System.out.println(color);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printColor();
    }
}

//output: Red
//Object create hote hi color automatically set ho gaya.


// ----------------------------------------------------------------------------------------------


// Example 3 - Parameterized constructor
class Car{
    String color;
    car(String c){
        color = c;
    }
}
public class constructor{
    public static void main(String args[]){
        Car c1 = new Car("Blue");
    }
}

// Parameterized constructor using this keyword
class Car{
    String color;
    String model;
    car(String color, String model){
        this.color = color;
        this.model = model;
    }
}
public class Constructor{
    public static void main(String args[]){
        Car c1 = new Car("green", "Tesla");
    }
}


// ---------------------------------------------------------------------------------------------------------

// Constructor Overloading
// Ek hi class me multiple constructors ho sakte hain, bas parameters different hone chahiye.
// Isse bolte hain constructor overloading.
// Constructor overloading = same class me multiple constructors with different parameters.
class Car {

    String color;
    int speed;

    Car() {
        System.out.println("Default constructor");
    }

    Car(String color) {
        this.color = color;
    }

    Car(String color, int speed) {
        thi.color = color;
        thi.speed = speed;
    }

}
public class Constructor {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car("Red");
        Car c3 = new Car("Blue", 120);

    }
}

// Java automatically decide karega kaunsa constructor call hoga based on parameters.