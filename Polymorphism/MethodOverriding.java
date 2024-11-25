class A{
    void show(){
        System.out.println("A class show method");
    }
}
class B extends A{
    void show(){
        System.out.println("B class show method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
