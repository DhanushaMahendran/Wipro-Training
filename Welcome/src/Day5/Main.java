package Day5;

interface A {
    void display();
}

interface B {
    void display();
}

interface C {
    void display();
}

class MyClass implements A, B, C {
    public void display() {
        System.out.println("Display method from MyClass");
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // Direct call

        // Call through interface references
        A aRef = obj;
        B bRef = obj;
        C cRef = obj;

        aRef.display();
        bRef.display();
        cRef.display();
    }
}

