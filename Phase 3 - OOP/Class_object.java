// class = blueprint | Object = real instance created from that blueprint
class Car{
    String name;
    int speed;

    void start(){
        System.out.println("Car started");
    }
}

public class Class_object{
    public static void main(String args[]){
        Car c1 = new Car();   //object created;
        Car c2 = new Car();  //object created

        c1.name = "Fortuner";
        c1.speed = 120;
        c2.name = "virtus";
        c2.speed = 220;
        c1.start();
        c2.start();
    }
}


// Note:- we can also do this - public void start(){...} |
// its public now, we can use this func/method from any packages/Folder now.
// same project ke kisi other folder ke file me use kar skte hai

//when its only - void start(){...} | here no modifier, access only in this package/folder
//sirf isi folder ke files me access rhega

//when its - private void start(){...} | its private, access in the same class only