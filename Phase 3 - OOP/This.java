// this = current object ko refer karta hai.
// Matlab jis object se method call hua hai, this usi object ko point karta hai.

class Car {
    String color;

    void setColor(String color) {
        this.color = color;
    }

    void printColor() {
        System.out.println(color);
    }
}

public class This {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("Red");
        c1.printColor();
    }
}