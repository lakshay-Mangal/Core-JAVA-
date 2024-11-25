class A {
    String name = "kajal";
}

class B extends A {
    String name = "hello kajal";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
    }

}

public class SuperUsed {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
