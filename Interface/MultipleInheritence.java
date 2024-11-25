interface A {
    void show();
}

interface B {
    void show2();
}
class C implements  A ,B {
    public void show(){
        System.out.println("A interface implement");
    }
    public void show2() {
        System.out.println("B interface implement");
    }
}

public class MultipleInheritence {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show2();
    }
}
