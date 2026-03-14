// Encapsulation in Java
// Encapsulation = data ko hide karna + controlled access dena.

// Iska basic rule:
// Private → variables
// access → public methods (getter / setter)

class Car {

    private int speed;
    //setter
    public void setSpeed(int s){
        if(s > 0){
            speed = s;
        }
    }
    //getter
    public int getSpeed(){
        return speed;
    }

}
public class Encapsulation {
    public static void main(String[] args) {

        Car c = new Car();

        c.setSpeed(100);

        System.out.println(c.getSpeed());
    }
}