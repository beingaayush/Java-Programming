// Append
class Ex1{
    public static void main(String args[]){
        StringBuilder s = new StringBuilder("Hello");
        s.append("World");

        System.out.println(s);
    }
}


// output : Hello World
// No new object created.
// Same object is modified.
