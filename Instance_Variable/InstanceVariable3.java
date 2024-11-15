class A {
    int a;
    A(int a ){
        this.a = a;
        System.out.println(a);
    }
}

public class InstanceVariable3 {
    public static void main(String[] args) {
        A p =new A(78);
        new A(43);
    }
}
