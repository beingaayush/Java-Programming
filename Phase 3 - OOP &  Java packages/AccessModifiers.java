Access Level:
| Modifier  | Same Class | Same Package | Subclass | Other Package  |
| --------- | ---------- | ------------ | -------- | -------------  |
| public    | ✔          | ✔            | ✔        | ✔            |
| protected | ✔          | ✔            | ✔        | ✖            |
| default   | ✔          | ✔            | ✖        | ✖            |
| private   | ✔          | ✖            | ✖        | ✖            |
----------------------------------------------------------------------

class AccessDemo {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;   // default

    public void showPublic() {
        System.out.println("Public method");
    }

    private void showPrivate() {
        System.out.println("Private method");
    }

    protected void showProtected() {
        System.out.println("Protected method");
    }

    void showDefault() {
        System.out.println("Default method");
    }

    void accessInsideSameClass() {
        System.out.println("Inside same class:");
        System.out.println(a); // public
        System.out.println(b); // private
        System.out.println(c); // protected
        System.out.println(d); // default

        showPublic();
        showPrivate();
        showProtected();
        showDefault();
    }
}

class TestAccess {
    void accessFromSamePackage() {
        AccessDemo obj = new AccessDemo();

        System.out.println("From another class in same package:");
        System.out.println(obj.a); // public
        // System.out.println(obj.b); // private -> not accessible
        System.out.println(obj.c); // protected
        System.out.println(obj.d); // default

        obj.showPublic();
        // obj.showPrivate(); // private -> not accessible
        obj.showProtected();
        obj.showDefault();
    }
}

public class Main {
    public static void main(String[] args) {
        AccessDemo obj1 = new AccessDemo();
        obj1.accessInsideSameClass();

        System.out.println();

        TestAccess obj2 = new TestAccess();
        obj2.accessFromSamePackage();
    }
}