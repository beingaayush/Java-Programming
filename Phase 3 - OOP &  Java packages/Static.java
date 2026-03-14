// static keyword makes a variable or method common for all objects of the class.
// It belongs to the class itself, not to individual objects.
// Because of this, there is only one shared copy, and it can be accessed using the class name.

class Student {
    static String college = "VGU";  // common for all students
    String name;                    // different for each student
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aayush";
        s2.name = "Archana";

        System.out.println(s1.name + " " + Student.college);
        System.out.println(s2.name + " " + Student.college);
    }
}


// Output
Aayush VGU
Archana VGU