//CAN BE USED TO ACHIEVE MULTIPLE INHERITENCE


interface A {
    void show();
}

class B implements A {
       public void show() {
        System.out.println("Interface Implement");
       }
    }

public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
