class Student {

    static String college = "VGU";   // static variable
    int age;                         // instance variable

    public static void main(String args[]) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 21;
        s2.age = 22;

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(Student.college);
    }
}